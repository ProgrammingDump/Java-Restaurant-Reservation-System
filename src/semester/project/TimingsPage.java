/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semester.project;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static semester.project.pathforimage.backgroundpath;

public class TimingsPage extends javax.swing.JFrame {

    /**
     * Creates new form Timings
     */
    public TimingsPage() {
        setSize(850, 769);
         setResizable(false);
        setTitle("Cookin' RN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageIcon = new ImageIcon(backgroundpath);
        Image image = imageIcon.getImage();
        jPanel1 = new ImagePanel(image);
        timingsTime2 = new javax.swing.JLabel();
        timingsHeading = new javax.swing.JLabel();
        timingsLabel1 = new javax.swing.JLabel();
        timingsLabel2 = new javax.swing.JLabel();
        timingTime1 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 769));
        setMinimumSize(new java.awt.Dimension(850, 769));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 769));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 769));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 769));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timingsTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timingsTime2.setForeground(new java.awt.Color(12, 191, 222));
        timingsTime2.setText("02:00 PM - 04:00 AM");
        jPanel1.add(timingsTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, 50));

        timingsHeading.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        timingsHeading.setForeground(new java.awt.Color(12, 191, 222));
        timingsHeading.setText("Restaurant Timings");
        jPanel1.add(timingsHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 440, 100));

        timingsLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timingsLabel1.setForeground(new java.awt.Color(12, 191, 222));
        timingsLabel1.setText("Monday to Thursday");
        jPanel1.add(timingsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 360, 50));

        timingsLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timingsLabel2.setForeground(new java.awt.Color(12, 191, 222));
        timingsLabel2.setText("Friday to Sunday");
        jPanel1.add(timingsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 300, 50));

        timingTime1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timingTime1.setForeground(new java.awt.Color(12, 191, 222));
        timingTime1.setText("11:00 AM - 02:00 AM");
        jPanel1.add(timingTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 50));

        menuButton.setBackground(new java.awt.Color(12, 191, 222));
        menuButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Back");
        menuButton.setBorderPainted(false);
        menuButton.setFocusPainted(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 250, 69));
        menuButton.requestFocus();

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 769));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        DashboardPage newFrame = new DashboardPage();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TimingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimingsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel timingTime1;
    private javax.swing.JLabel timingsHeading;
    private javax.swing.JLabel timingsLabel1;
    private javax.swing.JLabel timingsLabel2;
    private javax.swing.JLabel timingsTime2;
    // End of variables declaration//GEN-END:variables
}
