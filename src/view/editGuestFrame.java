/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Guest;
import model.User;
import service.GuestService;
import service.UserService;


public class editGuestFrame extends javax.swing.JFrame {

    User u;
    UserService userService = new UserService();
    Guest guest;
    GuestService guestService;
    public editGuestFrame(int IDGuest , int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = userService.getUserByID(IDuser);
        guestService = new GuestService();
        guest = guestService.getGuestsByID(IDGuest);
        IDGoodsTextField.setText(String.valueOf(guest.getIDGuest()));
        nameTextField.setText(guest.getName());
        diemTextField.setText(String.valueOf(guest.getAccumulatedPoints()));
        phoneTextField.setText(guest.getPhone());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDGoodsTextField = new javax.swing.JTextField();
        diemTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(525, 260));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 190, 108));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ok.png"))); // NOI18N
        jButton2.setText("Lưu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(208, 187, 90, 30);

        jPanel3.setBackground(new java.awt.Color(255, 216, 148));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Mã Số");

        jLabel4.setText("Tên Khách Hàng");

        jLabel6.setText("Điểm Tích Lũy");

        jLabel7.setText("SĐT");

        IDGoodsTextField.setEditable(false);
        IDGoodsTextField.setBackground(new java.awt.Color(255, 190, 108));
        IDGoodsTextField.setText("1");
        IDGoodsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDGoodsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(phoneTextField))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IDGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(diemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 60, 492, 116);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sửa Thông Tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(172, 0, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 44, 512, 10);

        jButton1.setBackground(new java.awt.Color(255, 190, 108));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 100, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 530, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDGoodsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDGoodsTextFieldActionPerformed

    }//GEN-LAST:event_IDGoodsTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

        new ManageGuestFrame(u.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (nameTextField.getText().equals("")
            || diemTextField.getText() == null
            || diemTextField.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
        } else {

            String pattern = "\\d$";
            String pattern1 = "^0\\d{9}$";
            Pattern r = Pattern.compile(pattern);
            Pattern r1 = Pattern.compile(pattern1);
            Matcher m = r1.matcher(phoneTextField.getText());
            Matcher m1 = r.matcher(diemTextField.getText());
            if ( m1.find()) {
                if(m.find()){
                guest.setIDGuest(Integer.valueOf(IDGoodsTextField.getText()));
                guest.setName(nameTextField.getText());
                guest.setAccumulatedPoints(Integer.valueOf(diemTextField.getText()));
                guest.setPhone(phoneTextField.getText());
                guestService.updateGoods(guest);
                JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công!");

                new ManageGuestFrame(u.getIDUser()).setVisible(true);
                this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Số Điện Thoại không hợp lệ!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Điểm tích lũy phải là số!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDGoodsTextField;
    private javax.swing.JTextField diemTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables
}
