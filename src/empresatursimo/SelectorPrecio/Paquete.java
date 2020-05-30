
package empresatursimo.SelectorPrecio;

public class Paquete implements ISelectorPrecio {
    
    private ISelectorPrecio next;
    
    public float costo;

    public Paquete(int costo) {
        this.costo = costo;
    }
    
    @Override
    public void setNext(ISelectorPrecio selector) {
        next = selector;
    }

    @Override
    public ISelectorPrecio getNext() {
        return next;
    }

    @Override
    public float asignarPrecio(int tipoCliente, float costo) {
        PrecioMayoristas pMayoristas = new PrecioMayoristas();
        this.setNext(pMayoristas);
        PrecioComunesNacionales pCNacionales = new PrecioComunesNacionales();
        pMayoristas.setNext(pCNacionales);
        PrecioExtranjeros pExtranjeros = new PrecioExtranjeros();
        costo = next.asignarPrecio(tipoCliente, costo);
        return costo;       
    }
}
