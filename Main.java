package hotelsystem;

import JDBC.JDBCConnector;
import java.sql.Connection;


public class Main {

    public static void JDBCConnect(){
    JDBCConnector connect = new JDBCConnector();
        try {
            Connection root = connect.getConnection();
            if (root != null) {
                System.out.println("Connected nako.");
            }
            else {
                System.out.println("Failed to connect.");
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        JDBCConnect();
        
    }
    
}
