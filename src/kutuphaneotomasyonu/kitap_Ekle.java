/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kutuphaneotomasyonu;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class kitap_Ekle extends javax.swing.JFrame {

    /**
     * Creates new form kitap_Ekle
     */
    public kitap_Ekle() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(86, 228, 240));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 0));
        jButton5.setText("Kopya");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 471, -1, -1));

        jButton4.setBackground(new java.awt.Color(86, 228, 240));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 0));
        jButton4.setText("Yazar");
        jButton4.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 363, -1, -1));

        jButton3.setBackground(new java.awt.Color(86, 228, 240));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("İsim");
        jButton3.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 255, -1, -1));

        jButton2.setBackground(new java.awt.Color(86, 228, 240));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Kategori");
        jButton2.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 147, -1, -1));

        jButton1.setBackground(new java.awt.Color(86, 228, 240));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Kitap ID");
        jButton1.setPreferredSize(new java.awt.Dimension(120, 40));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 39, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 39, 255, 40));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 147, 255, 40));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 255, 255, 40));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 363, 255, 40));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 471, 255, 40));

        jButton6.setBackground(new java.awt.Color(102, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("GERİ");
        jButton6.setPreferredSize(new java.awt.Dimension(140, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 593, -1, -1));

        jButton7.setBackground(new java.awt.Color(102, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("EKLE");
        jButton7.setPreferredSize(new java.awt.Dimension(140, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 593, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\muhammed\\Desktop\\kuptuphane1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, -450, 1470, 1160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Dashboard dsboard = new Dashboard();
        dsboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Connection conn = null;
        PreparedStatement pstmt = null;
        String id = t1.getText();
        String category = t2.getText();
        String name = t3.getText();
        String author = t4.getText();
        int copies =Integer.parseInt(t5.getText());
        String checkQuery = "SELECT COUNT(*) FROM books WHERE name = ? AND category = ? AND author = ?";
        String updateQuery = "UPDATE books SET copies = ? WHERE name = ? AND category = ? AND author = ?";
        String insertQuery = "INSERT INTO books (BOOK_ID, category, name, author, copies) VALUES (?, ?, ?, ?, ?)";
        try
        {
         conn = Databasebglnt.getConnection();
        pstmt = conn.prepareStatement(checkQuery);
        pstmt.setString(1, name);
        pstmt.setString(2, category);
        pstmt.setString(3, author);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        pstmt.close();
         if (count > 0) {
            // Mevcut kitabın kopya sayısını güncelle
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setInt(1, copies);
            pstmt.setString(2, name);
            pstmt.setString(3, category);
            pstmt.setString(4, author);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kopya başarıyla güncellendi");
        } else {
            // Yeni kitap ekle
            pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, id);
            pstmt.setString(2, category);
            pstmt.setString(3, name);
            pstmt.setString(4, author);
            pstmt.setInt(5, copies);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Kitap başarıyla eklendi");
        }
         t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(kitap_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitap_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitap_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitap_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_Ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
