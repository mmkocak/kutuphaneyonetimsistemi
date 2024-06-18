/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kutuphaneotomasyonu;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame {

 
    public GirisEkrani() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kadi_tf = new javax.swing.JTextField();
        passwrd = new javax.swing.JPasswordField();
        btn_giris = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Giriş");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 100, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanici Adi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 186, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 246, 37, -1));
        getContentPane().add(kadi_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 183, 178, -1));
        getContentPane().add(passwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 243, 178, -1));

        btn_giris.setBackground(new java.awt.Color(102, 0, 0));
        btn_giris.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_giris.setForeground(new java.awt.Color(255, 255, 255));
        btn_giris.setText("Giriş");
        btn_giris.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 349, 178, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphaneotomasyonu/kutuphane3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -280, 790, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        String username =kadi_tf.getText();
        String password = new String(passwrd.getPassword());
        if(kontrol(username, password)){
            JOptionPane.showMessageDialog(null, "Giriş Başarılı");
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            dispose();
        }
        else{
        JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre yanlış");
        }
    }//GEN-LAST:event_btn_girisActionPerformed
    private boolean kontrol(String username, String password){
    boolean isValid = false;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try{
            conn = (Connection) Databasebglnt.getConnection();
            String sql = "SELECT * FROM admin WHERE USER_ID=? AND PASSWORD=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
             if (rs.next()) {
                isValid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            new Databasebglnt().ShowEror(e);
        } finally {
            // Kaynakları serbest bırak
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isValid;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kadi_tf;
    private javax.swing.JPasswordField passwrd;
    // End of variables declaration//GEN-END:variables
}
