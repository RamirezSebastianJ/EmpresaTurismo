
package empresatursimo.SelectorPrecio;

public class PrecioMayoristas implements ISelectorPrecio{
    
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
        if(tipoCliente == 1){
            return costo + 15;
        }else
            return -1;
    }
}
