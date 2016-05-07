/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.eap.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.sifip.bo.PerfilBO;
import mx.com.sifip.bo.UsuarioBO;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.bo.impl.PerfilBOImpl;
import mx.com.sifip.bo.impl.UsuarioBOImpl;
import mx.com.sifip.facade.UsuarioFacade;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
@Stateful
public class UsuarioFacadeImpl implements UsuarioFacade{
    
    private Class clase;
    private final UsuarioBO bo;
    
    public UsuarioFacadeImpl(){
        clase = this.getClass();
        bo = new UsuarioBOImpl();
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) throws SifipBoException {
        System.out.println("Llamada a " + clase + ".registrarUsuario()");
        return usuario;
    }

    @Override
    public void desactivarUsuario(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase + ".desactivarUsuario()");
    }

    @Override
    public void activarUsuario(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase + ".activarUsuario()");
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) throws SifipBoException {
        System.out.println("Llamada a " + clase + ".actualizarUsuario()");
        return usuario;
    }

    @Override
    public List<Usuario> getAllUsuarios() throws SifipBoException {
        System.out.println("Llamada a " + clase + ".getAllUsuarios()");
        return new ArrayList<Usuario>();
    }

    @Override
    public Usuario getUsuarioById(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase + ".getUsuarioById()");
        return null;
    }
}
