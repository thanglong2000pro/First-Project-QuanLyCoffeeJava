/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Drinks;
import model.Guest;
import model.LDC;
import model.Order;
import model.User;
import service.BillService;
import service.DrinksService;
import service.GuestService;
import service.LDCService;
import service.OrderService;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class MenuEmployeeFrame extends javax.swing.JFrame {

    User user;
    UserService userService;
    Order order;
    OrderService orderService;
    DefaultListModel dlm1;
    DefaultTableModel dtm,dtm2;
    DrinksService drinksService;
    LDC ldc;
    LDCService lDCService = new LDCService();
    Guest guest;
    GuestService guestService;
    BillService billService;
    public MenuEmployeeFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);

        //taikhoan
        userService = new UserService();
        user = userService.getUserByID(IDuser);
        String hoten = user.getFullName().trim();
        int i = hoten.lastIndexOf(' ');
        String ten = hoten.substring(i + 1);
        NameLabel.setText("Xin chào, " + ten + " !");

        IDuserLabel.setText(user.getIDUser() + "");
        GenderLabel.setText(user.getGender());
        roleLabel.setText(user.getRole());
        nameLabel1.setText(user.getFullName());
        dobLabel4.setText(user.getDob());
        DiachiLabel.setText(user.getAddress());
        SDTLabel.setText(user.getPhone());

        //ban hang
        dlm1 = new DefaultListModel();

        drinksService = new DrinksService();
        List<Drinks> listdrinks = drinksService.getAllDrinks();
        listdrinks.forEach((listdrink) -> {
            dlm1.addElement(listdrink.getIDdrinks() + "     "
                    + listdrink.getName() + "       " + listdrink.getPrice() + "đ");
        });
        nameList.setModel(dlm1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        RemoveDButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameGuestTextField = new javax.swing.JTextField();
        phoneGuestTextField = new javax.swing.JTextField();
        DathanhtoanRadioButton = new javax.swing.JRadioButton();
        ChuaThanhtoanRadioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        tableNumberTextField = new javax.swing.JTextField();
        Refesh = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        NameDrinkstextField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        DrinksSpinner = new javax.swing.JSpinner();
        OkDrinks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listchoiceTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ManageDrinksjButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TaiKhoanPanel = new javax.swing.JPanel();
        ChangePassButton = new javax.swing.JButton();
        ThoatButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDuserLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        DiachiLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        dobLabel4 = new javax.swing.JLabel();
        SDTLabel = new javax.swing.JLabel();
        editInforButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        jPanel7.setLayout(null);

        jButton5.setBackground(new java.awt.Color(255, 190, 108));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Nhóm Phát Triển");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);
        jButton5.setBounds(0, 0, 160, 40);

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        NameLabel.setText("Xin chào, Nhung!");
        jPanel7.add(NameLabel);
        NameLabel.setBounds(690, 0, 190, 30);

        jTabbedPane1.setBackground(new java.awt.Color(255, 190, 108));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(null);

        RemoveDButton.setBackground(new java.awt.Color(255, 190, 108));
        RemoveDButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RemoveDButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/xoa.png"))); // NOI18N
        RemoveDButton.setText("Xóa");
        RemoveDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDButtonActionPerformed(evt);
            }
        });
        jPanel6.add(RemoveDButton);
        RemoveDButton.setBounds(350, 10, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tên Khách hàng");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(590, 100, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Số ĐT");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(590, 180, 60, 30);

        nameGuestTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(nameGuestTextField);
        nameGuestTextField.setBounds(590, 140, 210, 30);

        phoneGuestTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(phoneGuestTextField);
        phoneGuestTextField.setBounds(590, 220, 210, 30);

        DathanhtoanRadioButton.setBackground(new java.awt.Color(255, 190, 108));
        DathanhtoanRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DathanhtoanRadioButton.setText("Đã Thanh Toán");
        DathanhtoanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DathanhtoanRadioButtonActionPerformed(evt);
            }
        });
        jPanel6.add(DathanhtoanRadioButton);
        DathanhtoanRadioButton.setBounds(590, 273, 120, 30);

        ChuaThanhtoanRadioButton.setBackground(new java.awt.Color(255, 190, 108));
        ChuaThanhtoanRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ChuaThanhtoanRadioButton.setSelected(true);
        ChuaThanhtoanRadioButton.setText("Thanh Toán sau");
        ChuaThanhtoanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuaThanhtoanRadioButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ChuaThanhtoanRadioButton);
        ChuaThanhtoanRadioButton.setBounds(720, 273, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Số Bàn");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(590, 60, 70, 30);

        tableNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(tableNumberTextField);
        tableNumberTextField.setBounds(680, 60, 50, 30);

        Refesh.setBackground(new java.awt.Color(255, 190, 108));
        Refesh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Refesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/refresh1.png"))); // NOI18N
        Refesh.setText("Refresh");
        Refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefeshActionPerformed(evt);
            }
        });
        jPanel6.add(Refesh);
        Refesh.setBounds(590, 320, 120, 50);

        BillButton.setBackground(new java.awt.Color(255, 190, 108));
        BillButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bill2.png"))); // NOI18N
        BillButton.setText("Hóa Đơn");
        BillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillButtonActionPerformed(evt);
            }
        });
        jPanel6.add(BillButton);
        BillButton.setBounds(720, 320, 130, 50);

        NameDrinkstextField.setEditable(false);
        NameDrinkstextField.setBackground(new java.awt.Color(255, 255, 255));
        NameDrinkstextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameDrinkstextField.setForeground(new java.awt.Color(255, 0, 0));
        NameDrinkstextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameDrinkstextFieldActionPerformed(evt);
            }
        });
        jPanel6.add(NameDrinkstextField);
        NameDrinkstextField.setBounds(438, 10, 120, 30);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Số Lượng");
        jPanel6.add(jLabel43);
        jLabel43.setBounds(590, 10, 80, 30);

        DrinksSpinner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DrinksSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        DrinksSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(DrinksSpinner, ""));
        jPanel6.add(DrinksSpinner);
        DrinksSpinner.setBounds(680, 10, 50, 30);

        OkDrinks.setBackground(new java.awt.Color(255, 190, 108));
        OkDrinks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OkDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add.png"))); // NOI18N
        OkDrinks.setText("Thêm");
        OkDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkDrinksActionPerformed(evt);
            }
        });
        jPanel6.add(OkDrinks);
        OkDrinks.setBounds(760, 10, 90, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 216, 148));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        listchoiceTable.setBackground(new java.awt.Color(255, 190, 108));
        listchoiceTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listchoiceTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listchoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listchoiceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listchoiceTable);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(350, 90, 210, 280);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Chọn đồ");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(430, 60, 110, 22);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel40.setText("Menu");
        jPanel6.add(jLabel40);
        jLabel40.setBounds(100, 0, 120, 40);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Mã số");
        jPanel6.add(jLabel37);
        jLabel37.setBounds(20, 60, 60, 22);

        nameList.setBackground(new java.awt.Color(255, 190, 108));
        nameList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nameList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nameList.setToolTipText("");
        nameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameListMouseEntered(evt);
            }
        });
        jScrollPane15.setViewportView(nameList);

        jPanel6.add(jScrollPane15);
        jScrollPane15.setBounds(20, 90, 298, 280);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Tên");
        jPanel6.add(jLabel38);
        jLabel38.setBounds(130, 60, 50, 22);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Giá");
        jPanel6.add(jLabel39);
        jLabel39.setBounds(260, 60, 40, 22);
        jPanel6.add(jSeparator1);
        jSeparator1.setBounds(30, 40, 280, 2);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        jPanel6.add(jLabel18);
        jLabel18.setBounds(0, 0, 880, 400);

        jTabbedPane1.addTab("Bán Hàng", new javax.swing.ImageIcon(getClass().getResource("/view/cup.png")), jPanel6); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 216, 148));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/employeequanly.png"))); // NOI18N
        jButton1.setText("Quản Lý Nhân Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 50, 400, 80);

        jButton2.setBackground(new java.awt.Color(255, 216, 148));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/guest.png"))); // NOI18N
        jButton2.setText("Quản Lý Khách Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(475, 170, 380, 80);

        jButton3.setBackground(new java.awt.Color(255, 216, 148));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/godds.png"))); // NOI18N
        jButton3.setText("Quản Lý Hàng Hóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 168, 400, 80);

        jButton4.setBackground(new java.awt.Color(255, 216, 148));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/user.png"))); // NOI18N
        jButton4.setText("Quản Lý User");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 280, 843, 80);

        ManageDrinksjButton.setBackground(new java.awt.Color(255, 216, 148));
        ManageDrinksjButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ManageDrinksjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/drinks.png"))); // NOI18N
        ManageDrinksjButton.setText("Quản Lý Đồ Uống");
        ManageDrinksjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDrinksjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ManageDrinksjButton);
        ManageDrinksjButton.setBounds(475, 50, 380, 80);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Danh Sách");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(390, 0, 120, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(0, 0, 880, 400);

        jTabbedPane1.addTab("Quản Lý", new javax.swing.ImageIcon(getClass().getResource("/view/rsz_quanly.png")), jPanel1); // NOI18N

        TaiKhoanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Tài Khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        TaiKhoanPanel.setLayout(null);

        ChangePassButton.setBackground(new java.awt.Color(255, 190, 108));
        ChangePassButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChangePassButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/editpass.png"))); // NOI18N
        ChangePassButton.setText("Đổi Mật Khẩu");
        ChangePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassButtonActionPerformed(evt);
            }
        });
        TaiKhoanPanel.add(ChangePassButton);
        ChangePassButton.setBounds(16, 328, 170, 50);

        ThoatButton.setBackground(new java.awt.Color(255, 190, 108));
        ThoatButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ThoatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logout.png"))); // NOI18N
        ThoatButton.setText("Đăng Xuất");
        ThoatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatButtonActionPerformed(evt);
            }
        });
        TaiKhoanPanel.add(ThoatButton);
        ThoatButton.setBounds(709, 329, 150, 49);

        jPanel5.setBackground(new java.awt.Color(255, 216, 148));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("SĐT");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Vai Trò");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Giới tính");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Mã User");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Địa Chỉ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Ngày Sinh");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Họ Tên");

        IDuserLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IDuserLabel.setText("1");

        GenderLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        GenderLabel.setText("Nữ");

        roleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        roleLabel.setText("Admin");

        DiachiLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DiachiLabel.setText("Bách Khoa");

        nameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameLabel1.setText("Lê Thị Hồng Nhung");

        dobLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dobLabel4.setText("11-12-2000");

        SDTLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SDTLabel.setText("0987654321");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(IDuserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiachiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDuserLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameLabel1)
                    .addComponent(jLabel5)
                    .addComponent(GenderLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(roleLabel)
                    .addComponent(dobLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(DiachiLabel)
                    .addComponent(SDTLabel))
                .addGap(38, 38, 38))
        );

        TaiKhoanPanel.add(jPanel5);
        jPanel5.setBounds(16, 50, 843, 260);

        editInforButton.setBackground(new java.awt.Color(255, 190, 108));
        editInforButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editInforButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/editaccount.png"))); // NOI18N
        editInforButton.setText("Sửa Thông Tin");
        editInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInforButtonActionPerformed(evt);
            }
        });
        TaiKhoanPanel.add(editInforButton);
        editInforButton.setBounds(350, 330, 190, 49);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Thông Tin Tài Khoản");
        TaiKhoanPanel.add(jLabel21);
        jLabel21.setBounds(330, 0, 240, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        TaiKhoanPanel.add(jLabel20);
        jLabel20.setBounds(0, 0, 880, 400);

        jTabbedPane1.addTab("Tài Khoản", new javax.swing.ImageIcon(getClass().getResource("/view/taikhoan.png")), TaiKhoanPanel); // NOI18N

        jPanel7.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 880, 440);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        jPanel7.add(jLabel16);
        jLabel16.setBounds(0, 0, 880, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ThanhVienFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void RemoveDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDButtonActionPerformed
        // TODO add your handling code here:

        int row = listchoiceTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MenuEmployeeFrame.this, "Hãy chọn đồ muốn xóa");
        } else {
            String name = String.valueOf(listchoiceTable.getValueAt(row, 0));
            lDCService.removeDrinks(name);
            dtm.setRowCount(0);
            List<LDC> listLDC = lDCService.getAllLDC();
            listLDC.forEach((i) -> {
                dtm.addRow(new Object[]{i.getNameDrinks(), i.getAmount()});
            });
        }
    }//GEN-LAST:event_RemoveDButtonActionPerformed

    private void DathanhtoanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DathanhtoanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DathanhtoanRadioButtonActionPerformed

    private void ChuaThanhtoanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuaThanhtoanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChuaThanhtoanRadioButtonActionPerformed

    private void RefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefeshActionPerformed

        NameDrinkstextField.setText("");
        tableNumberTextField.setText("");
        nameGuestTextField.setText("");
        phoneGuestTextField.setText("");
        if (listchoiceTable.getRowCount() != 0) {
            dtm.setRowCount(0);
        }
        lDCService.removeAll();
    }//GEN-LAST:event_RefeshActionPerformed

    private void BillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillButtonActionPerformed
        // TODO add your handling code here:
        if (listchoiceTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn đồ");
        } else {
            guestService = new GuestService();
            if (tableNumberTextField.getText().equals("")
                || nameGuestTextField.getText().equals("")
                || phoneGuestTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
            } else {
                String pattern = "\\d$";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(tableNumberTextField.getText());
                String pattern1 = "^0\\d{9}$";
                Pattern r1 = Pattern.compile(pattern1);
                Matcher m1 = r1.matcher(phoneGuestTextField.getText());
                if (m.find() && m1.find()) {
                    guest = guestService.getGuestsByPhone(phoneGuestTextField.getText());
                    if (guest.getIDGuest() == 0) {
                        List<Guest> listGuest = guestService.getAllGuests();
                        int IDGuest = 1;
                        boolean checkID;
                        while (true) {
                            checkID = false;
                            for (Guest g : listGuest) {
                                if (IDGuest == g.getIDGuest()) {
                                    checkID = true;
                                    break;
                                }
                            }
                            if (!checkID) {
                                break;
                            }
                            IDGuest++;
                        }
                        guest.setIDGuest(IDGuest);
                        guest.setName(nameGuestTextField.getText());
                        guest.setPhone(phoneGuestTextField.getText());
                        guestService.addGuest(guest);
                    } else {
                        guest.setAccumulatedPoints(guest.getAccumulatedPoints() + 1);
                        guestService.updateGoods(guest);
                    }
                    orderService = new OrderService();
                    List<Order> listOrder = orderService.getAllOrder();
                    int IDorder = 1;
                    boolean checkID;
                    while (true) {
                        checkID = false;
                        for (Order g : listOrder) {
                            if (IDorder == g.getIDOrder()) {
                                checkID = true;
                                break;
                            }
                        }
                        if (!checkID) {
                            break;
                        }
                        IDorder++;
                    }
                    order = new Order();
                    order.setIDOrder(IDorder);
                    List<LDC> listLDC = lDCService.getAllLDC();
                    for (LDC ldc : listLDC) {
                        order.setIDDrinks(ldc.getIDDrinks());
                        order.setAmount(ldc.getAmount());
                        order.setIDGuest(guest.getIDGuest());

                        order.setIDUser(user.getIDUser());
                        order.setDate(String.valueOf(java.time.LocalDate.now()));
                        if (DathanhtoanRadioButton.isSelected()) {
                            order.setNote("Đã Thanh Toán");
                        }
                        if (ChuaThanhtoanRadioButton.isSelected()) {
                            order.setNote("Thanh toán sau");
                        }
                        order.setTableNumber(Integer.valueOf(tableNumberTextField.getText()));
                        orderService.addOrder(order);
                    }
                    new BillFrame(user.getIDUser(), order.getIDOrder()).setVisible(true);
                    if (listchoiceTable.getRowCount() != 0) {
                        dtm.setRowCount(0);
                        lDCService.removeAll();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Số Bàn hoặc Số Điện Thoại không hợp lệ!");
                }
            }

        }
    }//GEN-LAST:event_BillButtonActionPerformed

    private void NameDrinkstextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameDrinkstextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameDrinkstextFieldActionPerformed

    private void OkDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkDrinksActionPerformed

        if (!NameDrinkstextField.getText().equals("")) {
            String a = nameList.getSelectedValue().toString();
            String[] b = a.split("    ", 0);

            ldc = new LDC();
            List<LDC> listLDCtemp = lDCService.getAllLDC();
            for (LDC id : listLDCtemp) {
                if (Integer.valueOf(b[0]) == id.getIDDrinks()) {
                    int confirm = JOptionPane.showConfirmDialog(rootPane,
                        "Đồ bị trùng. Bạn có muốn sửa?");
                    if (confirm == JOptionPane.YES_OPTION) {
                        lDCService.removeDrinks(id.getNameDrinks());
                        ldc.setIDDrinks(Integer.valueOf(b[0]));
                        ldc.setAmount((int) DrinksSpinner.getValue());
                    } else {
                        lDCService.removeDrinks(id.getNameDrinks());
                        ldc.setIDDrinks(Integer.valueOf(b[0]));
                        ldc.setAmount(id.getAmount());

                    }
                    break;
                } else {
                    ldc.setIDDrinks(Integer.valueOf(b[0]));
                    ldc.setAmount((int) DrinksSpinner.getValue());
                }
            }
            if (ldc.getIDDrinks() == 0) {
                ldc.setIDDrinks(Integer.valueOf(b[0]));
                ldc.setAmount((int) DrinksSpinner.getValue());
            }
            ldc.setNameDrinks(b[1]);

            lDCService.addDrinks(ldc);
            dtm = (DefaultTableModel) listchoiceTable.getModel();
            dtm.setRowCount(0);
            List<LDC> listLDC = lDCService.getAllLDC();
            listLDC.forEach((i) -> {
                dtm.addRow(new Object[]{i.getNameDrinks(), i.getAmount()});
            });
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đồ!");
        }
    }//GEN-LAST:event_OkDrinksActionPerformed

    private void nameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseClicked
        // TODO add your handling code here:
        String a = nameList.getSelectedValue().toString();
        String[] b = a.split("    ", 0);
        NameDrinkstextField.setText(b[1]);
    }//GEN-LAST:event_nameListMouseClicked

    private void nameListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nameListMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ListEmployeeFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ManageGuestFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ManageGoodsFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ListUserFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ManageDrinksjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDrinksjButtonActionPerformed
        new ManageDrinksFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageDrinksjButtonActionPerformed

    private void ChangePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassButtonActionPerformed
        // TODO add your handling code here:

        new ChangePassFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangePassButtonActionPerformed

    private void ThoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(MenuEmployeeFrame.this, "Thoát?");
        if (confirm == JOptionPane.YES_OPTION) {
            new LogInFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ThoatButtonActionPerformed

    private void editInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInforButtonActionPerformed
        new editTaiKhoanFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editInforButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BillButton;
    private javax.swing.JButton ChangePassButton;
    private javax.swing.JRadioButton ChuaThanhtoanRadioButton;
    private javax.swing.JRadioButton DathanhtoanRadioButton;
    private javax.swing.JLabel DiachiLabel;
    private javax.swing.JSpinner DrinksSpinner;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel IDuserLabel;
    private javax.swing.JButton ManageDrinksjButton;
    private javax.swing.JTextField NameDrinkstextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton OkDrinks;
    private javax.swing.JButton Refesh;
    private javax.swing.JButton RemoveDButton;
    private javax.swing.JLabel SDTLabel;
    private javax.swing.JPanel TaiKhoanPanel;
    private javax.swing.JButton ThoatButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dobLabel4;
    private javax.swing.JButton editInforButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable listchoiceTable;
    private javax.swing.JTextField nameGuestTextField;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JList<String> nameList;
    private javax.swing.JTextField phoneGuestTextField;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTextField tableNumberTextField;
    // End of variables declaration//GEN-END:variables
}
