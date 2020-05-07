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
public class Order {

    private int IDOrder, IDDrinks, IDUser, IDGuest, amount, TableNumber;
    private String note, Date;

    

   

    public int getIDOrder() {
        return IDOrder;
    }

    public void setIDOrder(int IDOrder) {
        this.IDOrder = IDOrder;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getIDDrinks() {
        return IDDrinks;
    }

    public void setIDDrinks(int IDDrinks) {
        this.IDDrinks = IDDrinks;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public int getIDGuest() {
        return IDGuest;
    }

    public void setIDGuest(int IDGuest) {
        this.IDGuest = IDGuest;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(int TableNumber) {
        this.TableNumber = TableNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Order() {
    }

    public Order(int IDDrinks, int IDUser, int IDGuest, int amount,
            int TableNumber, String note) {
        this.IDDrinks = IDDrinks;
        this.IDUser = IDUser;
        this.IDGuest = IDGuest;
        this.amount = amount;
        this.TableNumber = TableNumber;
        this.note = note;
    }

    public Order(int IDOrder, int IDDrinks, int IDUser, String date,
            int IDGuest, int amount, int TableNumber, String note ) {
        this.IDOrder = IDOrder;
        this.IDDrinks = IDDrinks;
        this.IDUser = IDUser;
        this.IDGuest = IDGuest;
        this.amount = amount;
        this.TableNumber = TableNumber;
        this.note = note;
        this.Date = date;
        
    }

}
