/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatursimo.MVC;

/**
 *
 * @author juans
 */
public class VentanaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaUsuario
     */
    public VentanaUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonComprarPaquete = new javax.swing.JButton();
        jPanelContenedorPaquetes = new javax.swing.JPanel();
        jPanelPaquetesDisponibles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSeleccionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDecripcion = new javax.swing.JTextArea();
        jComboBoxPaquetesDisponibles = new javax.swing.JComboBox<>();
        jPanelFinalizarCompra = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBoxCantidadDeCuotas = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextFieldReservaEfectiva = new javax.swing.JTextField();
        jButtonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonComprarPaquete.setText("Comprar Paquete");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonComprarPaquete)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButtonComprarPaquete)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 400));

        jLabel1.setText("Paquetes Disponibles");

        jButtonSeleccionar.setText("Seleccionar");

        jLabel2.setText("Descripción");

        jTextAreaDecripcion.setColumns(20);
        jTextAreaDecripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDecripcion);

        jComboBoxPaquetesDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanelPaquetesDisponiblesLayout = new javax.swing.GroupLayout(jPanelPaquetesDisponibles);
        jPanelPaquetesDisponibles.setLayout(jPanelPaquetesDisponiblesLayout);
        jPanelPaquetesDisponiblesLayout.setHorizontalGroup(
            jPanelPaquetesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                .addGroup(jPanelPaquetesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                        .addGroup(jPanelPaquetesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel1))
                            .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jButtonSeleccionar))
                            .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jComboBoxPaquetesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanelPaquetesDisponiblesLayout.setVerticalGroup(
            jPanelPaquetesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaquetesDisponiblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPaquetesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButtonSeleccionar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel3.setText("Comprar");

        jButton3.setText("Cantidad De Cuotas");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverEnabled(false);
        jButton3.setVerifyInputWhenFocusTarget(false);

        jComboBoxCantidadDeCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1","2", "3","4", "5", "6", "7", "8","9", "10","11", "12" }));

        jButton4.setText("Tu reserva se efectuara");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setRolloverEnabled(false);
        jButton4.setVerifyInputWhenFocusTarget(false);

        jButtonComprar.setText("Comprar");

        javax.swing.GroupLayout jPanelFinalizarCompraLayout = new javax.swing.GroupLayout(jPanelFinalizarCompra);
        jPanelFinalizarCompra.setLayout(jPanelFinalizarCompraLayout);
        jPanelFinalizarCompraLayout.setHorizontalGroup(
            jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                .addGroup(jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldReservaEfectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBoxCantidadDeCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButtonComprar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelFinalizarCompraLayout.setVerticalGroup(
            jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinalizarCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jComboBoxCantidadDeCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFinalizarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextFieldReservaEfectiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenedorPaquetesLayout = new javax.swing.GroupLayout(jPanelContenedorPaquetes);
        jPanelContenedorPaquetes.setLayout(jPanelContenedorPaquetesLayout);
        jPanelContenedorPaquetesLayout.setHorizontalGroup(
            jPanelContenedorPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorPaquetesLayout.createSequentialGroup()
                .addComponent(jPanelPaquetesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenedorPaquetesLayout.setVerticalGroup(
            jPanelContenedorPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorPaquetesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelContenedorPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPaquetesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelContenedorPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButtonComprar;
    public javax.swing.JButton jButtonComprarPaquete;
    public javax.swing.JButton jButtonSeleccionar;
    public javax.swing.JComboBox<String> jComboBoxCantidadDeCuotas;
    public javax.swing.JComboBox<String> jComboBoxPaquetesDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanelContenedorPaquetes;
    public javax.swing.JPanel jPanelFinalizarCompra;
    public javax.swing.JPanel jPanelMenu;
    public javax.swing.JPanel jPanelPaquetesDisponibles;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTextAreaDecripcion;
    public javax.swing.JTextField jTextFieldReservaEfectiva;
    // End of variables declaration//GEN-END:variables
}
