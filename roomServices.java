
package services;
import JDBC.JDBCConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import services.roomServices;
import Room.rooms;


public class roomServices {
    
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
     public roomServices () {
        this.jdbccon = new JDBCConnector ();
        this.connection = (Connection) new JDBCConnector().getConnection();
    }
    
    
    public void addroom(rooms room) {
       try {
             sql = "INSERT into roomServices (Name, Categories, Status, Price)values (?,?,?,?);";
             ps = connection.prepareStatement(sql);
             ps.setString(1, room.getName());
             ps.setString(2, room.getCategories());
             ps.setString(3, room.getStatus());
             ps.setInt(4, room.getPrice());
            
             
             int result = ps.executeUpdate();
             if (result > 0){
                 JOptionPane.showMessageDialog(null, " Data is missing ");
             }else{
                 JOptionPane.showMessageDialog(null, " Data Added ");
             }
            } catch (Exception e) {
               Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null,e);
        
            }
        
      
       
    }
    
    public void populationTable (DefaultTableModel model){
        try{
            model.setRowCount(0);
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm = rs.getMetaData();               
            int columnCount = rm.getColumnCount();
            while (rs.next()){
                Object[] row = new Object[columnCount];
                
                for(int i = 1; i < columnCount; i++){
                    row [i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            sql = "SELECT * FROM room";
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
