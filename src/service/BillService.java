/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.BillDAO;
import java.util.List;
import model.Bill;

/**
 *
 * @author SON.TH183823
 */
public class BillService {
    private BillDAO billDAO = new BillDAO();
    public  List<Bill> getAllBills(){
        return billDAO.getAllBills();
    } 
    public Bill getBillByID(int IDOrder){
        return  billDAO.getBillByID(IDOrder);
    }
    public void addBill(Bill b){
        billDAO.addBill(b);
    }
    public void removeBill(int IDOrder){
        billDAO.removeBill(IDOrder);
    }
    public void removeAllBills(){
        billDAO.removeAllBills();
    }
    public List<Bill> getBillByDate(String date){
        return billDAO.getBillByDate(date);
    }
}
