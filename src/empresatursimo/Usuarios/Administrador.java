
package empresatursimo.Usuarios;


public class Administrador {
    public String nombre;
    public int dni;
    public int password;

    public Administrador(String nombre, int dni, int password) {
        this.nombre = nombre;
        this.dni = dni;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
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

    public void setPassword(int password) {
        this.password = password;
    }
    
}
