/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.User;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class editTaiKhoanFrame extends javax.swing.JFrame {

    User user;
    UserService userService;

    public editTaiKhoanFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        userService = new UserService();
        user = userService.getUserByID(IDuser);
        FullNameTextField.setText(user.getFullName());
        dobTextField.setText(user.getDob());
        addressTextField.setText(user.getAddress());
        PhoneTextField.setText(user.getPhone());
        String b = user.getGender().replaceAll("\\s", "");
        if (b.equals("Nam")) {
            NamRadioButton.setSelected(true);
        }
        if (b.equals("Nữ")) {

            NuRadioButton.setSelected(true);
        }
        if (b.equals("Khác")) {
            KhacRadioButton.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        dobTextField = new javax.swing.JTextField();
        FullNameTextField = new javax.swing.JTextField();
        NamRadioButton = new javax.swing.JRadioButton();
        NuRadioButton = new javax.swing.JRadioButton();
        KhacRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        HuyButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(430, 275));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 216, 148));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Giới tính");

        jLabel8.setText("SĐT");

        jLabel3.setText("Họ Tên");

        jLabel6.setText("Ngày Sinh");

        jLabel7.setText("Địa Chỉ");

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });

        NamRadioButton.setBackground(new java.awt.Color(255, 216, 148));
        buttonGroup1.add(NamRadioButton);
        NamRadioButton.setText("Nam");

        NuRadioButton.setBackground(new java.awt.Color(255, 216, 148));
        buttonGroup1.add(NuRadioButton);
        NuRadioButton.setText("Nữ");
        NuRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuRadioButtonActionPerformed(evt);
            }
        });

        KhacRadioButton.setBackground(new java.awt.Color(255, 216, 148));
        buttonGroup1.add(KhacRadioButton);
        KhacRadioButton.setText("Khác");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dobTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(addressTextField))
                    .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamRadioButton)
                            .addComponent(NuRadioButton)
                            .addComponent(KhacRadioButton))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(NamRadioButton)
                            .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NuRadioButton)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(KhacRadioButton))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(24, 34, 367, 160);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sửa thông tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 0, 277, 30);

        HuyButton.setBackground(new java.awt.Color(255, 190, 108));
        HuyButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HuyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/huy.png"))); // NOI18N
        HuyButton.setText("Hủy");
        HuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HuyButton);
        HuyButton.setBounds(70, 200, 90, 30);

        OKButton.setBackground(new java.awt.Color(255, 190, 108));
        OKButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ok.png"))); // NOI18N
        OKButton.setText("Ok");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OKButton);
        OKButton.setBounds(250, 200, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void HuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyButtonActionPerformed
        new MenuAdminFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HuyButtonActionPerformed

    private void NuRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuRadioButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        if (FullNameTextField.getText().equals("")
                || dobTextField.getText().equals("")
                || addressTextField.getText().equals("")
                || addressTextField.getText().equals("")
                || PhoneTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");

        } else {
            String pattern = "^0\\d{9}$";
            Pattern r = Pattern.compile(pattern);
            String p = "^\\d{4}-\\d{2}-\\d{2}$";
            Pattern r1 = Pattern.compile(p);
            Matcher m = r.matcher(PhoneTextField.getText());
            Matcher m1 = r1.matcher(dobTextField.getText());

            if (m.find()) {
                if (m1.find()) {
                    String a[] = dobTextField.getText().split("-");
                    int b = Integer.valueOf(a[1]);
                    int c = Integer.valueOf(a[2]);
                    if (b > 0 && b < 13 && c > 0 && c < 32) {
                        user.setFullName(FullNameTextField.getText());

                        if (NamRadioButton.isSelected()) {
                            user.setGender("Nam");
                        }
                        if (NuRadioButton.isSelected()) {
                            user.setGender("Nữ");
                        }
                        if (KhacRadioButton.isSelected()) {
                            user.setGender("Khác");
                        }

                        user.setDob(dobTextField.getText());
                        user.setAddress(addressTextField.getText());
                        user.setPhone(PhoneTextField.getText());

                        userService.updateUser(user);

                        JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công!");
                        new MenuAdminFrame(user.getIDUser()).setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Ngày Sinh không hợp lệ!");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ngày Sinh không hợp lệ!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Số Điện Thoại không hợp lệ!");
            }
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JButton HuyButton;
    private javax.swing.JRadioButton KhacRadioButton;
    private javax.swing.JRadioButton NamRadioButton;
    private javax.swing.JRadioButton NuRadioButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
