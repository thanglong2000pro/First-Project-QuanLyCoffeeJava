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

import model.User;

public class UserDAO {

    public List<User> getAllUsers() {
        List<User> listUser = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Useroop ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setIDUser(resultSet.getInt("IDUser"));
                user.setFullName(resultSet.getString("FullName"));
                user.setGender(resultSet.getString("Gender"));
                user.setDob(resultSet.getString("DOB"));
                user.setAddress(resultSet.getString("Address"));
                user.setPhone(resultSet.getString("Phone"));
                user.setUserName(resultSet.getString("UserName"));
                user.setPassword(resultSet.getString("Password"));
                user.setRole(resultSet.getString("Role"));
                listUser.add(user);

            }
            return listUser;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<User> getAllUserNames() {
        List<User> listUser = new ArrayList<>();
        try {
            String sql = "SELECT UserName,Password,Role FROM Useroop ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setUserName(resultSet.getString("UserName"));
                user.setPassword(resultSet.getString("Password"));
                user.setRole(resultSet.getString("Role"));
                listUser.add(user);

            }
            return listUser;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void addUser(User user) {
        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Useroop (IDUser,"
                    + "FullName,Gender,Dob,Address,Phone,UserName,Password,Role)"
                    + " VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, user.getIDUser());
            ps.setString(2, user.getFullName());
            ps.setString(3, user.getGender());
            ps.setString(4, user.getDob());
            ps.setString(6, user.getPhone());
            ps.setString(5, user.getAddress());
            ps.setString(7, user.getUserName());
            ps.setString(8, user.getPassword());
            ps.setString(9, user.getRole());

            int rs = ps.executeUpdate();
            if (user.getRole().equals("Employee")) {
                String sql0 = "INSERT INTO SalaryEmployee (IDUser,Month) VALUES (?,?)";
                for (int i = 1; i < 13; i++) {
                    PreparedStatement ps0 = connection.prepareStatement(sql0);
                    ps0.setInt(1, user.getIDUser());
                    ps0.setInt(2, i);
                    int rs0 = ps0.executeUpdate();
                }
            }

//                      String sql0 = "INSERT INTO SalaryEmployee (IDUser) VALUES (?)";
//            PreparedStatement ps0 = connection.prepareStatement(sql0);
//            ps0.setInt(1, user.getIDUser());
//            int rs0 = ps0.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeUser(String IDUser) {
        try {
            Connection connection = getConnection();
            String sql1 = "DELETE FROM SalaryEmployee WHERE IDUser = ? ";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, IDUser);
            int rs1 = ps1.executeUpdate();

            String sql = "DELETE FROM Useroop WHERE IDUser = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, IDUser);
            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateUserEA(User user) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Useroop SET FullName =? ,Gender=?,Dob=?,Address=?,"
                    + "Phone=?,UserName=?,Password=? , Role =? WHERE IDUser =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(9, user.getIDUser());
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getDob());
            ps.setString(5, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(6, user.getUserName());
            ps.setString(7, user.getPassword());
            ps.setString(8, user.getRole());
            int rs = ps.executeUpdate();
            String sql0 = "DELETE FROM SalaryEmployee WHERE IDUser = ? ";

            PreparedStatement ps0 = connection.prepareStatement(sql0);
            ps0.setInt(1, user.getIDUser());
            int rs0 = ps0.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateUserAE(User user) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Useroop SET FullName =? ,Gender=?,Dob=?,Address=?,"
                    + "Phone=?,UserName=?,Password=? , Role =? WHERE IDUser =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(9, user.getIDUser());
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getDob());
            ps.setString(5, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(6, user.getUserName());
            ps.setString(7, user.getPassword());
            ps.setString(8, user.getRole());
            int rs = ps.executeUpdate();
            String sql0 = "INSERT INTO SalaryEmployee (IDUser,Month) VALUES (?,?)";
            for (int i = 1; i < 13; i++) {
                PreparedStatement ps0 = connection.prepareStatement(sql0);
                ps0.setInt(1, user.getIDUser());
                ps0.setInt(2, i);
                int rs0 = ps0.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateUser(User user) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Useroop SET FullName =? ,Gender=?,Dob=?,Address=?,"
                    + "Phone=?,UserName=?,Password=? , Role =? WHERE IDUser =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(9, user.getIDUser());
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getDob());
            ps.setString(5, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(6, user.getUserName());
            ps.setString(7, user.getPassword());
            ps.setString(8, user.getRole());
            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public User getUserByID(int IDUser) {

        try {

            String sql = "SELECT * FROM Useroop WHERE IDUser =?";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDUser);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User u = new User();
                u.setIDUser(resultSet.getInt("IDUser"));
                u.setFullName(resultSet.getString("FullName"));
                u.setGender(resultSet.getString("Gender"));
                u.setDob(resultSet.getString("DOB"));
                u.setAddress(resultSet.getString("Address"));
                u.setPhone(resultSet.getString("Phone"));
                u.setUserName(resultSet.getString("UserName"));
                u.setPassword(resultSet.getString("Password"));
                u.setRole(resultSet.getString("Role"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<User> getSalaryEmployeeByID(int IDUser) {
        List<User> listE = new ArrayList<>();
        try {

            String sql = "select Useroop.IDUser , FullName,Month,Shift, TotalShiftOnMonth,"
                    + " MoneyShift ,Bonus from Useroop inner join SalaryEmployee ON Useroop.IDUser = "
                    + "SalaryEmployee.IDUser where Useroop.Role = 'Employee' and Useroop.IDUser=? ";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, IDUser);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setIDUser(resultSet.getInt("IDUser"));
                user.setFullName(resultSet.getString("FullName"));
                user.setMonth(resultSet.getInt("Month"));
                user.setShift(resultSet.getString("Shift"));
                user.setTotalShiftOnMonth(resultSet.getInt("TotalShiftOnMonth"));
                user.setMoneyShift(resultSet.getInt("MoneyShift"));
                user.setBonus(resultSet.getInt("Bonus"));

                listE.add(user);

            }
            return listE;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<User> getAllEmployees() {
        List<User> listE = new ArrayList<>();
        try {

            String sql = "select IDUser , FullName, Gender,DOB,Address,"
                    + " Phone from Useroop where Role like 'Employee'";

            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setIDUser(resultSet.getInt("IDUser"));
                user.setFullName(resultSet.getString("FullName"));
                user.setGender(resultSet.getString("Gender"));
                user.setDob(resultSet.getString("DOB"));
                user.setAddress(resultSet.getString("Address"));
                user.setPhone(resultSet.getString("Phone"));
                listE.add(user);

            }
            return listE;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void updateUserPassword(User user) {
        try {
            Connection connection = getConnection();
            String sql = "UPDATE Useroop SET Password=? WHERE IDUser =?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(2, user.getIDUser());
            ps.setString(1, user.getPassword());

            int rs = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
