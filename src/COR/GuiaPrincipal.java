
package COR;

public class GuiaPrincipal implements ISelectorGuia{
    public ISelectorGuia next;
    
    @Override
    public void asignarGuia(int edad) {
        if(edad>18){
            System.out.println("Encargado: Lider Principal");
        }else{
            next.asignarGuia(edad);
        }
    }

    @Override
    public ISelectorGuia getNext() {
        return next;
    }

    @Override
    public void setNext(ISelectorGuia selector) {
        next = selector;
    }
}
