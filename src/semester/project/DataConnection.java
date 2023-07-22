/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester.project;
import java.sql.*;


/**
 *
 * @author Desktop
 */
public class DataConnection {
    static Connection c;

    public static Connection getCon() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cookin", "root", "PASSSql1");
        }
        return c;
    }

    public static void insertData(String sql) throws Exception {
        getCon().createStatement().executeUpdate(sql);
    }
    
    public static int loadData (String sql) throws Exception {
      Statement st = getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = st.executeQuery(sql);
        rs.last();
        int validation = rs.getRow();
        
        return validation;
    }
    
    public static String loadReservation (String sql) throws Exception {
      Statement st = getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = st.executeQuery(sql);
        rs.first();
        String validation = "";
        
        for(int i=0; i<3 ;i++)
        {
            validation += rs.getString(i+1) + ",";
        }
            
        return validation;
    }
    
    
}
