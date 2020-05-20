package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Guest;
import model.User;
import service.GuestService;
import service.UserService;

public class ManageGuestFrame extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel;
    User u;
    UserService userService = new UserService();
    Guest guest;
    GuestService guestService;

    public ManageGuestFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = userService.getUserByID(IDuser);
        
        defaultTableModel = (DefaultTableModel) GuestTable1.getModel();
        guestService = new GuestService();
        List<Guest> listGuest = guestService.getAllGuests();
        for (Guest g : listGuest) {
            defaultTableModel.addRow(new Object[]{
                g.getIDGuest(), g.getName(), g.getPhone(), g.getAccumulatedPoints()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchGuestTextField = new javax.swing.JTextField();
        searchGuestButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GuestTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        eidtButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        refeshButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(685, 350));
        getContentPane().setLayout(null);

        backButton.setBackground(new java.awt.Color(255, 190, 108));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(0, 0, 90, 30);

        jPanel2.setBackground(new java.awt.Color(255, 216, 148));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Tên Khách Hàng");

        searchGuestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGuestTextFieldActionPerformed(evt);
            }
        });

        searchGuestButton.setBackground(new java.awt.Color(255, 190, 108));
        searchGuestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search.png"))); // NOI18N
        searchGuestButton.setText("Tìm Kiếm");
        searchGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGuestButtonActionPerformed(evt);
            }
        });
        searchGuestButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchGuestButtonKeyPressed(evt);
            }
        });

        GuestTable1.setBackground(new java.awt.Color(255, 216, 148));
        GuestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số", "Tên Khách Hàng", "SĐT", "Điểm tích lũy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(GuestTable1);
        if (GuestTable1.getColumnModel().getColumnCount() > 0) {
            GuestTable1.getColumnModel().getColumn(0).setMinWidth(50);
            GuestTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            GuestTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            GuestTable1.getColumnModel().getColumn(1).setMinWidth(200);
            GuestTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            GuestTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            GuestTable1.getColumnModel().getColumn(2).setMinWidth(120);
            GuestTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            GuestTable1.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchGuestButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGuestButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 64, 476, 240);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 0, 270, 39);

        eidtButton.setBackground(new java.awt.Color(255, 190, 108));
        eidtButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eidtButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/edit.png"))); // NOI18N
        eidtButton.setText("Sửa");
        eidtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidtButtonActionPerformed(evt);
            }
        });
        getContentPane().add(eidtButton);
        eidtButton.setBounds(508, 70, 150, 56);

        removeButton.setBackground(new java.awt.Color(255, 190, 108));
        removeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/xoato.png"))); // NOI18N
        removeButton.setText("Xóa");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(508, 160, 150, 57);

        refeshButton.setBackground(new java.awt.Color(255, 190, 108));
        refeshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refeshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/refresh1.png"))); // NOI18N
        refeshButton.setText("Refresh");
        refeshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refeshButton);
        refeshButton.setBounds(504, 247, 150, 57);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 40, 670, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 680, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchGuestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGuestTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGuestTextFieldActionPerformed

    private void searchGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGuestButtonActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        if (searchGuestTextField.getText().equals("")) {
            List<Guest> listGuest = guestService.getAllGuests();
            for (Guest g : listGuest) {
                defaultTableModel.addRow(new Object[]{
                    g.getIDGuest(), g.getName(), g.getPhone(), g.getAccumulatedPoints()});
            }
        } else {
             String a= searchGuestTextField.getText().replaceAll("\\s","");
             List<Guest> listGuest = guestService.getGuestsByName(a);
            for (Guest g : listGuest) {
                defaultTableModel.addRow(new Object[]{
                    g.getIDGuest(), g.getName(), g.getPhone(), g.getAccumulatedPoints()});
            }
        }
    }//GEN-LAST:event_searchGuestButtonActionPerformed

    private void searchGuestButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchGuestButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGuestButtonKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        String a = u.getRole().replaceAll("\\s", "");
        if (a.equals("Admin")) {
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
        }
        if (a.equals("Employee")) {
            new MenuEmployeeFrame(u.getIDUser()).setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void refeshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButtonActionPerformed
        defaultTableModel.setRowCount(0);
        List<Guest> listGuest = guestService.getAllGuests();
        for (Guest g : listGuest) {
            defaultTableModel.addRow(new Object[]{
                g.getIDGuest(), g.getName(), g.getPhone(), g.getAccumulatedPoints()});
        }
    }//GEN-LAST:event_refeshButtonActionPerformed

    private void eidtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidtButtonActionPerformed
        int row = GuestTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageGuestFrame.this, "Bạn chưa chọn hàng nào!");
        } else {

            int IDguest = (Integer) GuestTable1.getValueAt(row, 0);
            //new editGoodsFrame(IDgoods,u.getIDUser()).setVisible(true);
            new editGuestFrame(IDguest,u.getIDUser()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_eidtButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int row = GuestTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageGuestFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(ManageGuestFrame.this,
                    "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String ID = String.valueOf(GuestTable1.getValueAt(row, 0));
                guestService.removeGuest(ID);
                defaultTableModel.setRowCount(0);
                List<Guest> listGuest = guestService.getAllGuests();
                for (Guest g : listGuest) {
                    defaultTableModel.addRow(new Object[]{
                        g.getIDGuest(), g.getName(), g.getPhone(), g.getAccumulatedPoints()});
                }
                JOptionPane.showMessageDialog(ManageGuestFrame.this, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageGuestFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GuestTable1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton eidtButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refeshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchGuestButton;
    private javax.swing.JTextField searchGuestTextField;
    // End of variables declaration//GEN-END:variables
}
