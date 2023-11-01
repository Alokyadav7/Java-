package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.*;


public class MainApp {
    public static void main (String [] arg) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC NOT REGISTER");
            return;
        }
        System.out.println("JDBC REGISTER");
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3304/ALOK", "root", "");
        } catch(SQLExecption e) {
            System.out.println("MY SQL DATABASE NOT CONNECTED");
        }
        if (conn != null) {
            System.out.println("SUCCESS ! DATABASE CONNECTED TO THE DATA");
        }
    }
}
