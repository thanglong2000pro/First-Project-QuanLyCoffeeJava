/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Guest {
    private int IDGuest;
    private String Name;
    private String phone;
    private int accumulatedPoints;

    public int getIDGuest() {
        return IDGuest;
    }

    public void setIDGuest(int IDGuest) {
        this.IDGuest = IDGuest;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccumulatedPoints() {
        return accumulatedPoints;
    }

    public void setAccumulatedPoints(int accumulatedPoints) {
        this.accumulatedPoints = accumulatedPoints;
    }

    public Guest() {
    }

    public Guest(int IDGuest, String Name, String phone, int accumulatedPoints) {
        this.IDGuest = IDGuest;
        this.Name = Name;
        this.phone = phone;
        this.accumulatedPoints = accumulatedPoints;
    }
    
    
}
