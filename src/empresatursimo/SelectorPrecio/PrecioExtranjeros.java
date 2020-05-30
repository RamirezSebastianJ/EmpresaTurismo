
package empresatursimo.SelectorPrecio;


public class PrecioExtranjeros implements ISelectorPrecio{
    private ISelectorPrecio next;
    
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
        if(tipoCliente == 3){
            return costo + (float ) (costo * 0.2) + 500;
        }
        return -1;
    }
}
