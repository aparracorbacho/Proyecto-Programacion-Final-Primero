
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @see MySqlC
 * @author aparracorbacho, ngarciacarrillo
 * Esta clase se utilizara en caso de que no recordemos nuestra contraseña poder 
 * cambiarla
 * 
 */
public class Recuperar extends javax.swing.JFrame {
    public boolean existe = false;
    String iusuario;
    MySqlC mysql = new MySqlC();
            

    /**
     * Creates new form Recuperar
     */
    public Recuperar() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(VerCorreo.DISPOSE_ON_CLOSE);
        mysql.conn();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rusuarioField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rpreguntaField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rrespuestaField = new javax.swing.JTextField();
        cargarpregunta = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rnpassField = new javax.swing.JTextField();
        rcnpassField = new javax.swing.JTextField();
        Resetear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar contraseña - Correo");

        jLabel1.setText("Tu usuario:");

        jLabel2.setText("Pregunta secreta:");

        jLabel3.setText("Respuesta:");

        cargarpregunta.setText("Cargar pregunta");
        cargarpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarpreguntaActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel4.setText("Nueva contraseña:");

        jLabel5.setText("Confirmar contraseña:");

        Resetear.setText("Resetear");
        Resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearActionPerformed(evt);
            }
        });

        jLabel6.setText("3-15 caracteres");

        jLabel7.setText("5-15 caracteres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rrespuestaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rcnpassField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(rnpassField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(rpreguntaField)))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Resetear)
                        .addGap(177, 177, 177)
                        .addComponent(salir)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rusuarioField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62)
                        .addComponent(cargarpregunta)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rusuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cargarpregunta)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rpreguntaField))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rrespuestaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rnpassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rcnpassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetear)
                    .addComponent(salir))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * Al presionar el boton salir se cierra la conexion y el programa
 */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // Codigo de sair
        mysql.close();
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed
/**
 * 
 * @param pregunta en este parametro se recoje cual es la pregunta secreta elegida 
 * por el usuario. Estas preguntas estan guardadas en la BD
 * @param contador
 * @param rs Es un parametro de tipo ResultSet mediante el cual se recoje la consulta 
 * para consultar en la vase de datos el usuario
 * @param iusuario recoje el usuario introducido en el JTextField
 * 
 */
    private void cargarpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarpreguntaActionPerformed
        try {
            // Cargar pregunta secreta
            String pregunta = null;
            int contador = 0;
            ResultSet rs = null;
            iusuario = rusuarioField.getText();
            rs = mysql.consulta("Select * from usuarios where usuario = '"+iusuario+"'");
            while (rs.next()){
                contador++;
                pregunta = rs.getString(4);
            }
            if (contador == 0) { JOptionPane.showMessageDialog(null, "El nombre de usuario no existe" , "Error",JOptionPane.ERROR_MESSAGE); }
            else {  rpreguntaField.setText(pregunta);}
        } catch (SQLException ex) {
            Logger.getLogger(Recuperar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_cargarpreguntaActionPerformed
/**
 * Al presionar el boton restear se guardan los cambios realizados por el usuario para cambiar su contraseña
 * Tamibién se define los parametros que debe cumplir la contraseña.
 * @param irpass recoje el valor en el JTexfield rnpassField
 * @param ircpass recoje el valor del JTexfield rcnpassField
 * @param irespuesta recoje el valor del JTexfield rcnpassField
 */
    private void ResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetearActionPerformed
        // Resetear contraseña
        String irpass = rnpassField.getText();
        String ircpass = rcnpassField.getText();
        String irespuesta = rrespuestaField.getText();
         if ((irpass.trim().length()==0)||(ircpass.trim().length()==0)||(irespuesta.trim().length()==0)){ JOptionPane.showMessageDialog(null, "Tienes que rellenar todos los campos" , "Error",JOptionPane.ERROR_MESSAGE); } 
         else if ((irpass.trim().length()<5)||(irpass.trim().length()>15)) {JOptionPane.showMessageDialog(null, "La contraseña tiene que tener 6 caracteres como minimo y 15 como maximo" , "Error",JOptionPane.ERROR_MESSAGE);}
         else if (!irpass.equals(ircpass)){ JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden" , "Error",JOptionPane.ERROR_MESSAGE); }  
         else {
         mysql.accion("update usuarios set pass = '"+irpass+"' where usuario = '"+iusuario+"' ");
         mysql.close();
         JOptionPane.showMessageDialog(null, "La contraseña ha cambiado!" , "Contraseña cambiada!",JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
         }
    }//GEN-LAST:event_ResetearActionPerformed

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
            java.util.logging.Logger.getLogger(Recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recuperar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resetear;
    private javax.swing.JButton cargarpregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField rcnpassField;
    private javax.swing.JTextField rnpassField;
    private javax.swing.JLabel rpreguntaField;
    private javax.swing.JTextField rrespuestaField;
    private javax.swing.JTextField rusuarioField;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
