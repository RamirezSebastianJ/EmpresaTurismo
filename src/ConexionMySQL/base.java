
package ConexionMySQL;

import com.mysql.jdbc.Connection;
import java.sql.*;


public class base {
    private static Connection conn;
    private static Statement stSentencias;
    private static ResultSet rsDatos;
    private static PreparedStatement psPrepararDatos;
    
    private static final String driver = "com.mysql.jdbc.Driver"; //se hace referencia la driver que se ha conectado para poder importar 
    
    private static final String usuario = "root"; //usuario creado por defecto por mysql
    private static final String password = ""; //contarseñña para acceder a mysql
    private static final String url = "jdbc:mysql://localhost:3306/turismo";

    public base() {
        conn = null;
        
        try{
            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url, usuario, password);
            if(conn!=null){
                System.out.println("conexion establecida..");
            }
        }catch(Exception e){
            System.out.println("error al conectar" + e);
        }

    }
    
    //Metodo que retorna la conexion 
    public Connection getConnection (){
        return conn;
    }
    
    //Metodo para deconectar la base de datos
    public void desconectar(){
        conn =  null;
        if(conn==null){
            System.out.println("conexion terminada..");
        }
    }
    
    //Metodo para cnsultar en la base de datos
    public ResultSet consulta (String sql) throws SQLException{
        try{
            rsDatos= stSentencias.executeQuery(sql);
        }catch(SQLException ex){
            throw ex;
        }
        return rsDatos;
    }
 
}
