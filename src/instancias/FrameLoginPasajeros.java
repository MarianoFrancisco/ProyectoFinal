/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import static instancias.FramePasajeros.c;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static proyectofinal.ProyectoFinal.c1;
/**
 *
 * @author Mariano
 */
public class FrameLoginPasajeros extends javax.swing.JFrame {
    /**
     * Creates new form AnimacionVuelo
     */
    FondoInicio fondoLoginPasajeros = new FondoInicio();//Creamos un nuevo fondo
    public FrameLoginPasajeros() {
        this.setContentPane(fondoLoginPasajeros);//Realizamos la pintada de nuestro fondo
        initComponents();
        valorCargado();
        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }
    public void valorCargado(){
        
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
        Persona = new javax.swing.JLabel();
        millasRecorridas = new javax.swing.JLabel();
        datosPersonales = new javax.swing.JLabel();
        gastosTarjeta = new javax.swing.JLabel();
        boletosComprados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pasaporte = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JLabel();
        millas = new javax.swing.JLabel();
        gastos = new javax.swing.JLabel();
        tarjeta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Pasajeros");

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
        jPanel1.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 150, 44));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PersonaDatosUsuario.png"))); // NOI18N
        jPanel1.add(Persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 180, 250));

        millasRecorridas.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        millasRecorridas.setForeground(new java.awt.Color(0, 0, 0));
        millasRecorridas.setText("millas recorridas:");
        jPanel1.add(millasRecorridas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        datosPersonales.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        datosPersonales.setForeground(new java.awt.Color(0, 0, 0));
        datosPersonales.setText("datos personales:");
        jPanel1.add(datosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        gastosTarjeta.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        gastosTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        gastosTarjeta.setText("Gastos por tarjeta:");
        jPanel1.add(gastosTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        boletosComprados.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        boletosComprados.setForeground(new java.awt.Color(0, 0, 0));
        boletosComprados.setText("Boletos Comprados:");
        jPanel1.add(boletosComprados, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBodega.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 260, 320));

        pasaporte.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        pasaporte.setForeground(new java.awt.Color(0, 0, 0));
        pasaporte.setText("Pasaporte: "+c.getValidarPasaporte());
        jPanel1.add(pasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        nombre.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre: "+c.getValidarNombre());
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        apellidos.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.setText("Apellidos: "+c.getValidarApellidos());
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        sexo.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        sexo.setForeground(new java.awt.Color(0, 0, 0));
        sexo.setText("Sexo: "+c.getValidarSexo());
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        nacionalidad.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        nacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        nacionalidad.setText("Nacionalidad: "+c.getValidarNacionalidad());
        jPanel1.add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        estadoCivil.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        estadoCivil.setText("Estado civil: "+c.getValidarEstadoCivil());
        jPanel1.add(estadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        millas.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        millas.setForeground(new java.awt.Color(0, 0, 0));
        millas.setText(""+c.getValidarMillasRecorrdas());
        jPanel1.add(millas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));

        gastos.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        gastos.setForeground(new java.awt.Color(0, 0, 0));
        gastos.setText(""+c1.getBoletosComprados());
        jPanel1.add(gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        tarjeta.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        tarjeta.setForeground(new java.awt.Color(0, 0, 0));
        tarjeta.setText(""+c1.getDineroGanado());
        jPanel1.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMadera.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 650, 410));

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

    private void SalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDelSistemaActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelve pronto, que tengas buen dia");//Mensaje de despedida
        System.exit(0);//Cerramos el sistema
    }//GEN-LAST:event_SalirDelSistemaActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        LlamarInstancias.pasajeros();//Regresamos al menu opciones
        this.dispose();//Cerramos este frame
    }//GEN-LAST:event_RegresarMenuActionPerformed
    class FondoInicio extends JPanel{//creamos una clase parametrica o generica extendiendo de JPanel
        private Image imagen;//establecemos que sea tipo imagen
        @Override//sobrescribimos la clase JPanel especificamente el metodo paint
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/imagenes/LoginPasajeros.jpg")).getImage();//igualamos nuestra variable al fondo que queremos
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
            setOpaque(false);//Ponemos que el panel no sea visible
            super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Persona;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton SalirDelSistema;
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel boletosComprados;
    private javax.swing.JLabel datosPersonales;
    private javax.swing.JLabel estadoCivil;
    private javax.swing.JLabel gastos;
    private javax.swing.JLabel gastosTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel millas;
    private javax.swing.JLabel millasRecorridas;
    private javax.swing.JLabel nacionalidad;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pasaporte;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tarjeta;
    // End of variables declaration//GEN-END:variables
}
