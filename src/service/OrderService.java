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
 * @author SON.TH183823
 */
public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();
    public List<Order> getAllOrder(){
        return orderDAO.getAllOrder();
    }
    public List<Order> getOrderByID(int IDOrder){
        return  orderDAO.getOrderByID(IDOrder);
    }
    public void addOrder(Order o){
        orderDAO.addOrder(o);
    }
    public void updateOrder(Order o){
        orderDAO.updateOrder(o);
    }
    public  void removeOrder(String IDOrder){
        orderDAO.removeOder(IDOrder);
    }
    public  void removeDrinks(String IDDrinks){
        orderDAO.removeDrinks(IDDrinks);
    }
//    public int getMaxIDOrder(){
//        return  orderDAO.getmaxIDOrder();
//    }
}
