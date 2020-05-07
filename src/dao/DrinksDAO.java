    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.Drinks;


public class DrinksDAO {
    public List<Drinks> getAllDrinks() {
        List<Drinks> listDrinks = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Drinks ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Drinks d = new Drinks();
               d.setIDdrinks(rs.getInt("IDDrinks"));
               d.setName(rs.getString("Name"));
               d.setPrice(rs.getInt("Price"));
               listDrinks.add(d);
            }
            
            return listDrinks;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public Drinks getDrinksByID(int ID) {
        
        try {
            Drinks d = new Drinks();
            String sql = "SELECT * FROM Drinks Where IDDrinks =?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
               d.setIDdrinks(rs.getInt("IDDrinks"));
               d.setName(rs.getString("Name"));
               d.setPrice(rs.getInt("Price"));
               
            }
            return  d;
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public List<Drinks> getDrinksByName(String nameDrinks) {
        List<Drinks> listDrinks = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Drinks WHERE Name like N'%"+nameDrinks+"%'";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Drinks d = new Drinks();
                d.setIDdrinks(rs.getInt("IDDrinks"));
                d.setName(rs.getString("Name"));
                d.setPrice(rs.getInt("Price"));
                listDrinks.add(d);

            }
            
            return listDrinks;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    
     public void addDrinks(Drinks d) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Drinks (IDDrinks,Name,Price)"
                    + " VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, d.getIDdrinks());
            ps.setString(2, d.getName());
            ps.setInt(3, d.getPrice());

            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }    
        public void updateDrinks(Drinks d) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Drinks SET Name =? ,Price  =?"
                    +" WHERE IDDrinks =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(3, d.getIDdrinks());
            ps.setString(1, d.getName());
            ps.setInt(2, d.getPrice());
            
            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeDrinks(String IDDrinks){
      try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM Drinks WHERE IDDrinks = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDDrinks);
            int rs1 = ps1.executeUpdate();
            
//            String sql = "DELETE FROM Useroop WHERE IDUser = ? ";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, IDGoods);
//            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
