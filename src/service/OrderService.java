/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import dao.OrderDAO;
import java.util.List;
import model.Order;

/**
 *
 * @author THANG LONG
 */
public class OrderService {
    private  OrderDAO orderDAO = new OrderDAO();
    
    public List<Order> getAllOrder() {
        return orderDAO.getAllOrder();
    }
    public Order getOrderByID(int IDOrder) {

        return orderDAO.getOrderByID(IDOrder);
    }
}
