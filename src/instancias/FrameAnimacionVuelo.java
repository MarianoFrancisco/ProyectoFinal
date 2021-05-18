/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import proyectofinal.HiloAnimacion;

/**
 *
 * @author Mariano
 */
public class FrameAnimacionVuelo extends javax.swing.JFrame {
    /**
     * Creates new form AnimacionVuelo
     */
    FondoInicio fondoVuelo = new FondoInicio();//Creamos un nuevo fondo
    //estructuramos una manera estatica para poder cerrarla y abrirla desde cualquier lado
    public static FrameAnimacionVuelo frameAnimacionVuelo;
    public static void iniciarVuelo(){
        frameAnimacionVuelo=new FrameAnimacionVuelo();
    }
    public static void visible(){
        frameAnimacionVuelo.setVisible(true);
    }
    public FrameAnimacionVuelo() {
        this.setContentPane(fondoVuelo);//Realizamos la pintada de nuestro fondo
        initComponents();
        movientoHilo();//llamamos a movientoHilo
        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }
    public void movientoHilo(){
        HiloAnimacion h = new HiloAnimacion();//creamos un hilo animacion
        h.start();//iniciamos hilo animacion
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
        Logo = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        volando = new javax.swing.JLabel();
        origen = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        fondovuelo = new javax.swing.JLabel();
        finalizacion = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Pasajeros");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, -1, -1));

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel1.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        jPanel2.setOpaque(false);

        volando.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        volando.setForeground(new java.awt.Color(0, 0, 0));
        volando.setText("vuelo en curso ...");

        origen.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        origen.setForeground(new java.awt.Color(0, 0, 0));
        origen.setText("Origen");

        destino.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        destino.setForeground(new java.awt.Color(0, 0, 0));
        destino.setText("Destino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(volando)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(origen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(destino)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(volando)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(destino)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(origen)
                        .addGap(16, 16, 16))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1210, 600));

        fondovuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/we.jpg"))); // NOI18N
        jPanel1.add(fondovuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 520, 60));

        finalizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LlegadaVueloAnimacion.PNG"))); // NOI18N
        jPanel1.add(finalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, -1, -1));

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioAnimacionVuelo.PNG"))); // NOI18N
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    class FondoInicio extends JPanel{//creamos una clase parametrica o generica extendiendo de JPanel
        private Image imagen;//establecemos que sea tipo imagen
        @Override//sobrescribimos la clase JPanel especificamente el metodo paint
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoAnimacionAvion.jpg")).getImage();//igualamos nuestra variable al fondo que queremos
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
            setOpaque(false);//Ponemos que el panel no sea visible
            super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel finalizacion;
    private javax.swing.JLabel fondovuelo;
    private javax.swing.JLabel inicio;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JLabel origen;
    private javax.swing.JLabel volando;
    // End of variables declaration//GEN-END:variables
}
