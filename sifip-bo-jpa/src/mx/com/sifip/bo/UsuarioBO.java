/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.bo;

import java.util.List;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.model.jpa.Usuario;

/**
 *
 * @author Administrador
 */
public interface UsuarioBO {
    
    Usuario registrar(Usuario usuario) throws SifipBoException;
    void desactivar(Usuario usuario) throws SifipBoException;
    void activar(Usuario usuario) throws SifipBoException;
    Usuario actualizar(Usuario usuario) throws SifipBoException;
    List<Usuario> getAll() throws SifipBoException;
    Usuario getById(int id) throws SifipBoException;
    
}
