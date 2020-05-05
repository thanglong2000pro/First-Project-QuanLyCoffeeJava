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
}
