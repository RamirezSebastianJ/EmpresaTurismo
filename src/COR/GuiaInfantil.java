
package COR;

public class GuiaInfantil implements ISelectorGuia{

    public ISelectorGuia next;
    
    @Override
    public void asignarGuia(int edad) {
        if(edad<=12){
            System.out.println("Encargado: Lider Infantil");
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
