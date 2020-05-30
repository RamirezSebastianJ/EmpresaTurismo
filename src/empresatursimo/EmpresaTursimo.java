
package empresatursimo;

import empresatursimo.MVC.*;


public class EmpresaTursimo {

    
    public static void main(String[] args) {
        
        VentanaAdministrador ventanAdmin = new  VentanaAdministrador();
        InterfazAdministrador intfAdmin = new InterfazAdministrador();
        InterfazInicial intInicial = new InterfazInicial();
        InterfazUsuario intUsuario = new InterfazUsuario();
        VentanaUsuario ventanUsuario = new VentanaUsuario();

        ControladorPrincipal controlPrin = new ControladorPrincipal( ventanAdmin, intfAdmin, intInicial, intUsuario, ventanUsuario);
        
        controlPrin.iniciar();
    }
    
}
