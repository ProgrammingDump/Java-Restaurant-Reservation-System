/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semester.project;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static semester.project.pathforimage.backgroundpath;

/**
 *
 * @author Desktop
 */
public class ReservationsPage extends javax.swing.JFrame {

    /**
     * Creates new form ReservationsPage
     */
    public ReservationsPage() {
        
        setSize(850, 769);
        setResizable(false);
        setTitle("Cookin' RN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageIcon = new ImageIcon(backgroundpath);
        Image image = imageIcon.getImage();
        dashboardPanel = new ImagePanel(image);
        updateReservationButton = new javax.swing.JButton();
        cancelReservationButton = new javax.swing.JButton();
        newReservationButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        viewReservationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 769));
        setMinimumSize(new java.awt.Dimension(850, 769));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setMaximumSize(new java.awt.Dimension(850, 769));
        dashboardPanel.setMinimumSize(new java.awt.Dimension(850, 769));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(850, 769));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateReservationButton.setBackground(new java.awt.Color(12, 191, 222));
        updateReservationButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        updateReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        updateReservationButton.setText("Update Reservation");
        updateReservationButton.setBorderPainted(false);
        updateReservationButton.setFocusPainted(false);
        updateReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateReservationButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(updateReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 250, 69));
        updateReservationButton.requestFocus();

        cancelReservationButton.setBackground(new java.awt.Color(12, 191, 222));
        cancelReservationButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cancelReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelReservationButton.setText("Cancel Reservation");
        cancelReservationButton.setBorderPainted(false);
        cancelReservationButton.setFocusPainted(false);
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(cancelReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 250, 69));
        updateReservationButton.requestFocus();

        newReservationButton.setBackground(new java.awt.Color(12, 191, 222));
        newReservationButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        newReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        newReservationButton.setText("New Reservation");
        newReservationButton.setBorderPainted(false);
        newReservationButton.setFocusPainted(false);
        newReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReservationButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(newReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 250, 69));
        updateReservationButton.requestFocus();

        backButton.setBackground(new java.awt.Color(12, 191, 222));
        backButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 160, 50));
        updateReservationButton.requestFocus();

        viewReservationButton.setBackground(new java.awt.Color(12, 191, 222));
        viewReservationButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        viewReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        viewReservationButton.setText("View  Reservation");
        viewReservationButton.setBorderPainted(false);
        viewReservationButton.setFocusPainted(false);
        viewReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReservationButtonActionPerformed(evt);
            }
        });
        dashboardPanel.add(viewReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 250, 69));
        updateReservationButton.requestFocus();

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReservationButtonActionPerformed
        try {
            // TODO add your handling code here:
            ViewReservationPage newFrame;
            newFrame = new ViewReservationPage();
            newFrame.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(ReservationsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewReservationButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        DashboardPage newFrame = new DashboardPage();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void newReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReservationButtonActionPerformed
        // TODO add your handling code here:
        PlaceReservationPage newFrame = new PlaceReservationPage();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_newReservationButtonActionPerformed

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    private void updateReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateReservationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateReservationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReservationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton newReservationButton;
    private javax.swing.JButton updateReservationButton;
    private javax.swing.JButton viewReservationButton;
    // End of variables declaration//GEN-END:variables
}
