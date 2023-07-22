/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester.project;

import javax.swing.JOptionPane;

/**
 *
 * @author Desktop
 */
public class SaveAccountData {
    public static void SaveToDatabase(String values) {
        try {
            DataConnection.insertData("insert into accounts (username, phone, password) values ("+ values +");");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static boolean loadData(String username, String password) throws Exception{
         boolean check = false;
        try {
           int validation = DataConnection.loadData("select * from accounts where username = '" + username + "' and password = '" + password + "'");
            System.out.println(validation);
           if ( validation != 0)
           {
            check = true;
           }
           else
           {
               check = false;
           }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
            return check;
    }
    
    public static void SaveReservation (String values)
    {
        try {
            DataConnection.insertData("insert into reservations (reservationNumber, dateTime, capacity, username) values ("+ values +");");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static String loadReservation(int reservationNumber) throws Exception{
        String validation = "";
        try {
           validation = DataConnection.loadReservation("select * from reservations where reservationNumber = 1");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
            return validation;
    }
    
    
}


            
