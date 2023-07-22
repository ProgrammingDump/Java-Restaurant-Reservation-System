
package semester.project;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static semester.project.SaveAccountData.loadData;
import static semester.project.pathforimage.backgroundpath;
import static semester.project.pathforimage.usernameCurrentUser;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        setSize(850, 769);
        setResizable(false);
        setTitle("Cookin' RN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        signupherebutton.setFocusable(true);
        signupherebutton.requestFocus();
        
        setLocationRelativeTo(null); // Center the frame on the screens
        
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameText = new javax.swing.JTextField();
        ImageIcon imageIcon = new ImageIcon(backgroundpath);
        Image image = imageIcon.getImage();
        loginpagepanel = new ImagePanel(image);
        passwordText = new javax.swing.JTextField();
        loginloginbutton = new javax.swing.JButton();
        signupherebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setMaximumSize(new java.awt.Dimension(850, 769));
        setMinimumSize(new java.awt.Dimension(850, 769));
        setPreferredSize(new java.awt.Dimension(839, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameText.setBorder(null);
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        usernameText.setText("Username");
        getContentPane().add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 250, 50));
        usernameText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameText.getText().equals("Username")) {
                    usernameText.setText("");
                    usernameText.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameText.getText().isEmpty()) {
                    usernameText.setText("Username");
                    usernameText.setForeground(Color.GRAY);
                }
            }
        });

        loginpagepanel.setAutoscrolls(true);
        loginpagepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginpagepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordText.setToolTipText("");
        passwordText.setText("Password");
        passwordText.setBorder(null);
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        loginpagepanel.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 250, 50));
        passwordText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passwordText.getText().equals("Password")) {
                    passwordText.setText("");
                    passwordText.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passwordText.getText().isEmpty()) {
                    passwordText.setText("Password");
                    passwordText.setForeground(Color.GRAY);
                }
            }
        });

        loginloginbutton.setBackground(new java.awt.Color(12, 191, 222));
        loginloginbutton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        loginloginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginloginbutton.setText("Log In");
        loginloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginloginbuttonActionPerformed(evt);
            }
        });
        loginpagepanel.add(loginloginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 499, 250, 69));
        signupherebutton.requestFocus();

        signupherebutton.setBackground(new java.awt.Color(0, 0, 0));
        signupherebutton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        signupherebutton.setForeground(new java.awt.Color(255, 255, 255));
        signupherebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semester/project/noAccount.png"))); // NOI18N
        signupherebutton.setText("Sign Up Here");
        signupherebutton.setBorder(null);
        signupherebutton.setBorderPainted(false);
        signupherebutton.setFocusPainted(false);
        signupherebutton.setIconTextGap(3);
        signupherebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupherebuttonActionPerformed(evt);
            }
        });
        loginpagepanel.add(signupherebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 250, 69));
        signupherebutton.requestFocus();

        getContentPane().add(loginpagepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void signupherebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupherebuttonActionPerformed
        // TODO add your handling code here:
        SignupPage newFrame = new SignupPage();
        newFrame.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_signupherebuttonActionPerformed

    private void loginloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginloginbuttonActionPerformed
        // TODO add your handling code here:
        String username = usernameText.getText();
        String password = passwordText.getText();
        
        boolean userValidation = false;
        
        try {
            userValidation = loadData(username, password);
        } catch (Exception ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (userValidation)
        {
            usernameCurrentUser = username;
        
        DashboardPage newFrame = new DashboardPage();
        newFrame.setVisible(true);
        dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Error! Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_loginloginbuttonActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginloginbutton;
    private javax.swing.JPanel loginpagepanel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton signupherebutton;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
