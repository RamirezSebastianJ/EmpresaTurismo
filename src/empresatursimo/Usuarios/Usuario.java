
package empresatursimo.Usuarios;

import empresatursimo.Paquetes.PaquetesTurismo;
import java.util.ArrayList;


public class Usuario {
    public String nombre;
    public int dni;
    public int telefono;
    public int tipoCliente = 0;
    public int tipoRiesgo = 0;
    public int password;
    
    public ArrayList<PaquetesTurismo> paquetesReservados = new ArrayList<>();
    public ArrayList<PaquetesTurismo> paquetesPendientes = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, int dni, int tipoCliente, int tipoRiesgo, int password, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
        this.tipoRiesgo = tipoRiesgo;
        this.password = password;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public int getTipoRiesgo() {
        return tipoRiesgo;
    }

    public int getPassword() {
        return password;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setTipoRiesgo(int tipoRiesgo) {
        this.tipoRiesgo = tipoRiesgo;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<PaquetesTurismo> getPaquetesReservados() {
        return paquetesReservados;
    }

    public void setPaquetesReservados(PaquetesTurismo paquetesReservados) {
        this.paquetesReservados.add(paquetesReservados);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
