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
import model.Bill;
import model.Drinks;

/**
 *
 * @author SON.TH183823
 */
public class BillDAO {
    public List<Bill> getAllBills() {
        List<Bill> listBill = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Bill ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Bill b = new Bill();
               b.setIDOrder(rs.getInt("IDOrder"));
               b.setDoanhThu(rs.getInt("DoanhThu"));
               b.setDate(rs.getString("Ngay"));
               listBill.add(b);
            }
            
            return listBill;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    public Bill getBillByID(int IDOrder) {
       Bill b = new Bill();
        try {

            String sql = "SELECT * FROM Bill WHERE IDOrder = ? ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDOrder);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
               b.setIDOrder(rs.getInt("IDOrder"));
               b.setDoanhThu(rs.getInt("DoanhThu"));
               b.setDate(rs.getString("Ngay"));
               
            }
            
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    public void addBill(Bill b) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Bill (IDOrder, DoanhThu, Ngay)"
                    + " VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, b.getIDOrder());
            ps.setInt(2, b.getDoanhThu());
            ps.setString(3, b.getDate());

            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    
    public void removeBill(int IDOrder){
      try {
            Connection connection = getConnection();
            
            String sql = "DELETE FROM Orderoop WHERE IDOrder = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDOrder);
            int rs = ps.executeUpdate();

            String sql1 = "DELETE FROM Bill WHERE IDOrder = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setInt(1, IDOrder);
            int rs1 = ps1.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void removeAllBills(){
      try {
            Connection connection = getConnection();
            
            String sql = "DELETE FROM Orderoop ";
            PreparedStatement ps = connection.prepareStatement(sql);            
            int rs = ps.executeUpdate();

            String sql1 = "DELETE FROM Bill";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            int rs1 = ps1.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
     public List<Bill> getBillByDate(String date) {
       List<Bill> listBill = new ArrayList<>();
       
        try {

            String sql = "SELECT * FROM Bill WHERE Ngay like '%" +date +"%'";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Bill b = new Bill();
               b.setIDOrder(rs.getInt("IDOrder"));
               b.setDoanhThu(rs.getInt("DoanhThu"));
               b.setDate(rs.getString("Ngay"));
               listBill.add(b);
            }
            
            return listBill;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
