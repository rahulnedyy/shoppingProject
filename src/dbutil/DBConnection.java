/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutil;

/**
 *
 * @author rahul1
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static{
        try
        {
           // Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:sqlite:DBs/bbbs.db");
           JOptionPane.showMessageDialog(null, "Connection done seccsefully!");
        }
     /*    catch(ClassNotFoundException cnfe)
        {
             JOptionPane.showMessageDialog(null, "Canm't load the driver!","Error!",JOptionPane.ERROR_MESSAGE);
             cnfe.printStackTrace();
        }*/
        catch(SQLException sqlex)
                {
             JOptionPane.showMessageDialog(null, "Problem in DB!"+sqlex);
             sqlex.printStackTrace();
                } 
       
        }
    public static Connection getConnection(){
        
        return conn;
    }
    public static void closeConnection(){
        try{
            if(conn!=null){
            conn.close();
            JOptionPane.showMessageDialog(null,"Connection clossed successfully");
        }
        }
        catch(SQLException sqlex){
             JOptionPane.showMessageDialog(null,"Problem in closing connection!"+sqlex);
             sqlex.printStackTrace();
        }
    }
}
