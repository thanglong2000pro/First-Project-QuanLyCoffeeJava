package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static dao.JDBCConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LDC;

/**
 *
 * @author SON.TH183823
 */
public class LDCDAO {
    public void addListChoice(LDC ldc) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO ListChoice (IDDrinks,nameDrinks, amount)"
                    + " VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ldc.getIDDrinks());
            ps.setString(2, ldc.getNameDrinks());
            ps.setInt(3, ldc.getAmount());

            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public void removeDrinks(String name){
      try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM ListChoice WHERE nameDrinks = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, name);
            int rs1 = ps1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public  void removeAllList(){
        try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM ListChoice";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            int rs1 = ps1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<LDC> getAllLDC() {
        List<LDC> listLDC = new ArrayList<>();
        try {

            String sql = "SELECT * FROM ListChoice ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               LDC d = new LDC();
               d.setIDDrinks(rs.getInt("IDDrinks"));
               d.setNameDrinks(rs.getString("nameDrinks"));
               d.setAmount(rs.getInt("amount"));
               listLDC.add(d);
            }
            
            return listLDC;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
