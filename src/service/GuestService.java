
package service;

import dao.GuestDAO;
import java.util.List;
import model.Guest;


public class GuestService {
   //private Guest guest;
   private GuestDAO guestDAO; 

    public GuestService() {
        guestDAO = new GuestDAO();
    }
   public List<Guest> getAllGuests() {
        return guestDAO.getAllGuests();
    }
   
   public List<Guest> getGuestsByName(String name){
       return guestDAO.getGuestsByName(name);
   }
   public  void removeGuest(String IDGuest){
       guestDAO.removeGuest(IDGuest);
   }
   public void updateGoods(Guest g) {
        guestDAO.updateGuest(g);
    }
   public Guest getGuestsByID(int ID){
       return guestDAO.getGuestsByID(ID);
   }
}
