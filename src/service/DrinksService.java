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
}
