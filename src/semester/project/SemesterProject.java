/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semester.project;

import javax.swing.SwingUtilities;

/**
 *
 * @author Desktop
 */
public class SemesterProject {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            LaunchPage frame = new LaunchPage();
            frame.setVisible(true);
        });
        
        
    }
    
}
