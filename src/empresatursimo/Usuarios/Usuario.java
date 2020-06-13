
package empresatursimo.Usuarios;

import empresatursimo.Paquetes.PaquetesTurismo;
import java.util.ArrayList;


public class Usuario {
    public String login;
    public String pass;
    public int idusuario;
    public int tipo_usuario_idtipo_usuario;

    public Usuario() {
    }
    
    public Usuario(String login, String pass, int idusuario, int tipo_usuario_idtipo_usuario) {
        this.login = login;
        this.pass = pass;
        this.idusuario = idusuario;
        this.tipo_usuario_idtipo_usuario = tipo_usuario_idtipo_usuario;
    }

    
    
    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public int getTipo_usuario_idtipo_usuario() {
        return tipo_usuario_idtipo_usuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setTipo_usuario_idtipo_usuario(int tipo_usuario_idtipo_usuario) {
        this.tipo_usuario_idtipo_usuario = tipo_usuario_idtipo_usuario;
    }
    
    
}
