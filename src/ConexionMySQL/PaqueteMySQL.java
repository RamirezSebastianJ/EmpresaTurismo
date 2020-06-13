
package ConexionMySQL;

import empresatursimo.Paquetes.PaquetesTurismo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PaqueteMySQL {
    
    private static String SQL_INSERT = "INSERT INTO paquete ( destino, dias, tipo_pasaje, escala, origen"
            + "aereo_idvuelo, hotel_tipo_hotel, hotel_nombre_hotel, hotel_id_hotel, trasaldos, excursiones)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    
    private static String SQL_UPDATE = "UPDATE paquete SET destino=?, dias=?, tipo_pasaje=?,"
            + "escala=?, origen=?, aereo_idvuelo=?, hotel_tipo_hotel=?, hotel_nombre_hotel=?, hotel_id_hotel=?,"
            + " trasaldos=?, excursiones=? WHERE idpaquete=?";
    
    private static String SQL_DELETE = "DELETE FROM paquete WHERE idpaquete=?";
    
    private static String SQL_SELECT = "SELECT idpaquete FROM paquete ORDER BY idpaquete";
    
    public int insert(PaquetesTurismo auxiliarPaquete){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int rows = 0;
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            System.out.println("Ejecutando query" + SQL_INSERT);
            int index = 1; // contador de columnas

            stmt.setString(index++, auxiliarPaquete.getDestino());
            stmt.setInt(index++, auxiliarPaquete.getDias());
            stmt.setInt(index++, auxiliarPaquete.getTipo_pasaje()); 
            stmt.setInt(index++, auxiliarPaquete.getEscala()); 
            stmt.setString(index++, auxiliarPaquete.getOrigen());
            stmt.setInt(index++, auxiliarPaquete.getAereo_idvuelo()); 
            stmt.setInt(index++, auxiliarPaquete.getHotel_tipo_hotel()); 
            stmt.setString(index++, auxiliarPaquete.getHotel_nombre_hotel());
            stmt.setInt(index++, 1223);
            stmt.setInt(index++, auxiliarPaquete.getTraslados());
            stmt.setInt(index++, auxiliarPaquete.getExcursiones());

            System.out.println("Ejecutando query" + SQL_INSERT);
            rows = stmt.executeUpdate(); // no. Registros Afectados
            System.out.println("Resgistros afectado: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }

    public int  update (int idpaquete,String destino, int dias, int tipo_pasaje, int escala, String origen, int aereo_idvuelo,
     int hotel_tipo_hotel, String hotel_nombre_hotel, int hotel_id_hotel, int trasaldos, int  excursiones){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int rows = 0;
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            System.out.println("Ejecutando query" + SQL_UPDATE);
            int index = 1;

            stmt.setInt(index++, idpaquete);
            stmt.setString(index++, destino);
            stmt.setInt(index++, dias);
            stmt.setInt(index++, tipo_pasaje);
            stmt.setInt(index++, escala); 
            stmt.setString(index++, origen); 
            stmt.setInt(index++, aereo_idvuelo);
            stmt.setInt(index++, hotel_tipo_hotel);
            stmt.setString(index++, hotel_nombre_hotel);
            stmt.setInt(index++, hotel_id_hotel);
            stmt.setInt(index++, trasaldos);
            stmt.setInt(index++, excursiones);

            rows = stmt.executeUpdate();
            System.out.println("Registros Actualizados: " + rows );
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }
    
    public int delete(int idpaquete){
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            System.out.println("Ejecutando query" + SQL_DELETE);
            stmt.setInt(1, idpaquete);
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados: " + rows );
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return rows;
    }
    
    public List<PaquetesTurismo> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        PaquetesTurismo paquete = null;
        List<PaquetesTurismo> paquetes = new ArrayList<PaquetesTurismo>();
        
        try{
            conn = Base.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            System.out.println("Ejecutando query" + SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String destino = rs.getString(1);
                int dias = rs.getInt(2); 
                int tipo_pasaje = rs.getInt(3);
                int escala = rs.getInt(4);
                String origen = rs.getString(5);
                int aereo_idvuelo = rs.getInt(6);
                int hotel_tipo_hotel = rs.getInt(7);
                String hotel_nombre_hotel = rs.getString(8);
                int hotel_id_hotel = rs.getInt(9);
                int traslados = rs.getInt(10);
                int  excursiones = rs.getInt(11);

                paquete = new PaquetesTurismo();

                paquete.setDestino(destino);
                paquete.setDias(dias);
                paquete.setTipo_pasaje(tipo_pasaje);
                paquete.setEscala(escala);
                paquete.setOrigen(origen);
                paquete.setAereo_idvuelo(aereo_idvuelo);
                paquete.setHotel_idhotel(hotel_id_hotel);
                paquete.setHotel_nombre_hotel(hotel_nombre_hotel);
                paquete.setHotel_tipo_hotel(hotel_tipo_hotel);
                paquete.setTraslados(traslados);
                paquete.setExcursiones(excursiones);

                paquetes.add(paquete);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Base.desconectar();
        }
        
        return paquetes;
    }
    
}
