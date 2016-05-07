/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.eap.ejb;

import javax.ejb.Local;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
@Local
public interface UsuarioEJB {
    
    public Usuario add(Usuario usuario) throws SifipBoException;
}
