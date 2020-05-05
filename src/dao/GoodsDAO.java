
package dao;

import static dao.JDBCConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Goods;


public class GoodsDAO {
    public List<Goods> getAllGoods() {
        List<Goods> listGoods = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Goods ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Goods goods = new Goods();
                goods.setIDGoods(resultSet.getInt("IDGoods"));
                goods.setNameGoods(resultSet.getString("NameGoods"));
                goods.setPrice(resultSet.getInt("Price"));
                goods.setAmount(resultSet.getInt("Amount"));
                goods.setImportDate(resultSet.getString("ImportDate"));            
                listGoods.add(goods);

            }
            
            return listGoods;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
      public List<Goods> getGoodsByName(String nameGoods) {
        List<Goods> listGoods = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Goods WHERE NameGoods like N'%"+nameGoods+"%'";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Goods goods = new Goods();
                goods.setIDGoods(resultSet.getInt("IDGoods"));
                goods.setNameGoods(resultSet.getString("NameGoods"));
                goods.setPrice(resultSet.getInt("Price"));
                goods.setAmount(resultSet.getInt("Amount"));
                goods.setImportDate(resultSet.getString("ImportDate"));            
                listGoods.add(goods);

            }
            
            return listGoods;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
     public void removeGoods(String IDGoods){
      try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM Goods WHERE IDGoods = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDGoods);
            int rs1 = ps1.executeUpdate();
            
//            String sql = "DELETE FROM Useroop WHERE IDUser = ? ";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, IDGoods);
//            int rs = ps.executeUpdate();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
     public void addGoods(Goods goods) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Goods (IDGoods,"
                    + "NameGoods,Price,Amount,ImportDate)"
                    + " VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, goods.getIDGoods());
            ps.setString(2, goods.getNameGoods());
            ps.setInt(3, goods.getPrice());
            ps.setInt(4, goods.getAmount());
            ps.setString(5, goods.getImportDate());

            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public Goods getGoodsByID(int IDGoods) {
        Goods goods = new Goods();
        try {

            String sql = "SELECT * FROM Goods WHERE IDGoods = ?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDGoods);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                
                goods.setIDGoods(resultSet.getInt("IDGoods"));
                goods.setNameGoods(resultSet.getString("NameGoods"));
                goods.setPrice(resultSet.getInt("Price"));
                goods.setAmount(resultSet.getInt("Amount"));
                goods.setImportDate(resultSet.getString("ImportDate"));            
                

            }
            
            return goods;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
     
      public void updateGoods(Goods goods) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Goods SET NameGoods =? ,Price  =?,Amount=?,ImportDate=?"
                    +" WHERE IDGoods =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(5, goods.getIDGoods());
            ps.setString(1, goods.getNameGoods());
            ps.setInt(2, goods.getPrice());
            ps.setInt(3, goods.getAmount());
            ps.setString(4, goods.getImportDate());
            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
