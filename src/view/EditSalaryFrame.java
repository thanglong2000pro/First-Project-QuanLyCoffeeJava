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


public class EditSalaryFrame extends javax.swing.JFrame {

    User user, u;
    UserService userService;

    /**
     * Creates new form EditSalaryFrame
     */
    public EditSalaryFrame(int IDuser, int Month, int IDU0) {
        initComponents();
        this.setLocationRelativeTo(null);

        userService = new UserService();
        u = userService.getUserByID(IDU0);
        user = userService.getSalaryByID(IDuser, Month);

        MonthTextField.setText(user.getMonth() + "");
        ShiftTextField.setText(user.getShift());
        TotalShiftTextField.setText(user.getTotalShiftOnMonth() + "");
        tien1caTextField.setText(user.getMoneyShift() + "");
        BonusTextField.setText(user.getBonus() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        okButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ShiftTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TotalShiftTextField = new javax.swing.JTextField();
        MonthTextField = new javax.swing.JTextField();
        tien1caTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BonusTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(335, 270));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Sửa thông tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(97, 0, 214, 41);

        BackButton.setBackground(new java.awt.Color(255, 190, 108));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(0, 0, 90, 33);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 47, 301, 14);

        okButton.setBackground(new java.awt.Color(255, 190, 108));
        okButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        okButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ok.png"))); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);
        okButton.setBounds(130, 190, 80, 30);

        jPanel1.setBackground(new java.awt.Color(255, 216, 148));

        jLabel10.setText("Tháng");

        jLabel11.setText("Ca Làm");

        jLabel12.setText("Tổng Ca");

        MonthTextField.setEditable(false);
        MonthTextField.setBackground(new java.awt.Color(255, 190, 108));

        jLabel13.setText("Số  Tiền/Ca");

        jLabel14.setText("VNĐ");

        jLabel15.setText("Bonus");

        jLabel16.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(TotalShiftTextField))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tien1caTextField)
                        .addComponent(BonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel14))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(ShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TotalShiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(tien1caTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(BonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 66, 309, 117);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 340, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:

        if (ShiftTextField.getText().equals("")) {
            ShiftTextField.setText("NULL");
        }
        if (tien1caTextField.getText().equals("")) {
            tien1caTextField.setText("0");
        }
        if (TotalShiftTextField.getText().equals("")) {
            TotalShiftTextField.setText("0");
        }
        if (BonusTextField.getText().equals("")) {
            BonusTextField.setText("0");
        }
        String pattern = "\\d$";

        Pattern r = Pattern.compile(pattern);

        Matcher m0 = r.matcher(tien1caTextField.getText());
        Matcher m1 = r.matcher(TotalShiftTextField.getText());
        Matcher m2 = r.matcher(BonusTextField.getText());
        
        if (!m0.find()) {
            JOptionPane.showMessageDialog(rootPane, "Tiền/ca phải là số");
        }else if (!m1.find()) {
                JOptionPane.showMessageDialog(rootPane, "Tổng ca phải là số");   
            }else if (!m2.find()) {
                    JOptionPane.showMessageDialog(rootPane, "Bonus phải là số");  
        }else{
        
            user.setShift(ShiftTextField.getText());
            user.setBonus(Integer.valueOf(BonusTextField.getText()));
            user.setMoneyShift(Integer.valueOf(tien1caTextField.getText()));
            user.setTotalShiftOnMonth(Integer.valueOf(TotalShiftTextField.getText()));
            user.setMonth(Integer.valueOf(MonthTextField.getText()));
            
            userService.updateSalary(user);
        JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công!");
        this.dispose();
        new SalaryEFrame(user.getIDUser(), u.getIDUser()).setVisible(true);
        }

        

    }//GEN-LAST:event_okButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:

        new SalaryEFrame(user.getIDUser(), u.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField BonusTextField;
    private javax.swing.JTextField MonthTextField;
    private javax.swing.JTextField ShiftTextField;
    private javax.swing.JTextField TotalShiftTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField tien1caTextField;
    // End of variables declaration//GEN-END:variables
}
