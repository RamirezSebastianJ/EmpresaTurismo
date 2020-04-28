/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COR;

/**
 *
 * @author SERVIDOR
 */
public class Turismo implements ISelectorGuia{
    public ISelectorGuia next;
    
    @Override
    public void asignarGuia(int edad) {
        GuiaInfantil gInfantil = new GuiaInfantil();
        this.setNext(gInfantil);
        GuiaJuvenil gJuvenil = new GuiaJuvenil();
        gInfantil.setNext(gJuvenil);
        GuiaPrincipal gPrincipal= new GuiaPrincipal();
        gJuvenil.setNext(gPrincipal);
        next.asignarGuia(edad); 
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
