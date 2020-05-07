/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DrinksDAO;
import java.util.List;
import model.Drinks;


public class DrinksService {
    private  DrinksDAO drinksDAO = new DrinksDAO();
    
    public List<Drinks> getAllDrinks() {
        return drinksDAO.getAllDrinks();
    }
    public List<Drinks> getDrinksByName(String name) {
        return drinksDAO.getDrinksByName(name);
    }
    
    public void updateDrinks(Drinks g) {
        drinksDAO.updateDrinks(g);
    }
    
    public  void addDrinks(Drinks d){
       drinksDAO.addDrinks(d);
   }
    
    public  void removeDrinks(String IDDrinks){
       drinksDAO.removeDrinks(IDDrinks);
   }
    public Drinks getDrinksByID(int ID) {
        return drinksDAO.getDrinksByID(ID);
    }
}
