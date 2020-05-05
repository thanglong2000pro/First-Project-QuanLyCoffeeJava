package model;

public class User {

    private int IDUser;
    private String fullName;
    private String gender;
    private String address;
    private String Dob;
    private String Phone;
    private String UserName;
    private String password;
    private String Role;
    private String Shift;
    private int TotalShiftOnMonth;
    private int MoneyShift;
    private int Bonus;
    private int Month;

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public int getTotalShiftOnMonth() {
        return TotalShiftOnMonth;
    }

    public void setTotalShiftOnMonth(int TotalShiftOnMonth) {
        this.TotalShiftOnMonth = TotalShiftOnMonth;
    }

    public int getMoneyShift() {
        return MoneyShift;
    }

    public void setMoneyShift(int MoneyShift) {
        this.MoneyShift = MoneyShift;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public User() {
    }

    public User(int ID, String fullName, String gender,
            String Dob, String address, String phone,
            String UserName, String password, String Role) {

        this.IDUser = ID;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.Dob = Dob;
        this.UserName = UserName;
        this.password = password;
        this.Phone = phone;
        this.Role = Role;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int ID) {
        this.IDUser = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String UserName, String password, String Role) {
        this.UserName = UserName;
        this.password = password;
        this.Role = Role;
    }

    public User(int IDUser, String fullName, String Shift,
            int TotalShiftOnMonth, int MoneyShift, int Bonus, int Month) {
        this.IDUser = IDUser;
        this.fullName = fullName;
        this.Shift = Shift;
        this.TotalShiftOnMonth = TotalShiftOnMonth;
        this.MoneyShift = MoneyShift;
        this.Bonus = Bonus;
        this.Month = Month;
    }

    public User(int id, String Shift, int TotalShiftOnMonth, int MoneyShift,
            int Bonus, int Month) {
        this.Shift = Shift;
        this.TotalShiftOnMonth = TotalShiftOnMonth;
        this.MoneyShift = MoneyShift;
        this.Bonus = Bonus;
        this.Month = Month;
        this.IDUser = id;
    }

}
