/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sifip.test.client;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.sifip.bo.exception.SifipBoException;
import mx.com.sifip.facade.UsuarioFacade;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Sifip Test Client");
        try {
            // Generar contexto con Jboss
            Context context = getContext();
            UsuarioFacade facade = (UsuarioFacade) context.lookup("sifip-eap/sifip-eap-ejb.jar/UsuarioFacadeImpl!remote");
            try {
               facade.registrarUsuario(null);
               facade.actualizarUsuario(null);
               facade.activarUsuario(1);
               facade.desactivarUsuario(1);
               facade.getAllUsuarios();
               facade.getUsuarioById(1);
                
            } catch (NullPointerException e) {
                System.out.println("Se encontró un valor nulo, imposible continuar.");
            } catch (SifipBoException ex) {
                ex.printStackTrace(System.out);
                System.out.println(ex.getMessage());
            }
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }

    private static Context getContext() throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY,
                "org.jnp.interfaces.NamingContextFactory");
        props.put(Context.PROVIDER_URL, "jnp://localhost:1099");
        props.put(InitialContext.URL_PKG_PREFIXES,
                "org.jboss.naming:org.jnp.interfaces");
        Context ctx = new InitialContext(props);
        return ctx;
    }
}
