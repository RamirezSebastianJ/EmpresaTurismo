
package empresatursimo.SelectorPrecio;

public class PrecioComunesNacionales implements ISelectorPrecio{
    
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
        if(tipoCliente == 2){
            return costo + (float) (costo * (0.1));
        }
        return -1;
    }
    
}
