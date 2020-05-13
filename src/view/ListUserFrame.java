/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import service.UserService;

public class ListUserFrame extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel;
    UserService userService;
    User user;

    public ListUserFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        defaultTableModel = new DefaultTableModel();
        userService = new UserService();
        user = userService.getUserByID(IDuser);
        defaultTableModel= (DefaultTableModel) UserTable.getModel();


        List<User> listUser = userService.getAllUser();
        listUser.forEach((e) -> {
            defaultTableModel.addRow(new Object[]{e.getIDUser(),
                 e.getFullName(), e.getGender(), e.getDob(), e.getAddress(), e.getPhone(),
                e.getUserName(), e.getPassword(), e.getRole()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        addEButton = new javax.swing.JButton();
        EditEButton = new javax.swing.JButton();
        removeEButton = new javax.swing.JButton();
        refeshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý User");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Quản Lý User");

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Họ Tên", "Giới tính", "Ngày Sinh", "Địa Chỉ", "SĐT", "Username", "Password", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        UserTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserTable.setInheritsPopupMenu(true);
        UserTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setMinWidth(45);
            UserTable.getColumnModel().getColumn(0).setPreferredWidth(45);
            UserTable.getColumnModel().getColumn(0).setMaxWidth(45);
            UserTable.getColumnModel().getColumn(1).setMinWidth(120);
            UserTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            UserTable.getColumnModel().getColumn(1).setMaxWidth(120);
            UserTable.getColumnModel().getColumn(2).setMinWidth(50);
            UserTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            UserTable.getColumnModel().getColumn(2).setMaxWidth(50);
            UserTable.getColumnModel().getColumn(3).setMinWidth(85);
            UserTable.getColumnModel().getColumn(3).setPreferredWidth(85);
            UserTable.getColumnModel().getColumn(3).setMaxWidth(85);
            UserTable.getColumnModel().getColumn(4).setMinWidth(75);
            UserTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            UserTable.getColumnModel().getColumn(4).setMaxWidth(75);
            UserTable.getColumnModel().getColumn(5).setMinWidth(80);
            UserTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            UserTable.getColumnModel().getColumn(5).setMaxWidth(80);
            UserTable.getColumnModel().getColumn(6).setMinWidth(80);
            UserTable.getColumnModel().getColumn(6).setPreferredWidth(80);
            UserTable.getColumnModel().getColumn(6).setMaxWidth(80);
            UserTable.getColumnModel().getColumn(7).setPreferredWidth(75);
            UserTable.getColumnModel().getColumn(8).setMinWidth(80);
            UserTable.getColumnModel().getColumn(8).setPreferredWidth(80);
            UserTable.getColumnModel().getColumn(8).setMaxWidth(80);
        }

        addEButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addEButton.setText("Thêm");
        addEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEButtonActionPerformed(evt);
            }
        });

        EditEButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditEButton.setText("Sửa");
        EditEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEButtonActionPerformed(evt);
            }
        });

        removeEButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeEButton.setText("Xóa");
        removeEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEButtonActionPerformed(evt);
            }
        });

        refeshButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refeshButton.setText("Refresh");
        refeshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(EditEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEButtonActionPerformed
        new addUserFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addEButtonActionPerformed

    private void refeshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButtonActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        List<User> listUser = userService.getAllUser();
        listUser.forEach((e) -> {
            defaultTableModel.addRow(new Object[]{e.getIDUser(),
                 e.getFullName(), e.getGender(), e.getDob(), e.getAddress(), e.getPhone(),
                e.getUserName(), e.getPassword(),e.getRole()});
        });

    }//GEN-LAST:event_refeshButtonActionPerformed

    private void removeEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEButtonActionPerformed
        // TODO add your handling code here:
        int row = UserTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ListUserFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(ListUserFrame.this,
                    "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String IDUser = String.valueOf(UserTable.getValueAt(row, 0));
                userService.removeUser(IDUser);
                defaultTableModel.setRowCount(0);
                List<User> listUser = userService.getAllUser();
                listUser.forEach((e) -> {
                    defaultTableModel.addRow(new Object[]{e.getIDUser(),
                         e.getFullName(), e.getGender(), e.getDob(), e.getAddress(), e.getPhone(),
                        e.getUserName(), e.getPassword(), e.getRole()});
                });
                JOptionPane.showMessageDialog(ListUserFrame.this, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_removeEButtonActionPerformed

    private void EditEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEButtonActionPerformed
        // TODO add your handling code here:
        int row = UserTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ListUserFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            
            int IDUser = (Integer) UserTable.getValueAt(row, 0);
                new editUserFrame(IDUser,user.getIDUser()).setVisible(true);
            this.dispose();
        }                   
    
    }//GEN-LAST:event_EditEButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new MenuAdminFrame(user.getIDUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EditEButton;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton addEButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refeshButton;
    private javax.swing.JButton removeEButton;
    // End of variables declaration//GEN-END:variables
}
