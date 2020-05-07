
package dao;

import static dao.JDBCConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Guest;



public class GuestDAO {
     public List<Guest> getAllGuests() {
        List<Guest> listguest = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Guest ORDER BY accumulatedPoints DESC ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Guest g = new Guest();
                g.setIDGuest(resultSet.getInt("IDGuest"));
                g.setName(resultSet.getString("name"));
                g.setPhone(resultSet.getString("phone"));
                g.setAccumulatedPoints(resultSet.getInt("accumulatedPoints"));   
                listguest.add(g);
            }
            return listguest;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
     
      public List<Guest> getGuestsByName(String name) {
        List<Guest> listGuests = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Guest WHERE name like N'%"+name+"%' ORDER BY accumulatedPoints DESC ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
              Guest g = new Guest();
                g.setIDGuest(resultSet.getInt("IDGuest"));
                g.setName(resultSet.getString("name"));
                g.setPhone(resultSet.getString("phone"));
                g.setAccumulatedPoints(resultSet.getInt("accumulatedPoints"));   
                listGuests.add(g);
            }
            
            return listGuests;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
      
    public void removeGuest(String IDGuest){
      try {
            Connection connection = getConnection();
            String sql = "DELETE FROM Orderoop WHERE IDGuest = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, IDGuest);
            int rs = ps.executeUpdate();
            
            String sql1 = "DELETE FROM Guest WHERE IDGuest = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDGuest);
            int rs1 = ps1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
     public void updateGuest(Guest g) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Guest SET name =? ,phone =?,accumulatedPoints=?"
                    +" WHERE IDGuest =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(4, g.getIDGuest());
            ps.setString(1, g.getName());
            ps.setString(2, g.getPhone());
            ps.setInt(3, g.getAccumulatedPoints());
            
            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public Guest getGuestsByID(int ID) {
       
        try {

            String sql = "SELECT * FROM Guest WHERE IDGuest= ? " ;
            Connection connection = getConnection();
           
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet resultSet = ps.executeQuery();
            Guest g = new Guest();
            while (resultSet.next()) {
                
                g.setIDGuest(resultSet.getInt("IDGuest"));
                g.setName(resultSet.getString("name"));
                g.setPhone(resultSet.getString("phone"));
                g.setAccumulatedPoints(resultSet.getInt("accumulatedPoints"));   
              
            }
            
            return g;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
      public Guest getGuestsByPhone(String phone) {
        Guest g = new Guest();
        try {

            String sql = "SELECT * FROM Guest WHERE phone =? ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                g.setIDGuest(resultSet.getInt("IDGuest"));
                g.setName(resultSet.getString("name"));
                g.setPhone(resultSet.getString("phone"));
                g.setAccumulatedPoints(resultSet.getInt("accumulatedPoints"));   
            }
            
            return g;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
      
      public void addGuest(Guest g) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Guest (IDguest,name,phone,accumulatedPoints)"
                    + " VALUES (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, g.getIDGuest());
            ps.setString(2, g.getName());
            ps.setString(3, g.getPhone());
            ps.setInt(4, g.getAccumulatedPoints());
            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
