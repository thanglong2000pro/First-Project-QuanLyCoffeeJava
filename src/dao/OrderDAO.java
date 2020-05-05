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
import model.Order;

/**
 *
 * @author THANG LONG
 */
public class OrderDAO {
    public List<Order> getAllOrder() {
        List<Order> listOrder = new ArrayList<>();
        try {

            String sql = "SELECT IDOrder,dbo.Drinks.Name,Price,Amount,dbo.Useroop.FullName,dbo.Guest.name,Note,TableNumber,Date\n" +
" FROM dbo.[Order],dbo.Drinks,dbo.Useroop,dbo.Guest \n" +
" WHERE dbo.[Order].IDDrinks = Drinks.IDDrinks AND\n" +
" dbo.[Order].IDUser = Useroop.IDUser AND\n" +
" [Order].IDGuest = Guest.IDguest  ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Order order = new Order();
                order.setIDOrder(resultSet.getInt("IDOrder"));
                order.setNameDrink(resultSet.getString("Name"));
                order.setPrice(resultSet.getDouble("Price"));
                order.setAmount(resultSet.getInt("Amount"));
                order.setNameUser(resultSet.getString("FullName"));
                order.setNameGuest(resultSet.getString("name"));
                order.setNote(resultSet.getString("Note"));
                order.setTableNumber(resultSet.getInt("TableNumber"));
                order.setDate(resultSet.getString("Date"));
                listOrder.add(order);

            }
            
            return listOrder;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    public Order getOrderByID(int IDOrder)
    {
        try {

            String sql = "SELECT IDOrder,dbo.Drinks.Name,Price,Amount,dbo.Useroop.FullName,dbo.Guest.name,Note,TableNumber,Date\n" +
" FROM dbo.[Order],dbo.Drinks,dbo.Useroop,dbo.Guest \n" +
" WHERE dbo.[Order].IDDrinks = Drinks.IDDrinks AND\n" +
" dbo.[Order].IDUser = Useroop.IDUser AND\n" +
" [Order].IDGuest = Guest.IDguest AND IDOrder =?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDOrder);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Order order = new Order();
                order.setIDOrder(resultSet.getInt("IDOrder"));
                order.setNameDrink(resultSet.getString("Name"));
                order.setPrice(resultSet.getDouble("Price"));
                order.setAmount(resultSet.getInt("Amount"));
                order.setNameUser(resultSet.getString("FullName"));
                order.setNameGuest(resultSet.getString("name"));
                order.setNote(resultSet.getString("Note"));
                order.setTableNumber(resultSet.getInt("TableNumber"));
                order.setDate(resultSet.getString("Date"));
                return order;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
