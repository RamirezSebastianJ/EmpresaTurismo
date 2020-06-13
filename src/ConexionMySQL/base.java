
package ConexionMySQL;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Base {
    private static Connection conn;
    private static Statement stSentencias;
    private static ResultSet rsDatos;
    private static PreparedStatement psPrepararDatos;

    
    
    private static final String driver = "com.mysql.jdbc.Driver"; //se hace referencia la driver que se ha conectado para poder importar     
    private static final String usuario = "root"; //usuario creado por defecto por mysql
    private static final String password = ""; //contraseña para acceder a mysql
    private static final String url = "jdbc:mysql://localhost:3306/turismo";

    public Base() {
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
    public static synchronized Connection getConnection (){
        return conn;
    }
    
    //Metodo para deconectar la base de datos
    public static void desconectar(){
        conn =  null;
        if(conn==null){
            System.out.println("conexion terminada..");
        }
    }
}
