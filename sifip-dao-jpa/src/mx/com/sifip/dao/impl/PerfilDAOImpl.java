/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.dao.impl;

import java.io.Serializable;
import mx.com.sifip.dao.PerfilDAO;
import mx.com.sifip.model.jpa.Perfil;

/**
 *
 * @author Administrador
 */
public class PerfilDAOImpl extends GenericDAOImpl<Perfil, Integer> implements PerfilDAO{
    
    public PerfilDAOImpl(){
        super(Perfil.class);
    }
    
}
