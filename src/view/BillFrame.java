/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import model.Drinks;
import model.Guest;
import model.Order;
import model.User;
import service.BillService;
import service.DrinksService;
import service.GuestService;
import service.OrderService;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class BillFrame extends javax.swing.JFrame {

    /**
     * Creates new form BillFrame
     */
    User user;
    UserService userService = new UserService();
    Order order;
    OrderService orderService;
    Drinks drinks;
    DefaultTableModel dtm;
    DrinksService drinksService = new DrinksService() ;
    Guest guest;
    GuestService guestService = new GuestService();
    Bill bill = new Bill();
    BillService billService = new BillService();
    
    
    public BillFrame(int IDUser , int IDOrder) {
        initComponents();
        this.setLocationRelativeTo(null);
        user = userService.getUserByID(IDUser);
        orderService = new OrderService();
        List<Order> orders = orderService.getOrderByID(IDOrder);
        Order [] a = new Order[orders.size()];
        orders.toArray(a);
        guest = guestService.getGuestsByID(a[0].getIDGuest());
        Datelabel.setText(a[0].getDate());
        IDOrderLabel.setText(String.valueOf(a[0].getIDOrder()));
        NameGuestLabel.setText(guest.getName());
       	PhoneGuestLabel.setText(guest.getPhone());
        TableNumberLabel.setText(String.valueOf(a[0].getTableNumber()));
        ThanhToanLabel.setText("-"+a[0].getNote());
        NameUserLabel.setText(user.getFullName());
        
        

 
        dtm = (DefaultTableModel) listChoiceTable.getModel();     
            int tien = 0 , tongtien = 0;
            for (Order o : orders) {
            drinks = drinksService.getDrinksByID(o.getIDDrinks());
            tien = o.getAmount() * drinks.getPrice();
            tongtien += tien;
            dtm.addRow(new Object[]{drinks.getIDdrinks() , 
                drinks.getName(), o.getAmount(),tien +"đ"});
            }
        TotalMoneyLabel.setText(tongtien +"đ");
        double thanhtien = 0;
        if(guest.getAccumulatedPoints()==0){
            DiscountLabel.setText("0%");
            thanhtien = tongtien;
            MoneyLabel.setText((int)thanhtien +"đ");
            
        }else if(guest.getAccumulatedPoints()>0
                && guest.getAccumulatedPoints() <= 5){
            DiscountLabel.setText("5%");
           thanhtien =  tongtien*0.95;
            MoneyLabel.setText((int)thanhtien +"đ");
        }else{
            DiscountLabel.setText("10%");
             thanhtien = tongtien*0.9;
            MoneyLabel.setText((int)thanhtien +"đ");
        }
        bill.setIDOrder(IDOrder);
        bill.setDoanhThu((int)thanhtien);
        bill.setDate(Datelabel.getText());
        billService.addBill(bill);
    }
    public BillFrame(int IDOrder) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        orderService = new OrderService();
        List<Order> orders = orderService.getOrderByID(IDOrder);
        
        Order [] a = new Order[orders.size()];
        orders.toArray(a);
        user = userService.getUserByID(a[0].getIDUser());
        guest = guestService.getGuestsByID(a[0].getIDGuest());
        Datelabel.setText(a[0].getDate());
        IDOrderLabel.setText(String.valueOf(a[0].getIDOrder()));
        NameGuestLabel.setText(guest.getName());
       	PhoneGuestLabel.setText(guest.getPhone());
        TableNumberLabel.setText(String.valueOf(a[0].getTableNumber()));
        ThanhToanLabel.setText("-"+a[0].getNote());
        NameUserLabel.setText(user.getFullName());
        
        

 
        dtm = (DefaultTableModel) listChoiceTable.getModel();     
            int tien = 0 , tongtien = 0;
            for (Order o : orders) {
            drinks = drinksService.getDrinksByID(o.getIDDrinks());
            tien = o.getAmount() * drinks.getPrice();
            tongtien += tien;
            dtm.addRow(new Object[]{drinks.getIDdrinks() , 
                drinks.getName(), o.getAmount(),tien +"đ"});
            }
        TotalMoneyLabel.setText(tongtien +"đ");
        double thanhtien = 0;
        if(guest.getAccumulatedPoints()==0){
            DiscountLabel.setText("0%");
            thanhtien = tongtien;
            MoneyLabel.setText((int)thanhtien +"đ");
            
        }else if(guest.getAccumulatedPoints()>0
                && guest.getAccumulatedPoints() <= 5){
            DiscountLabel.setText("5%");
           thanhtien =  tongtien*0.95;
            MoneyLabel.setText((int)thanhtien +"đ");
        }else{
            DiscountLabel.setText("10%");
             thanhtien = tongtien*0.9;
            MoneyLabel.setText((int)thanhtien +"đ");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listChoiceTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        TotalMoneyLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DiscountLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MoneyLabel = new javax.swing.JLabel();
        ThanhToanLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NameUserLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PhoneGuestLabel = new javax.swing.JLabel();
        NameGuestLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TableNumberLabel = new javax.swing.JLabel();
        IDOrderLabel = new javax.swing.JLabel();
        Datelabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Hóa Đơn");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Danh Sách Đồ");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        listChoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số", "Tên", "Số lượng", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listChoiceTable);
        if (listChoiceTable.getColumnModel().getColumnCount() > 0) {
            listChoiceTable.getColumnModel().getColumn(0).setMinWidth(50);
            listChoiceTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            listChoiceTable.getColumnModel().getColumn(0).setMaxWidth(50);
            listChoiceTable.getColumnModel().getColumn(1).setMinWidth(100);
            listChoiceTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            listChoiceTable.getColumnModel().getColumn(1).setMaxWidth(100);
            listChoiceTable.getColumnModel().getColumn(2).setMinWidth(65);
            listChoiceTable.getColumnModel().getColumn(2).setPreferredWidth(65);
            listChoiceTable.getColumnModel().getColumn(2).setMaxWidth(65);
        }

        jLabel11.setText("Tổng Tiền :");

        TotalMoneyLabel.setText("1200000 đ");

        jLabel13.setText("Discount : ");

        DiscountLabel.setText("0%");

        jLabel15.setText("Thành Tiền :");

        MoneyLabel.setText("1000000 đ");

        ThanhToanLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        ThanhToanLabel.setText("-Đã Thanh Toán");

        jLabel18.setText("Người bán hàng :");

        NameUserLabel.setText("Nguyễn Ngọc Na");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel20.setText("--------------------Thank You--------------------");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Số");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên Khách Hàng :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số Điện Thoại : ");

        PhoneGuestLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        PhoneGuestLabel.setText("0987654321");

        NameGuestLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        NameGuestLabel.setText("Nguyễn Văn A");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số Bàn :");

        TableNumberLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        TableNumberLabel.setText("1");

        IDOrderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDOrderLabel.setText("1");

        Datelabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Datelabel.setText("2020 -11-12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TableNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(NameGuestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDOrderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TableNumberLabel)
                    .addComponent(Datelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PhoneGuestLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TotalMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DiscountLabel)
                                            .addComponent(MoneyLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ThanhToanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TotalMoneyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiscountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoneyLabel)
                            .addComponent(ThanhToanLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(NameUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(8, 8, 8))
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelabel;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JLabel IDOrderLabel;
    private javax.swing.JLabel MoneyLabel;
    private javax.swing.JLabel NameGuestLabel;
    private javax.swing.JLabel NameUserLabel;
    private javax.swing.JLabel PhoneGuestLabel;
    private javax.swing.JLabel TableNumberLabel;
    private javax.swing.JLabel ThanhToanLabel;
    private javax.swing.JLabel TotalMoneyLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable listChoiceTable;
    // End of variables declaration//GEN-END:variables
}
