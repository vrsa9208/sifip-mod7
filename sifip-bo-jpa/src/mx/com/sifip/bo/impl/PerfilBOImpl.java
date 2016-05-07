/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.bo.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.sifip.bo.PerfilBO;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.dao.PerfilDAO;
import mx.com.sifip.dao.exception.SifipDaoException;
import mx.com.sifip.dao.impl.PerfilDAOImpl;
import mx.com.sifip.model.jpa.Perfil;

/**
 *
 * @author Administrador
 */
public class PerfilBOImpl implements PerfilBO{
    
    private PerfilDAO dao;
    
    public PerfilBOImpl(){
        this.dao = new PerfilDAOImpl();
    }

    @Override
    public Perfil registrar(Perfil perfil) throws SifipBoException {
        if(perfil == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        try{
            return dao.add(perfil);
        } catch(SifipDaoException ex){
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error al registrar en la BD");
        }
    }

    @Override
    public void eliminar(Perfil perfil) throws SifipBoException {
        if(perfil == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        try{
            dao.delete(perfil);
        } catch(SifipDaoException ex){
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error al eliminar registro en la BD");
        }
    }

    @Override
    public Perfil actualizar(Perfil perfil) throws SifipBoException {
        if(perfil == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        try{
            return dao.update(perfil);
        } catch(SifipDaoException ex){
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error al actualizar registro en la BD");
        }
    }

    @Override
    public List<Perfil> getAll() throws SifipBoException {
        try{
            return dao.getAll();
        } catch(SifipDaoException ex){
            ex.printStackTrace();
            throw new SifipBoException("Error al recuperar datos");
        }
    }

    @Override
    public Perfil getById(int id) throws SifipBoException {
        try{
            return dao.getById(id);
        } catch(SifipDaoException ex){
            ex.printStackTrace();
            throw new SifipBoException("Error al recuperar datos");
        }
    }
    
}
