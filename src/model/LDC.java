package model;


public class LDC {
    private int IDDrinks,amount;
    private String NameDrinks;

    public int getIDDrinks() {
        return IDDrinks;
    }

    public void setIDDrinks(int IDDrinks) {
        this.IDDrinks = IDDrinks;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNameDrinks() {
        return NameDrinks;
    }

    public void setNameDrinks(String NameDrinks) {
        this.NameDrinks = NameDrinks;
    }

    public LDC() {
    }

    public LDC(int IDDrinks, int amount, String NameDrinks) {
        this.IDDrinks = IDDrinks;
        this.amount = amount;
        this.NameDrinks = NameDrinks;
    }
    
    
}
