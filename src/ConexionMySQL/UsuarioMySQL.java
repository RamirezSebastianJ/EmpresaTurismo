
package ConexionMySQL;

import empresatursimo.Usuarios.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioMySQL {
    private static String SQL_INSERT = "INSERT INTO usuario VALUES (?,?,?) ";
    
    private static String SQL_UPDATE = "UPDATE usuario SET login=?, pass=?, tipo_usuario_idtipo_usuario=? WHERE idusuario=?";
    
    private static String SQL_DELETE = "DELETE FROM usuario WHERE idusuario=?";
    
    private static String SQL_SELECT = "SELECT idusuario, login, pass, tipo_usuario_idtipo_usuario FROM usuario ORDER BY idusuario";
    
    public int insert(String usuario, String pass, int tipo_usuario_idtipo_usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;
        try{
            conn = Base.getConnection();
            System.out.println("Ejecutando query" + SQL_INSERT);
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1; // contador de columnas
            stmt.setString(index++, usuario); //parametro 1
            stmt.setString(index++, pass); //parametro 2
            stmt.setInt(index++, tipo_usuario_idtipo_usuario);
            
            rows = stmt.executeUpdate(); // no. Registros Afectados
            System.out.println("Resgistros afectados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }

    public int  update (int idusuario, String usuario, String pass, int tipo_usuario_idtipo_usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            System.out.println("Ejecutando query" + SQL_UPDATE);
            int index = 1;

            stmt.setInt(index, idusuario); //parametro 1
            stmt.setString(index++, usuario); //parametro 2
            stmt.setString(index++, pass); //parametro 3
            stmt.setInt(index, tipo_usuario_idtipo_usuario); //parametro 4

            rows = stmt.executeUpdate();
            System.out.println("Registros Actualizados: " + rows );
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }
    
    public int delete(int idusuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            System.out.println("Ejecutando query" + SQL_DELETE);
            int index = 1;
            stmt.setInt(1, idusuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados: " + rows );
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }
    
    public List<Usuario> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String login = rs.getString(2);
                String pass = rs.getString(3);
                int tipo_usuario_idtipo_usuario = rs.getInt(4);
                usuario = new Usuario();
                usuario.setLogin(login);
                usuario.setPass(pass);
                usuario.setTipo_usuario_idtipo_usuario(tipo_usuario_idtipo_usuario);
                usuarios.add(usuario);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return usuarios;
    }
}
