package service;


import dao.SalaryDAO;
import dao.UserDAO;
import java.util.List;
import model.User;


public class UserService {

    private UserDAO userDAO;
    private  SalaryDAO salaryDAO;
   

    public UserService() {
        userDAO = new UserDAO();
        salaryDAO =new SalaryDAO();
    }

    public List<User> getAllUser() {
        return userDAO.getAllUsers();
    }

    public void addEmployee(User user) {
        userDAO.addUser(user);
    }

    public void updateUser(User u) {
        userDAO.updateUser(u);
    }

    public void removeUser(String IDUser) {
        userDAO.removeUser(IDUser);
    }
    
    public List<User> getAllUserNames() {
        return userDAO.getAllUserNames();
    } 
    
    public List<User> getAllEmployees() {
        return userDAO.getAllEmployees();
    }

    public User getUserByID(int IDUser) {

        return userDAO.getUserByID(IDUser);
    }
    
     public List<User> getSalaryEmployeeByID(int IDUser) {
        return userDAO.getSalaryEmployeeByID(IDUser);
    }
     
     public User getSalaryByID(int IDUser, int Month) {
            
        return salaryDAO.getSalaryByIDandMonth(IDUser, Month);
     }
     
     public void updateSalary(User u) {
        salaryDAO.updateSalary(u);
    }
     
     public  void changPassUser(User user){
         userDAO.updateUserPassword(user);
     }
}
