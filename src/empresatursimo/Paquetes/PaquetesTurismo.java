
package empresatursimo.Paquetes;

public class PaquetesTurismo {
    
    public String destino;
    public int dias;
    public float precio;

    public PaquetesTurismo() {
    }
    
    //Vuelos
    public String origenVuelo;
    public int tipoPasaje;
    public int escalas;
    public int idVuelo;
    
    //Hotel
    public int estrellas; //Varia de 1 a 5
    public String nombreHotel;
    
    //Buses de Trasalados 
    public String busesTraslados [][] =  new  String[20][2]; //Fila [origen] Columna [destino]
    int i=0;

    //Excursiones
    public String excursiones [][] =  new  String[20][2]; //Fila [Nombre de la Empresa] Columna [Descripcion]
    int j=0;


    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }

    public float getPrecio() {
        return precio;
    }

    public int getTipoPasaje() {
        return tipoPasaje;
    }

    public int getEscalas() {
        return escalas;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public String[][] getBusesTraslados() {
        return busesTraslados;
    }

    public String[][] getExcursiones() {
        return excursiones;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoPasaje(int tipoPasaje) {
        this.tipoPasaje = tipoPasaje;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public void setBusesTraslados(String origen, String destino) {
        this.busesTraslados [i][0] = origen;
        this.busesTraslados [i+1][1]= destino;
        i++;
    }

    public void setExcursiones(String nEmpresa, String descripcion) {
        this.excursiones [j][0] = nEmpresa;
        this.excursiones [j+1][1] = descripcion;
        j++;
    } 

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }
    
    
    
}
