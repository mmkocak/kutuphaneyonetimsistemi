/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kutuphaneotomasyonu;


public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphaneotomasyonu/kutuphane2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 540));
        setPreferredSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("KONTROL PANELİ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 240, -1));

        b1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b1.setText("Mevcut Kitaplar");
        b1.setPreferredSize(new java.awt.Dimension(140, 27));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 30));

        b2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b2.setText("Kitap Ekle");
        b2.setPreferredSize(new java.awt.Dimension(140, 27));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 170, 30));

        b3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b3.setText("Kitap Sil");
        b3.setPreferredSize(new java.awt.Dimension(140, 27));
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 170, 30));

        b4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b4.setText("Personel Detayları");
        b4.setPreferredSize(new java.awt.Dimension(140, 27));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 170, 30));

        b5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b5.setText("Personel Ekle");
        b5.setPreferredSize(new java.awt.Dimension(140, 27));
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 170, 30));

        b6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b6.setText("Personel Sil");
        b6.setPreferredSize(new java.awt.Dimension(140, 27));
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 170, 30));

        b7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        b7.setText("Yöneticiyi Düzenle");
        b7.setPreferredSize(new java.awt.Dimension(140, 27));
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphaneotomasyonu/kutuphane2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        kitap_Ekle ktekle = new kitap_Ekle();
        ktekle.setVisible(true);
        dispose();    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        mevcutKitaplar mvkitap = new mevcutKitaplar();
        mvkitap.setVisible(true);
        dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        PersonelDetay pdetay = new PersonelDetay();
        pdetay.setVisible(true);
        dispose();
    }//GEN-LAST:event_b4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
