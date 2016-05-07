/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.eap.ejb.impl;

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
    
    private final UsuarioBO bo;
    
    public UsuarioEJBImpl(){
        bo = new UsuarioBOImpl();
    }

    @Override
    public Usuario add(Usuario usuario) throws SifipBoException {
        return bo.registrar(usuario);
    }
    
}
