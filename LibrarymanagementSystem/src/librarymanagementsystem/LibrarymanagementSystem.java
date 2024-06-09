package librarymanagementsystem;

import java.sql.*;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class  LibrarymanagementSystem {
    Connection con= null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:LMS.db");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public static void main(String args[]){
        ConnectDB();
    }
 
}
