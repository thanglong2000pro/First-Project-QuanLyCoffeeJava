/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Drinks {
    private  int IDdrinks, price ;
    private  String Name;

    public int getIDdrinks() {
        return IDdrinks;
    }

    public void setIDdrinks(int IDdrinks) {
        this.IDdrinks = IDdrinks;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Drinks() {
    }

    public Drinks(int IDdrinks, int price, String Name) {
        this.IDdrinks = IDdrinks;
        this.price = price;
        this.Name = Name;
    }
    
}
