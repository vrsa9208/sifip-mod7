/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.dao;

import java.io.Serializable;
import java.util.List;
import mx.com.sifip.dao.exception.SifipDaoException;

/**
 *
 * @author Administrador
 */
public interface GenericDAO <T, Id extends Serializable>{
    
    public T add(T objeto) throws SifipDaoException;
    public T update(T objeto) throws SifipDaoException;
    public void delete(T objeto) throws SifipDaoException;
    public List<T> getAll() throws SifipDaoException;
    public T getById(Integer id) throws SifipDaoException;
    
}
