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
public class editUserFrame extends javax.swing.JFrame {

    User user;
    User u;
    UserService userService;
    String role;
    /**
     * Creates new form editEmployeeFrame
     */
    public editUserFrame(int IDUser ,int IDU0) {
        initComponents();
        userService = new UserService();
        user = userService.getUserByID(IDUser);
        u = userService.getUserByID(IDU0);

        IDEtextField.setText(String.valueOf(user.getIDUser()));
        fullNameTextField.setText(user.getFullName());        
        String b = user.getGender().replaceAll("\\s",""); 
        if (b.equals("Nam")) {           
            genderComboBox.setSelectedIndex(0);            
        }
        if (b.equals("Nữ")) {           
            genderComboBox.setSelectedItem("Nữ");            
        }
        if (b.equals("Khác")) {
            
            genderComboBox.setSelectedItem("Khác");
        }
        if (user.getRole().equals("Admin")) {
            AdminRadiobutton.setSelected(true);
            role = "Admin";
        }
        if(user.getRole().equals("Employee")){
            EmployeeRadioButton.setSelected(true);
            role = "Employee";
        }
        
        DOBTextField.setText(user.getDob());
        addressTextField.setText(user.getAddress());
        phoneTextField.setText(user.getPhone());
        userNameTextField.setText(user.getUserName());
        passwordTextField.setText(user.getPassword());

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        phoneTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        IDEtextField = new javax.swing.JTextField();
        fullNameTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DOBTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        EmployeeRadioButton = new javax.swing.JRadioButton();
        AdminRadiobutton = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        addressTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        editEmployeeButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(580, 360));
        getContentPane().setLayout(null);

        BackButton.setBackground(new java.awt.Color(255, 190, 108));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(0, 0, 110, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sửa Thông Tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(201, 0, 328, 38);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 36, 560, 10);

        jPanel1.setBackground(new java.awt.Color(255, 216, 148));

        jLabel12.setText("UserName");

        jLabel13.setText("Password");

        jLabel4.setText("Mã User");

        jLabel14.setText("Họ Tên");

        IDEtextField.setEditable(false);
        IDEtextField.setBackground(new java.awt.Color(255, 190, 108));
        IDEtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEtextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Giới tính");

        jLabel16.setText("Ngày Sinh");

        DOBTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Vai Trò");

        EmployeeRadioButton.setBackground(new java.awt.Color(255, 216, 148));
        buttonGroup1.add(EmployeeRadioButton);
        EmployeeRadioButton.setSelected(true);
        EmployeeRadioButton.setText("Employee");
        EmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRadioButtonActionPerformed(evt);
            }
        });

        AdminRadiobutton.setBackground(new java.awt.Color(255, 216, 148));
        buttonGroup1.add(AdminRadiobutton);
        AdminRadiobutton.setText("Admin");
        AdminRadiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRadiobuttonActionPerformed(evt);
            }
        });

        jLabel18.setText("Địa Chỉ");

        genderComboBox.setBackground(new java.awt.Color(255, 190, 108));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        jLabel19.setText("SĐT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(IDEtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(DOBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(282, 282, 282)
                                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(EmployeeRadioButton)
                                        .addGap(199, 199, 199)
                                        .addComponent(passwordTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(AdminRadiobutton)
                                        .addGap(215, 215, 215)
                                        .addComponent(userNameTextField)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(330, 330, 330)
                            .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(IDEtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminRadiobutton)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmployeeRadioButton)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel17))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(DOBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 520, 210);

        editEmployeeButton1.setBackground(new java.awt.Color(255, 190, 108));
        editEmployeeButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editEmployeeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ok.png"))); // NOI18N
        editEmployeeButton1.setText("Lưu");
        editEmployeeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(editEmployeeButton1);
        editEmployeeButton1.setBounds(230, 280, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new ListUserFrame(u.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void editEmployeeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeButton1ActionPerformed
        // TODO add your handling code here:
        if (IDEtextField.getText().equals("")
                || fullNameTextField.getText().equals("")
                || DOBTextField.getText().equals("")
                || addressTextField.getText().equals("")
                || userNameTextField.getText().equals("")
                || passwordTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin!");
           
        } else {
            String pattern = "^0\\d{9}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(phoneTextField.getText());
            if (m.find()) {

                user.setIDUser(Integer.valueOf(IDEtextField.getText()));
                user.setFullName(fullNameTextField.getText());
                String a = String.valueOf(genderComboBox.getSelectedItem());
                user.setGender(a);

                user.setDob(DOBTextField.getText());
                user.setAddress(addressTextField.getText());
                user.setPhone(phoneTextField.getText());
                user.setUserName(userNameTextField.getText());
                user.setPassword(passwordTextField.getText());
                if (AdminRadiobutton.isSelected()) {
                    user.setRole("Admin");
                    if(role.equals("Admin")){
                        userService.updateUser(user);
                    }else{
                       userService.updateUserEA(user); 
                    }
                }
                if (EmployeeRadioButton.isSelected()) {
                    user.setRole("Employee");
                    if(role.equals("Employee")){
                        userService.updateUser(user);
                    }else{
                       userService.updateUserAE(user); 
                    }
                }

                JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công!");
                new ListUserFrame(u.getIDUser()).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Số Điện Thoại không hợp lệ!");
            }
        }
    }//GEN-LAST:event_editEmployeeButton1ActionPerformed

    private void IDEtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEtextFieldActionPerformed

    private void DOBTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextFieldActionPerformed

    private void EmployeeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeRadioButtonActionPerformed

    private void AdminRadiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRadiobuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminRadiobuttonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadiobutton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DOBTextField;
    private javax.swing.JRadioButton EmployeeRadioButton;
    private javax.swing.JTextField IDEtextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton editEmployeeButton1;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
