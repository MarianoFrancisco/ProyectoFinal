/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import static instancias.FrameAnimacionVuelo.frameAnimacionVuelo;
import static instancias.FrameVentaAsientos.frameVentaAsientos;
import static instancias.FrameVisualizarDistribucionAsientos.frameVisualizarDistribucionAsientos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mariano
 */
public class FrameOperadorVuelos extends javax.swing.JFrame {

    /**
     * Creates new form FrameOperadorVuelos
     */
    FondoInicio operadorVuelos = new FondoInicio();//Creamos un nuevo fondo
    //estructuramos una manera estatica para poder cerrarla y abrirla desde cualquier lado
    public static FrameOperadorVuelos frameOperadorVuelos;
    public static void iniciarOperadorVuelos(){
        frameOperadorVuelos=new FrameOperadorVuelos();
    }
    public static void visible(){
        frameOperadorVuelos.setVisible(true);
    }
    public FrameOperadorVuelos() {
        this.setContentPane(operadorVuelos);//Realizamos la pintada de nuestro fondo
        initComponents();

        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SalirDelSistema = new javax.swing.JButton();
        RegresarMenu = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        iniciarVuelo = new javax.swing.JButton();
        distribucionAsientos = new javax.swing.JButton();
        cancelarVuelo = new javax.swing.JButton();
        posponerVuelo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operador de Vuelos");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SalirDelSistema.setBackground(new java.awt.Color(255, 0, 0));
        SalirDelSistema.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        SalirDelSistema.setForeground(new java.awt.Color(0, 0, 0));
        SalirDelSistema.setText("Salir");
        SalirDelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirDelSistemaActionPerformed(evt);
            }
        });
        jPanel1.add(SalirDelSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 600, 158, 44));

        RegresarMenu.setBackground(new java.awt.Color(255, 0, 0));
        RegresarMenu.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        RegresarMenu.setForeground(new java.awt.Color(0, 0, 0));
        RegresarMenu.setText("Regresar");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 160, 44));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        iniciarVuelo.setBackground(new java.awt.Color(255, 255, 51));
        iniciarVuelo.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        iniciarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        iniciarVuelo.setText("Iniciar Vuelo");
        iniciarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarVueloActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, -1));

        distribucionAsientos.setBackground(new java.awt.Color(255, 255, 51));
        distribucionAsientos.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        distribucionAsientos.setForeground(new java.awt.Color(0, 0, 0));
        distribucionAsientos.setText("dISTRIBUCION ASIENTOS");
        distribucionAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribucionAsientosActionPerformed(evt);
            }
        });
        jPanel1.add(distribucionAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        cancelarVuelo.setBackground(new java.awt.Color(255, 255, 51));
        cancelarVuelo.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        cancelarVuelo.setForeground(new java.awt.Color(0, 0, 0));
        cancelarVuelo.setText("Cancelar Vuelo");
        cancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVueloActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        posponerVuelo.setBackground(new java.awt.Color(255, 255, 0));
        posponerVuelo.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        posponerVuelo.setForeground(new java.awt.Color(0, 0, 0));
        posponerVuelo.setText("Posponer vuelo");
        jPanel1.add(posponerVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDelSistemaActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelve pronto, que tengas buen dia");//Mensaje de despedida
        System.exit(0);//Cerramos el sistema
    }//GEN-LAST:event_SalirDelSistemaActionPerformed

    private void iniciarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarVueloActionPerformed
        if(posponerVuelo.isSelected()){
            JOptionPane.showMessageDialog(null, "Vuelo pospuesto, no lo puedes iniciar hasta quitarlo");//Mensaje 
        }else{
            FrameAnimacionVuelo.iniciarVuelo();
            frameAnimacionVuelo.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_iniciarVueloActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        LlamarInstancias.manejoAeropuerto();//Regresamos al manejo aeropuerto
        this.dispose();//Cerramos este frame
    }//GEN-LAST:event_RegresarMenuActionPerformed

    private void distribucionAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribucionAsientosActionPerformed
        frameVisualizarDistribucionAsientos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_distribucionAsientosActionPerformed

    private void cancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVueloActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelo cancelado");
        frameVentaAsientos.dispose();//cerramos frame
        FrameVentaAsientos.cargarVenta();
        frameVisualizarDistribucionAsientos.dispose();
        FrameVisualizarDistribucionAsientos.iniciarDistribucion();
    }//GEN-LAST:event_cancelarVueloActionPerformed
    class FondoInicio extends JPanel{//creamos una clase parametrica o generica extendiendo de JPanel
        private Image imagen;//establecemos que sea tipo imagen
        @Override//sobrescribimos la clase JPanel especificamente el metodo paint
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoManejoGerencia.jpg")).getImage();//igualamos nuestra variable al fondo que queremos
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
            setOpaque(false);//Ponemos que el panel no sea visible
            super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton SalirDelSistema;
    private javax.swing.JButton cancelarVuelo;
    private javax.swing.JButton distribucionAsientos;
    private javax.swing.JButton iniciarVuelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton posponerVuelo;
    // End of variables declaration//GEN-END:variables
}
