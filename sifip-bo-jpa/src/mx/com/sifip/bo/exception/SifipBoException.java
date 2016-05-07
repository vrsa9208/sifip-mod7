/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.bo.exception;

/**
 *
 * @author Administrador
 */
public class SifipBoException extends Exception{
    
    public SifipBoException(){}
    
    public SifipBoException(String message){
        super(message);
    }
    
    public SifipBoException(Throwable cause){
        super(cause);
    }
    
    public SifipBoException(String message, Throwable cause){
        super(message, cause);
    }
}
