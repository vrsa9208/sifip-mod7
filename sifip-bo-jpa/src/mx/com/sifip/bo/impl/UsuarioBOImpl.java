/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.bo.impl;

import java.util.List;
import mx.com.sifip.bo.PerfilBO;
import mx.com.sifip.bo.UsuarioBO;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.dao.UsuarioDAO;
import mx.com.sifip.dao.exception.SifipDaoException;
import mx.com.sifip.dao.impl.UsuarioDAOImpl;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
public class UsuarioBOImpl implements UsuarioBO{
    
    private UsuarioDAO dao;
    
    public UsuarioBOImpl(){
        this.dao = new UsuarioDAOImpl();
    }
    
    @Override
    public Usuario registrar(Usuario usuario) throws SifipBoException {
        if(usuario == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        try{
            PerfilBO perfilBO = new PerfilBOImpl();
            usuario.setPerfil(perfilBO.getById(usuario.getPerfil().getId()));
            return dao.add(usuario);
        } catch(SifipDaoException ex){
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error al registrar en la BD");
        }
    }

    @Override
    public void desactivar(Usuario usuario) throws SifipBoException {
        if(usuario == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        usuario.setActivo(false);
        actualizar(usuario);
    }

    @Override
    public void activar(Usuario usuario) throws SifipBoException {
        if(usuario == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        usuario.setActivo(true);
        actualizar(usuario);
    }

    @Override
    public Usuario actualizar(Usuario usuario) throws SifipBoException {
        if(usuario == null){
            throw new SifipBoException("Se ha ingresado un objeto con valor null");
        }
        try{
            return dao.update(usuario);
        } catch(SifipDaoException ex){
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error al actualizar registro en la BD");
        }
    }

    @Override
    public List<Usuario> getAll() throws SifipBoException {
        try{
            return dao.getAll();
        } catch(SifipDaoException ex){
            ex.printStackTrace();
            throw new SifipBoException("Error al recuperar datos");
        }
    }

    @Override
    public Usuario getById(int id) throws SifipBoException {
        try{
            return dao.getById(id);
        } catch(SifipDaoException ex){
            ex.printStackTrace();
            throw new SifipBoException("Error al recuperar datos");
        }
    }
    
}
