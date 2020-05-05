package dao;

import static dao.JDBCConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SON.TH183823
 */
public class SalaryDAO {
    public User getSalaryByIDandMonth(int IDUser , int Month) {
        
        try {

            String sql = "SELECT * FROM SalaryEmployee WHERE IDUser =? and Month =?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDUser);
            ps.setInt(2, Month);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User u = new User();
                u.setIDUser(resultSet.getInt("IDUser"));
                u.setMonth(resultSet.getInt("Month"));
                u.setShift(resultSet.getString("Shift"));
                u.setTotalShiftOnMonth(resultSet.getInt("TotalShiftOnMonth"));
                u.setMoneyShift(resultSet.getInt("MoneyShift"));
                u.setBonus(resultSet.getInt("Bonus"));
                
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public void updateSalary(User user) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE SalaryEmployee SET Shift =? ,"
                    + "TotalShiftOnMonth=?,MoneyShift=?,Bonus=?"
                    + " WHERE IDUser =? and Month =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(5, user.getIDUser());
            ps.setString(1, user.getShift());
            ps.setInt(2, user.getTotalShiftOnMonth());
            ps.setInt(3, user.getMoneyShift());
            ps.setInt(4, user.getBonus());
            ps.setInt(6, user.getMonth());
           
            
            int rs = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
