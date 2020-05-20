/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Drinks;
import model.User;
import service.DrinksService;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class ManageDrinksFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageDrinks
     */
    Drinks drinks;
    DrinksService drinksService;
    DefaultTableModel defaultTableModel;
    User u;
    UserService userService = new UserService();
    public ManageDrinksFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = userService.getUserByID(IDuser);
        drinksService = new DrinksService();
        defaultTableModel = (DefaultTableModel) DrinksTable1.getModel();
        List<Drinks> listD  = drinksService.getAllDrinks();
        listD.forEach((d) -> {
            defaultTableModel.addRow(new Object[]{d.getIDdrinks(), d.getName(), d.getPrice()+"đ"});
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

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchGoodsTextField = new javax.swing.JTextField();
        searchGoodsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DrinksTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        addDrinks = new javax.swing.JButton();
        editDrinks = new javax.swing.JButton();
        removeDrinksButton = new javax.swing.JButton();
        refeshButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(655, 365));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 216, 148));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên Đồ Uống");

        searchGoodsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoodsTextFieldActionPerformed(evt);
            }
        });

        searchGoodsButton.setBackground(new java.awt.Color(255, 190, 108));
        searchGoodsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search.png"))); // NOI18N
        searchGoodsButton.setText("Tìm Kiếm");
        searchGoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoodsButtonActionPerformed(evt);
            }
        });
        searchGoodsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchGoodsButtonKeyPressed(evt);
            }
        });

        DrinksTable1.setBackground(new java.awt.Color(255, 216, 148));
        DrinksTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DrinksTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số", "Tên ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        DrinksTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(DrinksTable1);
        if (DrinksTable1.getColumnModel().getColumnCount() > 0) {
            DrinksTable1.getColumnModel().getColumn(0).setMinWidth(90);
            DrinksTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            DrinksTable1.getColumnModel().getColumn(0).setMaxWidth(90);
            DrinksTable1.getColumnModel().getColumn(1).setMinWidth(250);
            DrinksTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            DrinksTable1.getColumnModel().getColumn(1).setMaxWidth(250);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(searchGoodsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGoodsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 50, 460, 264);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(484, 47, 150, 14);

        addDrinks.setBackground(new java.awt.Color(255, 190, 108));
        addDrinks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add.png"))); // NOI18N
        addDrinks.setText("Thêm");
        addDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinksActionPerformed(evt);
            }
        });
        getContentPane().add(addDrinks);
        addDrinks.setBounds(490, 67, 132, 41);

        editDrinks.setBackground(new java.awt.Color(255, 190, 108));
        editDrinks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/edit.png"))); // NOI18N
        editDrinks.setText("Sửa");
        editDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDrinksActionPerformed(evt);
            }
        });
        getContentPane().add(editDrinks);
        editDrinks.setBounds(490, 134, 132, 44);

        removeDrinksButton.setBackground(new java.awt.Color(255, 190, 108));
        removeDrinksButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeDrinksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/xoa.png"))); // NOI18N
        removeDrinksButton.setText("Xóa");
        removeDrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDrinksButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeDrinksButton);
        removeDrinksButton.setBounds(490, 196, 132, 47);

        refeshButton6.setBackground(new java.awt.Color(255, 190, 108));
        refeshButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refeshButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/refresh1.png"))); // NOI18N
        refeshButton6.setText("Refresh");
        refeshButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(refeshButton6);
        refeshButton6.setBounds(490, 270, 132, 41);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Đồ Uống");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 0, 250, 29);

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
        jButton1.setBounds(0, 0, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 660, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchGoodsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsTextFieldActionPerformed

    private void searchGoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsButtonActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        if (searchGoodsTextField.getText().equals("")) {

            List<Drinks> listD  = drinksService.getAllDrinks();
        listD.forEach((d) -> {
            defaultTableModel.addRow(new Object[]{d.getIDdrinks(), d.getName(), d.getPrice()});
        });
        }else{
            String a= searchGoodsTextField.getText().replaceAll("\\s","");
            List<Drinks> listD  = drinksService.getDrinksByName(a);
        listD.forEach((d) -> {
            defaultTableModel.addRow(new Object[]{d.getIDdrinks(), d.getName(), d.getPrice()});
        });
        }
    }//GEN-LAST:event_searchGoodsButtonActionPerformed

    private void searchGoodsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchGoodsButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsButtonKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = u.getRole().replaceAll("\\s","");
        if (a.equals("Admin")) {
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
        }
        if (a.equals("Employee")) {
            new MenuEmployeeFrame(u.getIDUser()).setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refeshButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshButton6ActionPerformed
        defaultTableModel.setRowCount(0);
        List<Drinks> listD  = drinksService.getAllDrinks();
        listD.forEach((d) -> {
            defaultTableModel.addRow(new Object[]{d.getIDdrinks(), d.getName(), d.getPrice()+"đ"});
        });
    }//GEN-LAST:event_refeshButton6ActionPerformed

    private void removeDrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDrinksButtonActionPerformed
        // TODO add your handling code here:
        int row = DrinksTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageDrinksFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(ManageDrinksFrame.this,
                    "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String IDDrinks = String.valueOf(DrinksTable1.getValueAt(row, 0));
                
                drinksService.removeDrinks(IDDrinks);
                defaultTableModel.setRowCount(0);
                List<Drinks> listD  = drinksService.getAllDrinks();
        listD.forEach((d) -> {
            defaultTableModel.addRow(new Object[]{d.getIDdrinks(), d.getName(), d.getPrice()+"đ"});
        });
                JOptionPane.showMessageDialog(ManageDrinksFrame.this, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_removeDrinksButtonActionPerformed

    private void addDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinksActionPerformed
        new addDrinksFrame().setVisible(true);
        
    }//GEN-LAST:event_addDrinksActionPerformed

    private void editDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDrinksActionPerformed
       int row = DrinksTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageDrinksFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            
            int ID = (Integer) DrinksTable1.getValueAt(row, 0);
            new editDrinksFrame(ID).setVisible(true);
            
        }
    }//GEN-LAST:event_editDrinksActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DrinksTable1;
    private javax.swing.JButton addDrinks;
    private javax.swing.JButton editDrinks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refeshButton6;
    private javax.swing.JButton removeDrinksButton;
    private javax.swing.JButton searchGoodsButton;
    private javax.swing.JTextField searchGoodsTextField;
    // End of variables declaration//GEN-END:variables
}
