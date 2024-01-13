/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LaptopRental;

import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Customers.CustomerLanding;
import HomeLanding.HomeLanding;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author rahulb
 */
public class CustomerLaptopRent extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLaptopRent
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerLaptopRent() {
        initComponents();
        Display(); 
         txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
        txtBrand.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
     public CustomerLaptopRent(String s) {
        initComponents();
        showData(s);
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
        txtBrand.setEditable(false);
        Display();  
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRentDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtReturnDate = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLaptopList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model", "Status", "Price"
            }
        ));
        tblLaptopList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLaptopList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 500, 260));

        btnRequest.setBackground(new java.awt.Color(51, 51, 51));
        btnRequest.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 115, 43));

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 115, 43));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 102, 31));
        jPanel2.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 171, 31));
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 171, 31));

        jLabel4.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 102, 31));

        jLabel9.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Model");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 102, 31));
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 171, 28));
        jPanel2.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 171, 30));

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 102, 31));

        jLabel11.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rent Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 102, 31));
        jPanel2.add(txtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 171, 30));

        jLabel12.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Return Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 102, 31));
        jPanel2.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 171, 30));
        jPanel2.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 171, 31));

        jLabel13.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Product ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 102, 31));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LaptopRental/LaptopRental/desktop-computer.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 300, 160));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Rent Laptop");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 246, 60));
        jPanel2.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 171, 30));

        jLabel16.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Status");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 102, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        int flag =0;
      try {
          
          SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                try{
                   Date RentDate = formatter.parse(txtRentDate.getText());
                   Date ReturnDate = formatter.parse(txtReturnDate.getText());
                   if(RentDate.compareTo(ReturnDate)>0){
                       JOptionPane.showMessageDialog(this,"Please enter valid date for rent and return date");
                       flag = 1;
                   }else if(txtStatus.getText().equalsIgnoreCase("Booked")){
                       JOptionPane.showMessageDialog(this,"It is already booked. Please choose other!");
                       flag = 1;
                   }
                } 
                catch(Exception e){
                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     txtRentDate.setText("");
//                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     txtReturnDate.setText("");
                        flag = 1;
                     return;
                }
                if(flag == 0){
        String sql="UPDATE Customer SET laptop_payment_status = 'pending', LaptopApprove = 'Requested' ,LaptopID = '"+txtProductID.getText()+"',LaptopRentDate = '"+txtRentDate.getText()+"',LaptopReturnDate = '"+txtReturnDate.getText()+"', LaptopPrice = '"+txtPrice.getText()+"' WHERE CustomerID = '"+txtCustomerId.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
         Reset();
                }
            }
      catch (Exception ex) {
      System.out.println(ex);}
      
    }//GEN-LAST:event_btnRequestActionPerformed

    private void tblLaptopListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopList.getModel();
        int MyIndex = tblLaptopList.getSelectedRow();
        txtProductID.setText(model.getValueAt(MyIndex,0).toString());
        txtModel.setText(model.getValueAt(MyIndex,2).toString());
        txtPrice.setText(model.getValueAt(MyIndex,4).toString());
        txtStatus.setText(model.getValueAt(MyIndex,3).toString());
        txtBrand.setText((model.getValueAt(MyIndex, 1).toString()));
    }//GEN-LAST:event_tblLaptopListMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding lr = new HomeLanding();
                lr.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLaptopRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaptopList;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtRentDate;
    private javax.swing.JTextField txtReturnDate;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void Display() {
         String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from Laptop";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblLaptopList.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(2);
                carmodel = rs.getString(3);
                status = rs.getString(4);
                price = rs.getString(5);
                String[] row = {reg,brand,carmodel,status,price};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();      
        }
    
    }

    private void showData(String s) {
         txtCustomerId.setText(s);
      }
        
    public void Reset(){
//    txtCustomerId.setText("");
    txtProductID.setText("");
    txtModel.setText("");
    txtBrand.setText("");
    txtPrice.setText("");
    txtRentDate.setText("");
    txtReturnDate.setText("");
            }
    
    
}
