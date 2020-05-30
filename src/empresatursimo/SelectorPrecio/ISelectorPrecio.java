
package empresatursimo.SelectorPrecio;


public interface ISelectorPrecio {
    public void setNext(ISelectorPrecio selector);
    public ISelectorPrecio getNext();
    public float asignarPrecio(int tipoCliente, float precio);
}
