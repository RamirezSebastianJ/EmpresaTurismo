
package COR;

public class GuiaJuvenil implements ISelectorGuia{
    public ISelectorGuia next;
    
    @Override
    public void asignarGuia(int edad) {
        if(edad>=13 && edad<=18){
            System.out.println("Encargado: Lider Juvenil");
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
