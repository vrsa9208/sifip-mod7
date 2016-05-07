/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.facade;

import java.util.List;
import javax.ejb.Remote;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
@Remote
public interface UsuarioFacade {
    Usuario registrarUsuario(Usuario usuario) throws SifipBoException;
    void desactivarUsuario(int id) throws SifipBoException;
    void activarUsuario(int id) throws SifipBoException;
    Usuario actualizarUsuario(Usuario usuario) throws SifipBoException;
    List<Usuario> getAllUsuarios() throws SifipBoException;
    Usuario getUsuarioById(int id) throws SifipBoException;
}
