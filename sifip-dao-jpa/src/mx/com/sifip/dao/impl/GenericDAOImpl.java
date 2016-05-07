/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.dao.impl;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import mx.com.sifip.dao.GenericDAO;
import mx.com.sifip.dao.exception.SifipDaoException;

/**
 *
 * @author Administrador
 */
public class GenericDAOImpl<T, Id extends Serializable> implements GenericDAO<T, Id> {

    private final Class<T> clase;

    protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory("SifipDaoPU");

    public GenericDAOImpl(Class<T> clase) {
        this.clase = clase;
    }

    @Override
    public T add(T objeto) throws SifipDaoException {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(objeto);
            em.getTransaction().commit();
            em.refresh(objeto);
            return objeto;
        } catch (PersistenceException e) {
            e.printStackTrace(System.out);
            throw new SifipDaoException("Ocurrió un error en " + clase.getSimpleName() + "Dao.add(), causado por: " + e.getCause());
        } finally {
            em.close();
        }
    }

    @Override
    public T update(T objeto) throws SifipDaoException {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        try {
            T resultado = null;
            resultado = em.merge(objeto);
            em.getTransaction().commit();
            return resultado;
        } catch (PersistenceException e) {
            e.printStackTrace(System.out);
            throw new SifipDaoException("Ocurrió una excepción un error en " + clase.getSimpleName() + "Dao.update(), causado por: ", e.getCause());
        } finally {
            em.close();
        }
    }

    @Override
    public void delete(T objeto) throws SifipDaoException {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        try {
            if (em.find(objeto.getClass(), objeto) != null) {
                em.remove(objeto);
            } else {
                System.out.println("El objeto " + objeto.toString() + " no se encuentra registrado en la BD.");
            }
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            e.printStackTrace(System.out);
            throw new SifipDaoException("Ocurrió un error en " + clase.getSimpleName() + "Dao.delete(), causado por: " + e.getCause());
        } finally {
            em.close();
        }
    }

    @Override
    public List<T> getAll() throws SifipDaoException {
        EntityManager em = factory.createEntityManager();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT obj FROM ").append(clase.getSimpleName()).append(" obj");
            TypedQuery<T> query = em.createQuery(sql.toString(), clase);
            return query.getResultList();
        } catch (PersistenceException e) {
            e.printStackTrace(System.out);
            throw new SifipDaoException("Ocurrió un error en " + clase.getSimpleName() + "Dao.getAll(), causado por: " + e.getCause());
        } finally {
            em.close();
        }
    }

    @Override
    public T getById(Integer id) throws SifipDaoException {
        EntityManager em = factory.createEntityManager();
        try {
            return em.find(clase, id);
        } catch (PersistenceException e) {
            e.printStackTrace(System.out);
            throw new SifipDaoException("Ocurrió un error en " + clase.getSimpleName() + "Dao.getById(), causado por: " + e.getCause());
        } finally {
            em.close();
        }
    }

}
