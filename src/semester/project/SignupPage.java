
package semester.project;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static semester.project.SaveAccountData.SaveToDatabase;
import static semester.project.pathforimage.backgroundpath;

public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
         setSize(850, 769);
         setResizable(false);
        setTitle("Cookin' RN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        
        signupButton.setFocusable(true);
        signupButton.requestFocus();
        
        setLocationRelativeTo(null); // Center the frame on the screens
        
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageIcon = new ImageIcon(backgroundpath);
        Image image = imageIcon.getImage();
        signupPanel = new ImagePanel(image);
        userPassword = new javax.swing.JTextField();
        userPhone = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupPanel.setForeground(new java.awt.Color(0, 0, 0));
        signupPanel.setMaximumSize(new java.awt.Dimension(850, 769));
        signupPanel.setMinimumSize(new java.awt.Dimension(850, 769));
        signupPanel.setPreferredSize(new java.awt.Dimension(850, 769));
        signupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userPassword.setToolTipText(null);
        userPassword.setBorder(null);
        userPassword.setText("Password");
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });
        signupPanel.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 250, 50));
        userPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userPassword.getText().equals("Password")) {
                    userPassword.setText("");
                    userPassword.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (userPassword.getText().isEmpty()) {
                    userPassword.setText("Password");
                    userPassword.setForeground(Color.GRAY);
                }
            }
        });

        userPhone.setToolTipText(null);
        userPhone.setBorder(null);
        userPhone.setText("Phone");
        signupPanel.add(userPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 250, 50));
        userPhone.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userPhone.getText().equals("Phone")) {
                    userPhone.setText("");
                    userPhone.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (userPhone.getText().isEmpty()) {
                    userPhone.setText("Phone");
                    userPhone.setForeground(Color.GRAY);
                }
            }
        });

        userName.setToolTipText("Username");
        userName.setBorder(null);
        userName.setText("Name");
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        signupPanel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 250, 50));
        userName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userName.getText().equals("Name")) {
                    userName.setText("");
                    userName.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (userName.getText().isEmpty()) {
                    userName.setText("Name");
                    userName.setForeground(Color.GRAY);
                }
            }
        });

        signupButton.setBackground(new java.awt.Color(12, 191, 222));
        signupButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign Up");
        signupButton.setBorderPainted(false);
        signupButton.setFocusPainted(false);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        signupPanel.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 250, 69));
        signupButton.requestFocus();

        getContentPane().add(signupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 769));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        String username = userName.getText();
        String password = userPassword.getText();
        String phone = userPhone.getText();
        String values = "'" + username + "'," + phone + ",'" + password + "'";
        
        SaveToDatabase(values);
        LoginPage newFrame = new LoginPage();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton signupButton;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPassword;
    private javax.swing.JTextField userPhone;
    // End of variables declaration//GEN-END:variables
}
