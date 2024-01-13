/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhoneRental;


import Customers.CustomerLanding;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahulb
 */
public class CustomerPhoneRent extends javax.swing.JFrame {

    /**
     * Creates new form CustomerPhoneRent
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerPhoneRent() {
        initComponents();
        Display(); 
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
     public CustomerPhoneRent(String s) {
        initComponents();
        showData(s);
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Display();    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        txtProductID = new javax.swing.JTextField();
        txtReturnDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRentDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneRental/PhoneRental/rent.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 260, 310));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 610, 190));

        btnRequest.setBackground(new java.awt.Color(51, 51, 51));
        btnRequest.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 105, 39));

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 162, 32));
        jPanel2.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 162, 31));

        jLabel12.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Return Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 102, 31));

        jLabel13.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Product ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 102, 31));

        txtRentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 162, 31));

        jLabel11.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rent Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 102, 31));

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 102, 31));
        jPanel2.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 162, 31));
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 162, 31));

        jLabel9.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Model");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 102, 31));

        jLabel4.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 102, 31));
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 162, 31));
        jPanel2.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 162, 31));

        jLabel1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 102, 31));

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 102, 40));

        jLabel14.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Rent Phones");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 246, 60));

        jLabel15.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Status");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 102, 31));
        jPanel2.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 162, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentDateActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        int flag = 0 ;
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
                }
        if(flag == 0){        
        String sql="UPDATE Customer SET phone_payment_status = 'pending', PhoneApprove = 'Requested' ,PhoneID = '"+txtProductID.getText()+"',PhoneRentDate = '"+txtRentDate.getText()+"',PhoneReturnDate = '"+txtReturnDate.getText()+"', PhonePrice = '"+txtPrice.getText()+"' WHERE CustomerID = '"+txtCustomerId.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
         Reset();
            }}
      catch (Exception ex) {
      System.out.println(ex);}
        
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        String s = txtCustomerId.getText();
        CustomerLanding lr = new CustomerLanding (s);
        lr.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPhoneRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
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
            String sql = "select * from Phone";
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
