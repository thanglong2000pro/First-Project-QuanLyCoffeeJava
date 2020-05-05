/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author THANG LONG
 */
public class Order {
    private int IDOrder;
    private String nameDrink;
    private double price;
    private int amount;
    private String nameUser;
    private String nameGuest;
    private String note;
    private int tableNumber;
    private String date;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(int IDOrder, String nameDrink, double price, int amount, String nameUser, String nameGuest, String note, int tableNumber, String date) {
        this.IDOrder = IDOrder;
        this.nameDrink = nameDrink;
        this.price = price;
        this.amount = amount;
        this.nameUser = nameUser;
        this.nameGuest = nameGuest;
        this.note = note;
        this.tableNumber = tableNumber;
        this.date = date;
    }



   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIDOrder() {
        return IDOrder;
    }

    public void setIDOrder(int IDOrder) {
        this.IDOrder = IDOrder;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameGuest() {
        return nameGuest;
    }

    public void setNameGuest(String nameGuest) {
        this.nameGuest = nameGuest;
    }

   
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public Order()
    {
        
    }

  
}
