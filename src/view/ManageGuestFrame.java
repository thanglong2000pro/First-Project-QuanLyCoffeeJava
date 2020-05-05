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
        defaultTableModel = new DefaultTableModel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Hàng");
        setBackground(new java.awt.Color(255, 255, 255));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Tên Khách Hàng");

        searchGuestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGuestTextFieldActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchGuestButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchGuestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGuestButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");

        eidtButton.setText("Sửa");
        eidtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidtButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Xóa");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        refeshButton.setText("Refesh");
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(eidtButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton)
                                .addGap(139, 139, 139)
                                .addComponent(refeshButton)
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eidtButton)
                    .addComponent(removeButton)
                    .addComponent(refeshButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refeshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchGuestButton;
    private javax.swing.JTextField searchGuestTextField;
    // End of variables declaration//GEN-END:variables
}
