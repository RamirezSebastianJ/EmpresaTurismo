
package empresatursimo.MVC;

import empresatursimo.Paquetes.PaquetesTurismo;
import empresatursimo.Usuarios.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControladorPrincipal implements ActionListener{
    
    public LogicaPrincipal logicaPrincipal = new LogicaPrincipal();

    //Argumentos para tener en ceunta la selecion para asber que datos deben ser capturados
    int opcionVAdmin = 0; //opcion para saber que datos capturar en ventana Admin,  1 Registrar Usuario, 2. Crear Paquete
    int opcionVUsuario = 0; //opcion para saber que datos capturar en ventana Usuario,  1 Comprar Paquetes, 2. Mis Paquetes
    
    //Metodos Auxiliares
    public Usuario auxiliarUsuario = new Usuario();
    public PaquetesTurismo auxiliarPaqueteTurismo = new PaquetesTurismo();
    public ArrayList<PaquetesTurismo> listAuxPaquetes = new ArrayList<>();
    
    
    VentanaAdministrador ventanAdmin;
    InterfazAdministrador intfAdmin;
    InterfazInicial intInicial;
    InterfazUsuario intUsuario;
    VentanaUsuario ventanaUsuario;
    
    
    public ControladorPrincipal(VentanaAdministrador ventanAdmin, InterfazAdministrador intfAdmin, InterfazInicial intInicial, 
            InterfazUsuario intUsuario, VentanaUsuario ventanaUsuario) {
        
        
        this.ventanAdmin = ventanAdmin;
        this.intfAdmin = intfAdmin;
        this.intInicial = intInicial;
        this.intUsuario = intUsuario;
        this.ventanaUsuario = ventanaUsuario;
        
        //Botones InterfazInicial
        this.intInicial.jButtonAdministrador.addActionListener(this);
        this.intInicial.jButtonUsuario.addActionListener(this);

        //Botones intUsuario
        this.intUsuario.jTextFieldUsuario.addActionListener(this);
        this.intUsuario.jTextFieldPassword.addActionListener(this);
        this.intUsuario.jButtonLogin.addActionListener(this);

        //Botones intfAdmin
        this.intfAdmin.jTextFieldUsuario.addActionListener(this);
        this.intfAdmin.jTextFieldPassword.addActionListener(this);
        this.intfAdmin.jButtonLogin.addActionListener(this);

        //Botones VentanaAdministrador
        this.ventanAdmin.jButtonNCliente.addActionListener(this);
        this.ventanAdmin.jButtonDNI.addActionListener(this);
        this.ventanAdmin.jButtonTelefono.addActionListener(this);
        this.ventanAdmin.jButtonTipo.addActionListener(this);
        this.ventanAdmin.jButtonRiesgo.addActionListener(this);
        this.ventanAdmin.jTextNUsuario.addActionListener(this);
        this.ventanAdmin.jTextDNI.addActionListener(this);
        this.ventanAdmin.jTextTelefono.addActionListener(this);
        this.ventanAdmin.jComboBoxTipo.addActionListener(this);
        this.ventanAdmin.jComboBoxRiesgo.addActionListener(this);
        this.ventanAdmin.jTextDias.addActionListener(this);
        this.ventanAdmin.jComboBoxTpasaje.addActionListener(this);
        this.ventanAdmin.jComboBoxEscalas.addActionListener(this);
        this.ventanAdmin.jTextDestino.addActionListener(this);
        this.ventanAdmin.jTextOrigenVuelo.addActionListener(this);
        this.ventanAdmin.jTextIDVuelo.addActionListener(this);           
        this.ventanAdmin.jComboBoxHEstrellas.addActionListener(this);        
        this.ventanAdmin.jTextNombreH.addActionListener(this);
        this.ventanAdmin.jComboBoxNBuses.addActionListener(this);
        this.ventanAdmin.jComboBoxCExcursiones.addActionListener(this);
        this.ventanAdmin.jButtonCancelarCancelar.addActionListener(this);
        this.ventanAdmin.jButtonGuardarPaquete.addActionListener(this);
        this.ventanAdmin.jButtonRegistar.addActionListener(this);
        this.ventanAdmin.jButtonRegistrarUsuario.addActionListener(this);
        this.ventanAdmin.jButtonCrearPaquete.addActionListener(this);
        this.ventanAdmin.jTextFieldPassword.addActionListener(this);
        
        //Botones VentanaUsuario
        this.ventanaUsuario.jButtonSeleccionar.addActionListener(this);
        this.ventanaUsuario.jComboBoxCantidadDeCuotas.addActionListener(this);
        this.ventanaUsuario.jTextFieldReservaEfectiva.addActionListener(this);
        this.ventanaUsuario.jButtonComprarPaquete.addActionListener(this);
    }

    public void iniciar(){
        intInicial.setVisible(true);
        intInicial.setResizable(false);
        intInicial.setLocationRelativeTo(null);
    }
    
    public void finalizarInterfazInicial(){
        intInicial.setVisible(false);
    }
    
    
    public void iniciarInterfazAdministrador(){
        intfAdmin.setVisible(true);
        intfAdmin.setResizable(false);
        intfAdmin.setLocationRelativeTo(null);
    }
    
    public void finalizarInterfazAdministrador(){
        intInicial.setVisible(false);
    }

    
    public void iniciarInterfazUsuario(){
        intUsuario.setVisible(true);
        intUsuario.setResizable(false);
        intUsuario.setLocationRelativeTo(null);
    }
    
    public void finalizarInterfazUsuario(){
        intUsuario.setVisible(false);
    }

    public void iniciarVentanaAdministrador(){
        ventanAdmin.setVisible(true);
        ventanAdmin.setResizable(false);
        ventanAdmin.setLocationRelativeTo(null);
        ventanAdmin.jPanelRegistrarUsuario.setVisible(false);
        ventanAdmin.jPanelCraerPaquete.setVisible(false);
    }
    
    public void iniciarVentanaUsuario(){
        ventanaUsuario.setVisible(true);
        ventanaUsuario.setResizable(false);
        ventanaUsuario.setLocationRelativeTo(null);
        ventanaUsuario.jPanelContenedorPaquetes.setVisible(false);
        ventanaUsuario.jPanelMenu.setVisible(true);
    }

    public void finalizarVentanaAdministrador(){
        ventanAdmin.setVisible(false);
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Eventos para InterfazInicial
        if(e.getSource()== intInicial.jButtonAdministrador){
            finalizarInterfazInicial();
            iniciarInterfazAdministrador();
        }
        
        if(e.getSource()==intInicial.jButtonUsuario){
            finalizarInterfazInicial();
            iniciarInterfazUsuario();
        }
        
        
        //Eventos para InterfazAdministrador
        if(e.getSource()==intUsuario.jButtonLogin){
            boolean condicion = logicaPrincipal.login(intUsuario.jTextFieldUsuario.getText(), intUsuario.jTextFieldPassword.getText(), 2);
            if(condicion){
                finalizarInterfazUsuario();
                iniciarVentanaUsuario();  
            }
        }
        
        if(e.getSource()==intfAdmin.jButtonLogin){
            boolean condicion = logicaPrincipal.login(intfAdmin.jTextFieldUsuario.getText(), intfAdmin.jTextFieldPassword.getText(), 1);
            if(condicion){
                finalizarInterfazAdministrador();
                iniciarVentanaAdministrador();  
            }
        }
        
        
        //Eventos para VentanaAdministrador
        
        //Evenetos VentanaAdministrador - Cambio de los jPanel
        if(e.getSource()==ventanAdmin.jButtonRegistar){
            ventanAdmin.jPanelRegistrarUsuario.setVisible(true);
            ventanAdmin.jPanelCraerPaquete.setVisible(false);
            auxiliarUsuario = new Usuario();
            opcionVAdmin = 1;
        }
        if(e.getSource()==ventanAdmin.jButtonCrearPaquete){
            ventanAdmin.jPanelCraerPaquete.setVisible(true);
            ventanAdmin.jPanelRegistrarUsuario.setVisible(false);
            opcionVAdmin = 2;
        }
        
        if(e.getSource() == ventanAdmin.jComboBoxTpasaje){
            String itemSeleecionado = (String)ventanAdmin.jComboBoxTpasaje.getSelectedItem();
            System.out.println(itemSeleecionado); 
        }
        
        //Captura de Datos en VentanaAdministrador para crear Usuario
        if(opcionVAdmin == 1){
            if(e.getSource () == ventanAdmin.jComboBoxTipo ){
                int auxTipoCliente = parseInt((String) ventanAdmin.jComboBoxTipo.getSelectedItem());
                System.out.println("tipo elegido:" + auxTipoCliente);
                auxiliarUsuario.setTipo_usuario_idtipo_usuario(auxTipoCliente);
            }
            
            if(e.getSource () == ventanAdmin.jComboBoxRiesgo ){
                String auxTipoCliente = (String)ventanAdmin.jComboBoxRiesgo.getSelectedItem();
                //auxiliarUsuario.setTipoRiesgo(parseInt(auxTipoCliente));
            }
            
            if(e.getSource () == ventanAdmin.jButtonRegistrarUsuario  ){ 
                if(auxiliarUsuario.getTipo_usuario_idtipo_usuario()!=0){
                    if(ventanAdmin.jTextNUsuario.getText().length()>1 && ventanAdmin.jTextDNI.getText().length()>1 && 
                            ventanAdmin.jTextFieldPassword.getText().length()>1
                            ){
                        auxiliarUsuario.setLogin(ventanAdmin.jTextNUsuario.getText());
                        //auxiliarUsuario.setTelefono(parseInt(ventanAdmin.jButtonTelefono.getText()));
                        auxiliarUsuario.setIdusuario(parseInt(ventanAdmin.jTextDNI.getText()));
                        auxiliarUsuario.setPass(ventanAdmin.jTextFieldPassword.getText());
                        opcionVAdmin = 0;
                        boolean condicion = logicaPrincipal.registrar (auxiliarUsuario);
                        if(condicion){
                            JOptionPane.showMessageDialog(null, "Usuario Registrado Con EXITO!");
                        }else{
                            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
                        }
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Datos incompletos, Verifique Por favor");
                    }                   
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incompletos, verifique los campos Tipo y Riesgo");
                }
            }
        }
        
        //Captura de Datos en VentanaAdministrador para crear un paquete
        if(opcionVAdmin == 2){
            if(e.getSource () == ventanAdmin.jComboBoxTpasaje ){
                String auxCadena = (String)ventanAdmin.jComboBoxTpasaje.getSelectedItem();
                auxiliarPaqueteTurismo.setTipo_pasaje(parseInt(auxCadena));
            }
            
            if(e.getSource () == ventanAdmin.jComboBoxEscalas ){
                String auxCadena = (String)ventanAdmin.jComboBoxEscalas.getSelectedItem();
                auxiliarPaqueteTurismo.setEscala(parseInt(auxCadena));

            }

            if(e.getSource () == ventanAdmin.jComboBoxHEstrellas ){
                String auxCadena = (String)ventanAdmin.jComboBoxHEstrellas.getSelectedItem();
                auxiliarPaqueteTurismo.setHotel_tipo_hotel(parseInt(auxCadena));

            }

            if(e.getSource () == ventanAdmin.jComboBoxCExcursiones ){
                String auxCadena = (String)ventanAdmin.jComboBoxCExcursiones.getSelectedItem();
                //auxiliarUsuario.setTipoRiesgo(parseInt(auxCadena));
                int auxCExcursiones = parseInt(auxCadena);
                /*for (int i = 0; i < auxCExcursiones ; i++) {
                    String auxCadenaNombreE = JOptionPane.showInputDialog("Nombre de la Empresa "+i+1);
                    String auxCadenaDescripcion = JOptionPane.showInputDialog("Descrpicion " + i+1);
                     
                }*/
                auxiliarPaqueteTurismo.setExcursiones(auxCExcursiones);
                ventanAdmin.jComboBoxCExcursiones.disable();
            }
            
            if(e.getSource () == ventanAdmin.jComboBoxNBuses ){
                String auxCadena = (String)ventanAdmin.jComboBoxNBuses.getSelectedItem();
                int auxNBuses = parseInt(auxCadena);
                auxiliarPaqueteTurismo.setTraslados(parseInt(auxCadena));
                ventanAdmin.jComboBoxNBuses.disable();    
            }

            if(e.getSource () == ventanAdmin.jButtonGuardarPaquete  ){ 
                if(ventanAdmin.jTextDestino.getText().length()>1 && ventanAdmin.jTextDias.getText().length()>1
                        && ventanAdmin.jTextOrigenVuelo.getText().length()>1&& ventanAdmin.jTextIDVuelo.getText().length()>1
                        && ventanAdmin.jTextNombreH.getText().length()>1){
                    
                    auxiliarPaqueteTurismo.setDestino(ventanAdmin.jTextDestino.getText());
                    auxiliarPaqueteTurismo.setDias(parseInt(ventanAdmin.jTextDias.getText()));
                    auxiliarPaqueteTurismo.setOrigen(ventanAdmin.jTextOrigenVuelo.getText());
                    auxiliarPaqueteTurismo.setAereo_idvuelo(parseInt(ventanAdmin.jTextIDVuelo.getText()));
                    auxiliarPaqueteTurismo.setHotel_nombre_hotel(ventanAdmin.jTextNombreH.getText());
                    //auxiliarPaqueteTurismo.setHotel_idhotel();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incompletos, Verifique Por favor");
                }          
            }
        }
        
        //Captura de Datos en VentanaAdministrador para crear un paquete
        if(e.getSource() == ventanaUsuario.jButtonComprarPaquete){
            System.out.println("entra");
            ventanaUsuario.jPanelContenedorPaquetes.setVisible(true);
            ventanaUsuario.jPanelMenu.setVisible(false);
            for(int i=0; i< listAuxPaquetes.size(); i++){
                ventanaUsuario.jComboBoxPaquetesDisponibles.addItem( i + "" );
            }
            opcionVUsuario = 2;
        }
        
        if(e.getSource() == ventanaUsuario.jComboBoxPaquetesDisponibles){
            /*int aux = 0;
            aux = parseInt((String)ventanaUsuario.jComboBoxPaquetesDisponibles.getSelectedItem());
            auxiliarPaqueteTurismo = listAuxPaquetes.get(aux);
            String auxiliar = (auxiliarPaqueteTurismo.getDestino() + " " + " Dias: "+  auxiliarPaqueteTurismo.getDias() + "\n"
                    +"Hotel: " + auxiliarPaqueteTurismo.getNombreHotel() + " " + "Estrellas" + auxiliarPaqueteTurismo.getEstrellas() + "\n"
                    + "Escalas: " + auxiliarPaqueteTurismo.getEscalas() + "Excursiones: "
                    );
            String auxExcursiones [][] =  new String[20][2];
            auxExcursiones = auxiliarPaqueteTurismo.getExcursiones();

            for(int i= 0; i<20; i++){
                auxiliar = auxiliar + "\n Empresa: " +  auxExcursiones[i][0];
                auxiliar = auxiliar + ".... Descripcion: " + auxExcursiones[i][1];
            }
            ventanaUsuario.jTextAreaDecripcion.setText(auxiliar);*/
        }
        
        if(e.getSource() == ventanaUsuario.jComboBoxCantidadDeCuotas){
            int aux = 0;
            //Falta codigo
        }
        
        if(e.getSource() == ventanaUsuario.jButtonComprar){
            //Falta Codigo
        }
        
    }
}
