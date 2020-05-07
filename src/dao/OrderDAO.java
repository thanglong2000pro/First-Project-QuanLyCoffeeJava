/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.JDBCConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Order;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SON.TH183823
 */
public class OrderDAO {

    public List<Order> getAllOrder() {
        List<Order> listOrder = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Orderoop";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Order b = new Order();
                b.setIDOrder(rs.getInt("IDOrder"));
                b.setIDUser(rs.getInt("IDUser"));
                b.setIDDrinks(rs.getInt("IDDrinks"));
                b.setIDGuest(rs.getInt("IDGuest"));
                b.setAmount(rs.getInt("Amount"));
                b.setNote(rs.getString("Note"));
                b.setTableNumber(rs.getInt("TableNumber"));
                b.setDate(rs.getString("Date"));
                
                listOrder.add(b);
            }

            return listOrder;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<Order> getOrderByID(int IDOrder) {

        try {
            List<Order> listOrder = new ArrayList<>();
            
            String sql = "SELECT * FROM Orderoop Where IDOrder =?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDOrder);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Order b = new Order();
                b.setIDOrder(rs.getInt("IDOrder"));
                b.setIDUser(rs.getInt("IDUser"));
                b.setIDDrinks(rs.getInt("IDDrinks"));
                b.setIDGuest(rs.getInt("IDGuest"));
                b.setAmount(rs.getInt("Amount"));
                b.setNote(rs.getString("Note"));
                b.setTableNumber(rs.getInt("TableNumber"));
                b.setDate(rs.getString("Date"));
                
                listOrder.add(b);
            }
            return listOrder;

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void addOrder(Order o) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Orderoop (IDOrder,IDDrinks,IDUser,IDGuest,"
                    + "Amount,Note,TableNumber,Date)  VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, o.getIDOrder());
            ps.setInt(2, o.getIDDrinks());
            ps.setInt(3, o.getIDUser());
            ps.setInt(4, o.getIDGuest());
            ps.setInt(5, o.getAmount());
            ps.setString(6, o.getNote());
            ps.setInt(7, o.getTableNumber());
            ps.setString(8, o.getDate());
            

            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateOrder(Order o) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Orderoop SET IDDrinks  =?,IDUser =?,"
                    + "IDGuest = ?,Amount = ?,Note = ?,TableNumber = ?,Date = ?,"
                    + " WHERE IDOrder =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(8, o.getIDOrder());
            ps.setInt(1, o.getIDDrinks());
            ps.setInt(2, o.getIDUser());
            ps.setInt(3, o.getIDGuest());
            ps.setInt(4, o.getAmount());
            ps.setString(5, o.getNote());
            ps.setInt(6, o.getTableNumber());
            ps.setString(7, o.getDate());
          
            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeOder(String IDOrder) {
        try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM Orderoop WHERE IDOrder = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDOrder);
            int rs1 = ps1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removeDrinks (String IDDrinks) {
        try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM Orderoop WHERE IDDrinks = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDDrinks);
            int rs1 = ps1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public List<Order> getOrderByDate(String date)
//    {
//        List<Order> listOrder = new ArrayList<>();
//        try {
//
//            String sql = " " ;
//            Connection connection = getConnection();
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Order b = new Order();
//                b.setIDOrder(rs.getInt("IDOrder"));
//                b.setIDUser(rs.getInt("IDUser"));
//                b.setIDDrinks(rs.getInt("IDDrinks"));
//                b.setIDGuest(rs.getInt("IDGuest"));
//                b.setAmount(rs.getInt("Amount"));
//                b.setNote(rs.getString("Note"));
//                b.setTableNumber(rs.getInt("TableNumber"));
//                b.setDate(rs.getString("Date"));
//                
//                listOrder.add(b);
//            }
//            return listOrder;
//        } catch (SQLException ex) {
//            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return null;
//    }
//    public  int getmaxIDOrder(){
//        Order b = new Order();
//        try {
//
//            String sql = "SELECT TOP (1) IDOrder FROM [Orderoop] ORDER BY IDOrder DESC " ;
//            Connection connection = getConnection();
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {       
//                b.setIDOrder(rs.getInt("IDOrder"));
//            }
//            return b.getIDOrder();
//        } catch (SQLException ex) {
//            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return 0;
//    
//    }
}
