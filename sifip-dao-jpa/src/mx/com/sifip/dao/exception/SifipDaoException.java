/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.dao.exception;

/**
 *
 * @author Administrador
 */
public class SifipDaoException extends Exception{
    
    public SifipDaoException(){}
    
    public SifipDaoException(String message){
        super(message);
    }
    
    public SifipDaoException(Throwable cause){
        super(cause);
    }
    
    public SifipDaoException(String message, Throwable cause){
        super(message, cause);
    }
}
