/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import mx.com.sifip.dao.UsuarioDAO;
import mx.com.sifip.dao.exception.SifipDaoException;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO{

    public UsuarioDAOImpl() {
        super(Usuario.class);
    }

    @Override
    public Usuario add(Usuario objeto) throws SifipDaoException {
        return super.add(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario objeto) throws SifipDaoException {
        super.delete(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getAll() throws SifipDaoException {
        return super.getAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getById(Integer id) throws SifipDaoException {
        return super.getById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario update(Usuario objeto) throws SifipDaoException {
        return super.update(objeto); //To change body of generated methods, choose Tools | Templates.
    }
    
}
