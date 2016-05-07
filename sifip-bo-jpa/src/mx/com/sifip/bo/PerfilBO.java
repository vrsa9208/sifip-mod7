/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.bo;

import java.util.List;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.model.jpa.Perfil;

/**
 *
 * @author Administrador
 */
public interface PerfilBO {
    
    Perfil registrar(Perfil perfil) throws SifipBoException;
    void eliminar(Perfil perfil) throws SifipBoException;
    Perfil actualizar(Perfil perfil) throws SifipBoException;
    List<Perfil> getAll() throws SifipBoException;
    Perfil getById(int id) throws SifipBoException;
    
}
