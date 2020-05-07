/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SON.TH183823
 */
public class Bill {
    private int IDOrder , doanhThu;
    private String date;

    public int getIDOrder() {
        return IDOrder;
    }

    public void setIDOrder(int IDOrder) {
        this.IDOrder = IDOrder;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bill() {
    }

    public Bill(int IDOrder, int doanhThu, String date) {
        this.IDOrder = IDOrder;
        this.doanhThu = doanhThu;
        this.date = date;
    }
            
}
