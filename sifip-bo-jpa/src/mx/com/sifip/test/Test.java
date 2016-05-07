/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.test;

import java.util.GregorianCalendar;
import mx.com.sifip.bo.PerfilBO;
import mx.com.sifip.bo.UsuarioBO;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.bo.impl.PerfilBOImpl;
import mx.com.sifip.bo.impl.UsuarioBOImpl;
import mx.com.sifip.model.jpa.Perfil;
import mx.com.sifip.model.jpa.Usuario;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Administrador
 */
public class Test {
    public static void main(String[] args) throws SifipBoException {
        System.out.println("Test Usuario BO");
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Víctor");
        usuario.setPrimer_apellido("Santiago");
        usuario.setSegundo_apellido("Sánchez");
        usuario.setEmail("vrsa9210@gmail.com");
        usuario.setActivo(true);
        Perfil perfil = new Perfil();
        perfil.setId(1);
        usuario.setPerfil(perfil);
        usuario.setPassword(DigestUtils.sha1Hex("password").getBytes());
        usuario.setFecha_creacion(new GregorianCalendar().getTime());
        
        UsuarioBO boUsuario = new UsuarioBOImpl();
        try{
            boUsuario.registrar(usuario);
        } catch(SifipBoException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
