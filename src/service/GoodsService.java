
package service;

import dao.GoodsDAO;
import java.util.List;
import model.Goods;


public class GoodsService {
   private GoodsDAO goodsDAO = new GoodsDAO();
   
   public List<Goods> getAllGoods() {
        return goodsDAO.getAllGoods();
    }
   
   public List<Goods> getGoodsByName(String nameGoods){
       return goodsDAO.getGoodsByName(nameGoods);
   }
   public  void removeGoods(String IDGoods){
       goodsDAO.removeGoods(IDGoods);
   }
   
   public  void addGoods(Goods goods){
       goodsDAO.addGoods(goods);
   }
   
   public Goods getGoodsByID(int IDGoods){
       return goodsDAO.getGoodsByID(IDGoods);
   }
   
   public void updateGoods(Goods g) {
        goodsDAO.updateGoods(g);
    }
}
