
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnection {
     public static Connection getConnection() throws SQLException {
        final  String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBHoop16";
        final String user = "sa";
        final String pass = "maphunglong";      
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(url, user, pass);
            
            return DriverManager.getConnection(url,user,pass);
                    
                
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
        
     }
//     public static void main(String[] args) throws SQLException {
//        Connection c = getConnection();
//        if (c != null) {
//  System.out.println("Thanh cong");
//    }else{
//            System.out.println("ThatBai");
//        }
//        
//     }
}
