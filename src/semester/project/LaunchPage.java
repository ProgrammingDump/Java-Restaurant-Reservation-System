
package semester.project;

import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static semester.project.pathforimage.backgroundpath;

/**
 *
 * @author Desktop
 */
public class LaunchPage extends javax.swing.JFrame {

    public LaunchPage() {
        
        setSize(850, 769);
         setResizable(false);
        setTitle("Cookin' RN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        initComponents();

        setLocationRelativeTo(null); // Center the frame on the screens
        
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaunchPage().setVisible(true);
            }
        });
        
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
        javax.swing.JPanel jPanel1 = new ImagePanel(image);
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cookin' RN");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(850, 769));
        setMinimumSize(new java.awt.Dimension(850, 769));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 769));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 769));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 769));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(12, 191, 222));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 499, 243, 69));
        jButton1.setFocusPainted(false);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        // Add the image panel to the frame

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                LoginPage newFrame = new LoginPage();
                newFrame.setVisible(true);
                dispose(); 
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
