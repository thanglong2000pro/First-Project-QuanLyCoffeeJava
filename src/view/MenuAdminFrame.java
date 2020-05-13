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
import model.Bill;
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
public class MenuAdminFrame extends javax.swing.JFrame {

    User user;
    UserService userService;
    DrinksService drinksService;
    DefaultListModel dlm1;
    DefaultTableModel dtm, dtm2;
    Order order;
    OrderService orderService = new OrderService();
    LDC ldc;
    LDCService lDCService = new LDCService();
    Guest guest;
    GuestService guestService;
    BillService billService;

    public MenuAdminFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        userService = new UserService();
        user = userService.getUserByID(IDuser);

        //tai khoan
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
        for (Drinks listdrink : listdrinks) {
            dlm1.addElement(listdrink.getIDdrinks() + "     "
                    + listdrink.getName() + "       " + listdrink.getPrice() + "đ");
        }
        nameList.setModel(dlm1);

        //thong ke
        dtm2 = new DefaultTableModel();
        dtm2 = (DefaultTableModel) listBillTable.getModel();
        billService = new BillService();
        List<Bill> listBills = billService.getAllBills();
        int TongDoanhThu = 0;
        for (Bill b : listBills) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
         TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listchoiceTable = new javax.swing.JTable();
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SearchdateTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TotalMoneyLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        refreshButton = new javax.swing.JButton();
        chiTietButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBillTable = new javax.swing.JTable();
        XoaBillButton = new javax.swing.JButton();
        XoatatcaBill = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ManageDrinksjButton = new javax.swing.JButton();
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
        NameLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(740, 400));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel37.setText("Mã số");

        jLabel38.setText("Tên");

        jLabel39.setText("Giá");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel40.setText("Menu");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15)
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Chọn đồ");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        if (listchoiceTable.getColumnModel().getColumnCount() > 0) {
            listchoiceTable.getColumnModel().getColumn(0).setMinWidth(110);
            listchoiceTable.getColumnModel().getColumn(0).setPreferredWidth(110);
            listchoiceTable.getColumnModel().getColumn(0).setMaxWidth(110);
        }

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        RemoveDButton.setText("<<Xóa");
        RemoveDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tên Khách hàng");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Số ĐT");

        buttonGroup1.add(DathanhtoanRadioButton);
        DathanhtoanRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DathanhtoanRadioButton.setText("Đã Thanh Toán");
        DathanhtoanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DathanhtoanRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(ChuaThanhtoanRadioButton);
        ChuaThanhtoanRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChuaThanhtoanRadioButton.setSelected(true);
        ChuaThanhtoanRadioButton.setText("Thanh Toán sau");
        ChuaThanhtoanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuaThanhtoanRadioButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Số Bàn");

        Refesh.setText("Refresh");
        Refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefeshActionPerformed(evt);
            }
        });

        BillButton.setText("Hóa Đơn>>");
        BillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillButtonActionPerformed(evt);
            }
        });

        NameDrinkstextField.setEditable(false);
        NameDrinkstextField.setBackground(new java.awt.Color(255, 255, 255));
        NameDrinkstextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameDrinkstextField.setForeground(new java.awt.Color(255, 0, 0));
        NameDrinkstextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameDrinkstextFieldActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("Số Lượng");

        DrinksSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        DrinksSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(DrinksSpinner, ""));

        OkDrinks.setText("OK");
        OkDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkDrinksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Refesh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BillButton)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(tableNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DathanhtoanRadioButton)
                                    .addComponent(ChuaThanhtoanRadioButton)
                                    .addComponent(nameGuestTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(phoneGuestTextField))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(RemoveDButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameDrinkstextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(DrinksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OkDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveDButton)
                    .addComponent(NameDrinkstextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(DrinksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkDrinks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(nameGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(DathanhtoanRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChuaThanhtoanRadioButton)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Refesh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bán Hàng", jPanel6);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống Kê", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nhập Ngày ");

        SearchdateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchdateTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel15.setText("Tìm kiếm theo ngày:");

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText(" Tổng Doanh Thu:");

        TotalMoneyLabel.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        TotalMoneyLabel.setText("1200000VNĐ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(SearchdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchdateTextField)
                    .addComponent(searchButton)
                    .addComponent(jLabel1))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshButton.setText("Refesh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        chiTietButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chiTietButton.setText("Chi tiết");
        chiTietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiTietButtonActionPerformed(evt);
            }
        });

        listBillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Số Tiền", "Ngày"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listBillTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listBillTable);
        if (listBillTable.getColumnModel().getColumnCount() > 0) {
            listBillTable.getColumnModel().getColumn(0).setMinWidth(100);
            listBillTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            listBillTable.getColumnModel().getColumn(0).setMaxWidth(100);
            listBillTable.getColumnModel().getColumn(1).setMinWidth(150);
            listBillTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            listBillTable.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        XoaBillButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        XoaBillButton.setText("Xóa Hóa Đơn");
        XoaBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBillButtonActionPerformed(evt);
            }
        });

        XoatatcaBill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        XoatatcaBill.setText("Xóa Tất cả");
        XoatatcaBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoatatcaBillActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Danh Sách Hóa Đơn");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chiTietButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(XoaBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(XoatatcaBill, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(chiTietButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(XoaBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(XoatatcaBill, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Quản Lý Nhân Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Quản Lý Khách Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Quản Lý Hàng Hóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Quản Lý User");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ManageDrinksjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManageDrinksjButton.setText("Quản Lý Đồ Uống");
        ManageDrinksjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDrinksjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManageDrinksjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageDrinksjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản Lý", jPanel1);

        TaiKhoanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Tài Khoản", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        ChangePassButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChangePassButton.setText("Đổi Mật Khẩu");
        ChangePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassButtonActionPerformed(evt);
            }
        });

        ThoatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ThoatButton.setText("Đăng Xuất");
        ThoatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(213, 213, 233));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("SĐT");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Vai Trò");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Giới tính");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mã User");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Địa Chỉ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Ngày Sinh");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Họ Tên");

        IDuserLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        IDuserLabel.setText("1");

        GenderLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GenderLabel.setText("Nữ");

        roleLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        roleLabel.setText("Admin");

        DiachiLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DiachiLabel.setText("Bách Khoa");

        nameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameLabel1.setText("Lê Thị Hồng Nhung");

        dobLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dobLabel4.setText("11-12-2000");

        SDTLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DiachiLabel)
                    .addComponent(SDTLabel))
                .addGap(38, 38, 38))
        );

        editInforButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editInforButton.setText("Sửa Thông Tin");
        editInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInforButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TaiKhoanPanelLayout = new javax.swing.GroupLayout(TaiKhoanPanel);
        TaiKhoanPanel.setLayout(TaiKhoanPanelLayout);
        TaiKhoanPanelLayout.setHorizontalGroup(
            TaiKhoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TaiKhoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TaiKhoanPanelLayout.createSequentialGroup()
                        .addComponent(ChangePassButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editInforButton)
                        .addGap(153, 153, 153)
                        .addComponent(ThoatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TaiKhoanPanelLayout.setVerticalGroup(
            TaiKhoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TaiKhoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editInforButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tài Khoản", TaiKhoanPanel);

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 14)); // NOI18N
        NameLabel.setText("Xin chào, Nhung!");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Nhóm Phát Triển");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Tài Khoản\naa");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInforButtonActionPerformed
        new editTaiKhoanFrame(user.getIDUser()).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_editInforButtonActionPerformed

    private void ThoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(MenuAdminFrame.this, "Thoát?");
        if (confirm == JOptionPane.YES_OPTION) {
            new LogInFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ThoatButtonActionPerformed

    private void ChangePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassButtonActionPerformed
        // TODO add your handling code here:

        new ChangePassFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangePassButtonActionPerformed

    private void ManageDrinksjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDrinksjButtonActionPerformed
        new ManageDrinksFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageDrinksjButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ListUserFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ManageGoodsFrame(user.getIDUser()).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ManageGuestFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ListEmployeeFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseClicked
        // TODO add your handling code here:
        String a = nameList.getSelectedValue().toString();
        String[] b = a.split("    ", 0);
        NameDrinkstextField.setText(b[1]);
    }//GEN-LAST:event_nameListMouseClicked

    private void nameListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nameListMouseEntered

    private void RemoveDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDButtonActionPerformed
        // TODO add your handling code here:

        int row = listchoiceTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MenuAdminFrame.this, "Hãy chọn đồ muốn xóa");
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

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        if(listBillTable.getRowCount()>0){
        dtm2.setRowCount(0);

        List<Bill> listBills = billService.getAllBills();
        int TongDoanhThu = 0;
        for (Bill b : listBills) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
        TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void chiTietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiTietButtonActionPerformed
        // TODO add your handling code here:
        int row = listBillTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MenuAdminFrame.this, "Chọn một hóa đơn để xem thông tin chi tiết!");
        } else {

            int IDOrder = (Integer) listBillTable.getValueAt(row, 0);
            new BillFrame( IDOrder).setVisible(true);

        }

    }//GEN-LAST:event_chiTietButtonActionPerformed

    private void SearchdateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchdateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchdateTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:\
        dtm2.setRowCount(0);
        if (SearchdateTextField.getText().equals("")) {
            List<Bill> listBills = billService.getAllBills();
            int TongDoanhThu = 0;
            for (Bill b : listBills) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
         TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
        } else {
            String a = SearchdateTextField.getText().replaceAll("\\s", "");
            List<Bill> listb =  billService.getBillByDate(a);
            int TongDoanhThu = 0;
            for (Bill b : listb) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
         TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void XoaBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBillButtonActionPerformed
        // TODO add your handling code here:
        int row = listBillTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MenuAdminFrame.this, "Chọn hóa đơn muốn xóa!");
        } else {

            int IDOrder = (Integer) listBillTable.getValueAt(row, 0);
            billService.removeBill(IDOrder);
            dtm2.setRowCount(0);

        List<Bill> listBills = billService.getAllBills();
        int TongDoanhThu = 0;
        for (Bill b : listBills) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
        TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
        }
    }//GEN-LAST:event_XoaBillButtonActionPerformed

    private void XoatatcaBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoatatcaBillActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(MenuAdminFrame.this, "Bạn có chắc muốn xóa tất cả Hóa Đơn?");
        if (confirm == JOptionPane.YES_OPTION) {
            billService.removeAllBills();
            
            dtm2.setRowCount(0);
            JOptionPane.showMessageDialog(rootPane, "Xóa Thành Công!");

        List<Bill> listBills = billService.getAllBills();
        int TongDoanhThu = 0;
        for (Bill b : listBills) {
            dtm2.addRow(new Object[]{b.getIDOrder(), b.getDoanhThu() + "đ", b.getDate()});
            TongDoanhThu += b.getDoanhThu();
        }
        TotalMoneyLabel.setText(TongDoanhThu + "VNĐ");
        }
    }//GEN-LAST:event_XoatatcaBillActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ThanhVienFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


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
    private javax.swing.JTextField SearchdateTextField;
    private javax.swing.JPanel TaiKhoanPanel;
    private javax.swing.JButton ThoatButton;
    private javax.swing.JLabel TotalMoneyLabel;
    private javax.swing.JButton XoaBillButton;
    private javax.swing.JButton XoatatcaBill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chiTietButton;
    private javax.swing.JLabel dobLabel4;
    private javax.swing.JButton editInforButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable listBillTable;
    private javax.swing.JTable listchoiceTable;
    private javax.swing.JTextField nameGuestTextField;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JList<String> nameList;
    private javax.swing.JTextField phoneGuestTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tableNumberTextField;
    // End of variables declaration//GEN-END:variables
}
