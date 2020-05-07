package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dao.LDCDAO;
import java.util.List;
import model.LDC;

/**
 *
 * @author SON.TH183823
 */
public class LDCService {
    private  LDCDAO ldcdao = new LDCDAO();
    public  void addDrinks(LDC ldc ){
        ldcdao.addListChoice(ldc);
    }
    public  void removeDrinks(String nameDrinks){
       ldcdao.removeDrinks(nameDrinks);
   }
    public  void removeAll(){
        ldcdao.removeAllList();
    }
    public  List<LDC> getAllLDC(){
        return ldcdao.getAllLDC();
    }
}
