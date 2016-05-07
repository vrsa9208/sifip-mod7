/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.eap.ejb.impl;

import java.util.List;
import javax.ejb.Stateless;
import mx.com.sifip.bo.UsuarioBO;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.bo.impl.UsuarioBOImpl;
import mx.com.sifip.eap.ejb.UsuarioEJB;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
@Stateless
public class UsuarioEJBImpl implements UsuarioEJB{
    
    private Class clase;
    
    public UsuarioEJBImpl(){
        clase = this.getClass();
    }

    @Override
    public Usuario registrar(Usuario usuario) throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".registrar()");
        return usuario;
    }

    @Override
    public void desactivar(Usuario usuario) throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".desactivar()");
    }

    @Override
    public void activar(Usuario usuario) throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".activar()");
    }

    @Override
    public Usuario actualizar(Usuario usuario) throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".actualizar()");
        return usuario;
    }

    @Override
    public List<Usuario> getAll() throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".getAll()");
        return null;
    }

    @Override
    public Usuario getById(int id) throws SifipBoException {
        //Aquí haría la llamada a bo. Dado que no está configurado el Data Source, solo mandaré un mensaje
        System.out.println("Llamada a " + clase.getSimpleName() + ".getById()");
        return null;
    }
    
}
