package conexion;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //@SuppressWarnings("unchecked")
    conexion con = new conexion();
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 310));
        setMinimumSize(new java.awt.Dimension(440, 310));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        btn_ingresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar);
        btn_ingresar.setBounds(60, 230, 130, 60);

        btn_salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir);
        btn_salir.setBounds(230, 230, 130, 60);

        jLabel2.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDOS AL SISTEMA DE BIBLIOTECA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 384, 24);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 130, 67, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 180, 100, 17);

        txt_usuario.setAutoscrolls(false);
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuario);
        txt_usuario.setBounds(190, 120, 190, 30);

        txt_password.setAutoscrolls(false);
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passwordKeyTyped(evt);
            }
        });
        getContentPane().add(txt_password);
        txt_password.setBounds(190, 170, 190, 30);

        jLabel4.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        jLabel4.setText("DEL ARCHIVO REGIONAL - PUNO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 40, 293, 24);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ACCESO AL SISTEMA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 80, 150, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_login.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(445, 330));
        jLabel5.setMinimumSize(new java.awt.Dimension(445, 330));
        jLabel5.setPreferredSize(new java.awt.Dimension(445, 330));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 445, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String login,pass;
        String sql;
        login=this.txt_usuario.getText();
        pass=this.txt_password.getText();
        
        try{
                con.conectar();
                ResultSet res=con.consulta("SELECT * FROM usuarios WHERE usuario='"+login+"' and password='"+pass+"'");
                res.next();
                int a = Integer.parseInt(res.getString(1));
                
                PagPrincipal principal = new PagPrincipal();
                principal.setVisible(true);
                
                con.cierraConexion();
                dispose();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_ingresar.doClick();
       }
    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void txt_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyTyped
             char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_ingresar.doClick();
       }
    }//GEN-LAST:event_txt_passwordKeyTyped
    
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
