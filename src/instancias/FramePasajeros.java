/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mariano
 */
public class FramePasajeros extends javax.swing.JFrame {

    /**
     * Creates new form FramePasajeros
     */
    FondoInicio fondoPasajeros = new FondoInicio();//Creamos un nuevo fondo
    public FramePasajeros() {
        this.setContentPane(fondoPasajeros);//Realizamos la pintada de nuestro fondo
        initComponents();//Iniciamos los componentes del Frame
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
        RegresarMenu = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        SalirDelSistema = new javax.swing.JButton();
        LoginTexto = new javax.swing.JLabel();
        EntradaContraseña = new javax.swing.JPasswordField();
        EntradaPasaporte = new javax.swing.JTextField();
        IniciarSesionPasajeros = new javax.swing.JButton();
        passwordTexto = new javax.swing.JLabel();
        pasaporteTexto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LoginTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pasajeros");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegresarMenu.setBackground(new java.awt.Color(255, 0, 0));
        RegresarMenu.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        RegresarMenu.setForeground(new java.awt.Color(0, 0, 0));
        RegresarMenu.setText("Regresar al menu");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 260, 44));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

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

        LoginTexto.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        LoginTexto.setForeground(new java.awt.Color(0, 0, 0));
        LoginTexto.setText("Login");
        jPanel1.add(LoginTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        EntradaContraseña.setToolTipText("");
        EntradaContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaContraseñaActionPerformed(evt);
            }
        });
        EntradaContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(EntradaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 150, -1));

        EntradaPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaPasaporteActionPerformed(evt);
            }
        });
        EntradaPasaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaPasaporteKeyTyped(evt);
            }
        });
        jPanel1.add(EntradaPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 150, -1));

        IniciarSesionPasajeros.setBackground(new java.awt.Color(0, 204, 204));
        IniciarSesionPasajeros.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        IniciarSesionPasajeros.setForeground(new java.awt.Color(0, 0, 0));
        IniciarSesionPasajeros.setText("Iniciar Sesión");
        IniciarSesionPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionPasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarSesionPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        passwordTexto.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        passwordTexto.setForeground(new java.awt.Color(0, 0, 0));
        passwordTexto.setText("Contraseña");
        jPanel1.add(passwordTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        pasaporteTexto.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        pasaporteTexto.setForeground(new java.awt.Color(0, 0, 0));
        pasaporteTexto.setText("Pasaporte");
        jPanel1.add(pasaporteTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CompraBoletos.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 550, 280));

        LoginTexto1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        LoginTexto1.setForeground(new java.awt.Color(0, 0, 0));
        LoginTexto1.setText("Comprar Boletos");
        jPanel1.add(LoginTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ColumnaReporte.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 330, 270));

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

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        LlamarInstancias.inicioProyecto();//Regresamos al menu opciones
        this.dispose();//Cerramos este frame
    }//GEN-LAST:event_RegresarMenuActionPerformed

    private void SalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDelSistemaActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelve pronto, que tengas buen dia");//Mensaje de despedida
        System.exit(0);//Cerramos el sistema
    }//GEN-LAST:event_SalirDelSistemaActionPerformed

    private void EntradaContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaContraseñaActionPerformed

    }//GEN-LAST:event_EntradaContraseñaActionPerformed

    private void IniciarSesionPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionPasajerosActionPerformed
        //señalamos que seran una linea de caracteres establecida
        String pasaporte = EntradaPasaporte.getText();
        String contraseña = EntradaContraseña.getText();
        //Verificamos si una casilla esta vacia
        if(pasaporte.isEmpty()||contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }
        else{
            if(pasaporte.equals("12345678")&&contraseña.equals("abcd1234")){//Unicamente si los datos estan bien podra ingresar
                JOptionPane.showMessageDialog(null, "Bienvenido");//Mensaje de bienvenida
                LlamarInstancias.loginPasajeros();//Llamamos al frame login pasajeros
                this.dispose();//Cerramos este frame
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos");//Mensaje datos incorrectos
            }
        }
    }//GEN-LAST:event_IniciarSesionPasajerosActionPerformed

    private void EntradaPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaPasaporteActionPerformed
        
    }//GEN-LAST:event_EntradaPasaporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LlamarInstancias.comprarBoletos();//Llamamos al frame comprar boletos
        this.dispose();//Cerramos este frame
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EntradaContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaContraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaContraseñaKeyTyped

    private void EntradaPasaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaPasaporteKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(EntradaPasaporte.getText().length()>7){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El pasaporte unicamente tiene 8 digitos");//Mensaje condicional digitos pasaporte
        }
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_EntradaPasaporteKeyTyped
    class FondoInicio extends JPanel{//creamos una clase parametrica o generica extendiendo de JPanel
        private Image imagen;//establecemos que sea tipo imagen
        @Override//sobrescribimos la clase JPanel especificamente el metodo paint
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/imagenes/PasajeroFondo.jpg")).getImage();//igualamos nuestra variable al fondo que queremos
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
            setOpaque(false);//Ponemos que el panel no sea visible
            super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField EntradaContraseña;
    private javax.swing.JTextField EntradaPasaporte;
    private javax.swing.JButton IniciarSesionPasajeros;
    private javax.swing.JLabel LoginTexto;
    private javax.swing.JLabel LoginTexto1;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton SalirDelSistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pasaporteTexto;
    private javax.swing.JLabel passwordTexto;
    // End of variables declaration//GEN-END:variables
}
