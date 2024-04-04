
package services;

import JDBCConnector.JDBCConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import hotel.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Register {
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public Register(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
    }
    
    public void sign_in(User user) {
    try {
        sql = "INSERT into login (username, password, email) values(?,?,?)";
        ps = connection.prepareStatement(sql);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "sign up successfully added");
    } catch (SQLException e) {
        Logger.getLogger(customerinfo.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to sign up");
        } 
    
    }
    public void forgot(User user){
        try {
        sql = "UPDATE login SET WHERE idlogin=? AND username=? AND password=?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, user.getIdlogin());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Customer successfully updated");
    } catch (SQLException e) {
        Logger.getLogger(customerinfo.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to update Customer");
    }
    }

    
}
