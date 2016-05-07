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
import mx.com.sifip.eap.ejb.UsuarioEJB;
import mx.com.sifip.facade.UsuarioFacade;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
@Stateless
public class UsuarioFacadeImpl implements UsuarioFacade{
    
    private Class clase;
    
    public UsuarioFacadeImpl(){
        clase = this.getClass();
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".registrarUsuario()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            return usuarioEJB.registrar(usuario);
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }

    @Override
    public void desactivarUsuario(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".desactivarUsuario()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            usuarioEJB.desactivar(usuarioEJB.getById(id));
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }

    @Override
    public void activarUsuario(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".activarUsuario()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            usuarioEJB.activar(usuarioEJB.getById(id));
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".actualizarUsuario()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            return usuarioEJB.actualizar(usuario);
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }

    @Override
    public List<Usuario> getAllUsuarios() throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".getAllUsuarios()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            return usuarioEJB.getAll();
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }

    @Override
    public Usuario getUsuarioById(int id) throws SifipBoException {
        System.out.println("Llamada a " + clase.getSimpleName() + ".getUsuarioById()");
        try {
            Context context = new InitialContext();
            UsuarioEJB usuarioEJB = (UsuarioEJB) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioEJBImpl!local");            
            return usuarioEJB.getById(id);
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
            throw new SifipBoException("Error en la conexion con el EJB");
        }
    }
}
