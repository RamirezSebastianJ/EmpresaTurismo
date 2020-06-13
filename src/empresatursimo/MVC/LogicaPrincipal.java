
package empresatursimo.MVC;

import empresatursimo.Paquetes.PaquetesTurismo;
import empresatursimo.Usuarios.Usuario;
import ConexionMySQL.Base;
import ConexionMySQL.PaqueteMySQL;
import ConexionMySQL.UsuarioMySQL;
import java.util.ArrayList;
import java.util.List;


public class LogicaPrincipal {
    
    Base base = new Base ();
    UsuarioMySQL usuarioMySQL = new UsuarioMySQL();
    PaqueteMySQL paqueteMySQL = new PaqueteMySQL();
    
    //para los paquetes
    public static PaquetesTurismo paquete = new PaquetesTurismo();
    public static List<PaquetesTurismo> paquetes = new ArrayList<PaquetesTurismo>();
    
    //para los usuarios
    public static Usuario usuario = new Usuario();
    public static List<Usuario> usuarios = new ArrayList<Usuario>();

    public LogicaPrincipal() {
        usuarios = usuarioMySQL.select();
        paquetes = paqueteMySQL.select();
    }
    
    //metodos
    
    /*
    *Login
    */
    
    public boolean login (String login, String pass, int tipo){
        //System.out.println("Tamano: " + usuarios.size());
        for(int i = 0; i < usuarios.size(); i++){
            usuario = usuarios.get(i);
            System.out.println("Tipo: " + usuario.getTipo_usuario_idtipo_usuario());
            if(tipo == usuario.getTipo_usuario_idtipo_usuario()){
                if(login.equals(usuario.getLogin()) && pass.equals(usuario.getPass())){
                    System.out.println("Entra");
                    return true;
                }
            }
        }
        
        return false;
    }         
    
    /*
    *Nuevo Usuario
    */
    
    public boolean registrar (Usuario auxiliarUsuario){
        System.out.println("Login: " + auxiliarUsuario.getLogin() + " Pass: " + auxiliarUsuario.getPass() + "Tipo: " + auxiliarUsuario.getTipo_usuario_idtipo_usuario());
        usuarioMySQL.insert(auxiliarUsuario.getLogin(), auxiliarUsuario.getPass(), auxiliarUsuario.getTipo_usuario_idtipo_usuario());
        usuarios = usuarioMySQL.select();
        
        boolean condicion = login(auxiliarUsuario.getLogin(), auxiliarUsuario.getPass(), auxiliarUsuario.getTipo_usuario_idtipo_usuario());
        if(condicion){
            return true;
        }
        return false;
    }
    
    
    /*
    *Buscar Paquete
    */
    public boolean buscarPaquete (PaquetesTurismo paquete){
        for(int i = 0; i < paquetes.size(); i++){
            this.paquete = paquetes.get(i);
            if(paquete == this.paquete){
               return true; 
            }
        }
        return false;
    }
    
    
    /*
    *Nuevo Paquete
    */
    
    public boolean registrarPaquete(PaquetesTurismo paquete){
        paqueteMySQL.insert(paquete);
        
        boolean condicion;
        return false;
    }
}
    


