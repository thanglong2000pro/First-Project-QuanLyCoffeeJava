
package model;


public class Goods {
   private int IDGoods;
   private String NameGoods;
   private int price;
   private int amount;
   private String importDate;

    public int getIDGoods() {
        return IDGoods;
    }

    public void setIDGoods(int IDGoods) {
        this.IDGoods = IDGoods;
    }

    public String getNameGoods() {
        return NameGoods;
    }

    public void setNameGoods(String NameGoods) {
        this.NameGoods = NameGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }
    

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Goods() {
    }

    public Goods(int IDGoods, String NameGoods, int price, int amount,String importDate) {
        this.IDGoods = IDGoods;
        this.NameGoods = NameGoods;
        this.price = price;
        this.amount = amount;
        this.importDate = importDate;
    }
   
   
}
