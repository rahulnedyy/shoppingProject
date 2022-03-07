
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProductDao;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.ProductPojo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UserHomePage extends javax.swing.JFrame {


    public UserHomePage() {
        initComponents();
        showHomeProduct();
        showMobileProduct();
        showFashionProduct();
      showBooksProduct();
      setLocationRelativeTo(null);
        setTitle("Infostretch Shopping");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        tblFashion = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHome = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMobile = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFashionApparels = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SHOPPING");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search");

        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnCart.setBackground(new java.awt.Color(51, 102, 255));
        btnCart.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        btnCart.setForeground(new java.awt.Color(255, 255, 255));
        btnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_OpenCart_24px.png"))); // NOI18N
        btnCart.setText("Cart");
        btnCart.setToolTipText("View your cart.");
        btnCart.setBorderPainted(false);
        btnCart.setContentAreaFilled(false);
        btnCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCart.setMaximumSize(new java.awt.Dimension(67, 49));
        btnCart.setOpaque(true);
        btnCart.setPreferredSize(new java.awt.Dimension(67, 49));
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGo)
                .addGap(59, 59, 59)
                .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        tblFashion.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        tblHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Seller Info", "Expected days to Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHome.getTableHeader().setReorderingAllowed(false);
        tblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHomeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHome);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        tblFashion.addTab("Home Appliance", jPanel4);

        tblMobile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Seller Info", "Expected days to Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMobile.getTableHeader().setReorderingAllowed(false);
        tblMobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMobileMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMobile);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        tblFashion.addTab("Mobile Phone and Accessories", jPanel5);

        tblFashionApparels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Seller Info", "Expected days to Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFashionApparels.getTableHeader().setReorderingAllowed(false);
        tblFashionApparels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFashionApparelsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblFashionApparels);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        tblFashion.addTab("Fashion and Apparels", jPanel7);

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Seller Info", "Expected days to Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.getTableHeader().setReorderingAllowed(false);
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblBook);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        tblFashion.addTab("Books", jPanel6);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBack.setBackground(new java.awt.Color(51, 102, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Remove");

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total");

        btnBuy.setBackground(new java.awt.Color(51, 102, 255));
        btnBuy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuy.setText("BUY");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        tblFashion.addTab("Cart", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tblFashion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblFashion, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoActionPerformed
    ProductConformation pip=new ProductConformation();
    private void tblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHomeMouseClicked
        // TODO add your handling code here:
        pip.setVisible(true);
        pip.pack();
        
        int selectedRow = tblHome.getSelectedRow();
        TableModel tm = tblHome.getModel();
        
        String name = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String sellerInfo = tm.getValueAt(selectedRow, 2).toString();
        String date = tm.getValueAt(selectedRow, 3).toString();
        pip.txtName.setText(name);
        pip.txtPrice.setText(price);
        pip.txtSellerInfo.setText(sellerInfo);
        pip.txtDate.setText(date);
        
        
       
        
    }//GEN-LAST:event_tblHomeMouseClicked

    private void tblMobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMobileMouseClicked
        // TODO add your handling code here:
         pip.setVisible(true);
        pip.pack();
        
        int selectedRow = tblMobile.getSelectedRow();
        TableModel tm = tblMobile.getModel();
        
        String name = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String sellerInfo = tm.getValueAt(selectedRow, 2).toString();
        String date = tm.getValueAt(selectedRow, 3).toString();
        pip.txtName.setText(name);
        pip.txtPrice.setText(price);
        pip.txtSellerInfo.setText(sellerInfo);
        pip.txtDate.setText(date);
        
        
    }//GEN-LAST:event_tblMobileMouseClicked

    private void tblFashionApparelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFashionApparelsMouseClicked
        // TODO add your handling code here:
         pip.setVisible(true);
        pip.pack();
        
        int selectedRow = tblFashionApparels.getSelectedRow();
        TableModel tm = tblFashionApparels.getModel();
        
        String name = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String sellerInfo = tm.getValueAt(selectedRow, 2).toString();
        String date = tm.getValueAt(selectedRow, 3).toString();
        pip.txtName.setText(name);
        pip.txtPrice.setText(price);
        pip.txtSellerInfo.setText(sellerInfo);
        pip.txtDate.setText(date);
        
        
    }//GEN-LAST:event_tblFashionApparelsMouseClicked

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        // TODO add your handling code here:
         pip.setVisible(true);
        pip.pack();
        
        int selectedRow = tblBook.getSelectedRow();
        TableModel tm = tblBook.getModel();
        
        String name = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String sellerInfo = tm.getValueAt(selectedRow, 2).toString();
        String date = tm.getValueAt(selectedRow, 3).toString();
        pip.txtName.setText(name);
        pip.txtPrice.setText(price);
        pip.txtSellerInfo.setText(sellerInfo);
        pip.txtDate.setText(date);
        
        
    }//GEN-LAST:event_tblBookMouseClicked

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        // TODO add your handling code here:
         CartPage adminPanelScreen=new CartPage();
         adminPanelScreen.setVisible(true);
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblBook;
    private javax.swing.JTabbedPane tblFashion;
    private javax.swing.JTable tblFashionApparels;
    private javax.swing.JTable tblHome;
    private javax.swing.JTable tblMobile;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
private void showHomeProduct(){     
try{
        ArrayList<ProductPojo> list = ProductDao.getAllHomeProducts();
        Object rowData[] = new Object[4];
       DefaultTableModel dtm=(DefaultTableModel)tblHome.getModel();
            for(ProductPojo e:list)
            {
                rowData[0]=e.getpname();
                rowData[1]=e.getprice();
                rowData[2]=e.getsellerInfo();
                rowData[3]=e.getdate();
                dtm.addRow(rowData);
                
            }
        }
         catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"DB Error:"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    }
}

private void showMobileProduct(){     
try{
        ArrayList<ProductPojo> list = ProductDao.getAllMobileProducts();
        Object rowData[] = new Object[4];
       DefaultTableModel dtm=(DefaultTableModel)tblMobile.getModel();
            for(ProductPojo e:list)
            {
                rowData[0]=e.getpname();
                rowData[1]=e.getprice();
                rowData[2]=e.getsellerInfo();
                rowData[3]=e.getdate();
                dtm.addRow(rowData);
                
            }
        }
         catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"DB Error:"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    }
}

private void showFashionProduct(){     
try{
        ArrayList<ProductPojo> list = ProductDao.getAllFashionProducts();
        Object rowData[] = new Object[4];
       DefaultTableModel dtm=(DefaultTableModel)tblFashionApparels.getModel();
            for(ProductPojo e:list)
            {
                rowData[0]=e.getpname();
                rowData[1]=e.getprice();
                rowData[2]=e.getsellerInfo();
                rowData[3]=e.getdate();
                dtm.addRow(rowData);
                
            }
        }
         catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"DB Error:"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    }
}
private void showBooksProduct(){     
try{
        ArrayList<ProductPojo> list = ProductDao.getAllBooksProducts();
        Object rowData[] = new Object[4];
       DefaultTableModel dtm=(DefaultTableModel)tblBook.getModel();
            for(ProductPojo e:list)
            {
                rowData[0]=e.getpname();
                rowData[1]=e.getprice();
                rowData[2]=e.getsellerInfo();
                rowData[3]=e.getdate();
                dtm.addRow(rowData);
                
            }
        }
         catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"DB Error:"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    }
}
}