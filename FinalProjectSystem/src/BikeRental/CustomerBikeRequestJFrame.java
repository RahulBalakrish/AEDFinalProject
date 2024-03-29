/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BikeRental;
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
 * @author monicasriramreddy
 */
public class CustomerBikeRequestJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerBikeRequestJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerBikeRequestJFrame() {
        initComponents();
        TxtCustomerID.setEditable(false);
        TxtRegNo.setEditable(false);
        TxtPrice.setEditable(false);
        TxtModel.setEditable(false);
        TxtBrand.setEditable(false);
        Display();
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public CustomerBikeRequestJFrame(String s) {
        initComponents();
        showData(s);
        TxtCustomerID.setEditable(false);
        TxtRegNo.setEditable(false);
        TxtPrice.setEditable(false);
        TxtModel.setEditable(false);
        TxtBrand.setEditable(false);
        Display();
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        TxtCustomerID = new javax.swing.JTextField();
        TxtModel = new javax.swing.JTextField();
        TxtBrand = new javax.swing.JTextField();
        TxtRentDate = new javax.swing.JTextField();
        TxtReturnDate = new javax.swing.JTextField();
        TxtRegNo = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCustReq = new javax.swing.JTable();
        BtnRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Customer ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 107, 102, 31));

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 198, 102, -1));

        jLabel11.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Model");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 155, 102, -1));

        jLabel12.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Rent Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 102, 31));

        jLabel13.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Return Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 102, 31));

        jLabel14.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 102, 31));

        jLabel15.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Reg No");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 102, 31));

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 102, 30));

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 108, 140, 31));

        TxtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModelActionPerformed(evt);
            }
        });
        jPanel1.add(TxtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 151, 140, 31));
        jPanel1.add(TxtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 194, 140, 31));
        jPanel1.add(TxtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 31));
        jPanel1.add(TxtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 31));
        jPanel1.add(TxtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 31));

        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 140, 31));

        jLabel17.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Status");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 102, -1));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 830));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Rent Bike");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 246, 60));

        TblCustReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model", "Status", "Price"
            }
        ));
        TblCustReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCustReqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblCustReq);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 401, 220));

        BtnRequest.setBackground(new java.awt.Color(153, 153, 153));
        BtnRequest.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnRequest.setForeground(new java.awt.Color(51, 51, 51));
        BtnRequest.setText("Request");
        BtnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BikeRequest.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 178, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 1440, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void TblCustReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCustReqMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblCustReq.getModel();
        int MyIndex = TblCustReq.getSelectedRow();
        TxtRegNo.setText(model.getValueAt(MyIndex,0).toString());
        TxtModel.setText(model.getValueAt(MyIndex,2).toString());
        TxtPrice.setText(model.getValueAt(MyIndex,4).toString());
        TxtBrand.setText((model.getValueAt(MyIndex, 1).toString()));
        txtStatus.setText(model.getValueAt(MyIndex,3).toString());
        
      
    }//GEN-LAST:event_TblCustReqMouseClicked

    private void BtnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestActionPerformed
        // TODO add your handling code here:
        int flag =0;
        try {
             SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                try{
                   Date RentDate = formatter.parse(TxtRentDate.getText());
                   Date ReturnDate = formatter.parse(TxtReturnDate.getText());
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
//                     TxtRentDate.setText("");
//                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     TxtReturnDate.setText("");
                        flag = 1;
                }
                if(flag == 0){
        String sql="UPDATE Customer SET bike_payment_status = 'pending', BikeApprove = 'Requested' ,bikeID = '"+TxtRegNo.getText()+"',BikeRentDate = '"+TxtRentDate.getText()+"',bikeReturnDate = '"+TxtReturnDate.getText()+"', BikePrice = '"+TxtPrice.getText()+"' WHERE CustomerID = '"+TxtCustomerID.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
        Reset();
         
            }
        }
      catch (Exception ex) {
      System.out.println(ex);}
    }//GEN-LAST:event_BtnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        String s  = TxtCustomerID.getText();
        CustomerLanding lr = new CustomerLanding (s);
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void TxtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModelActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBikeRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBikeRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBikeRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBikeRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBikeRequestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRequest;
    private javax.swing.JTable TblCustReq;
    private javax.swing.JTextField TxtBrand;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtModel;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentDate;
    private javax.swing.JTextField TxtReturnDate;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void Display() {
        String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from Bike";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblCustReq.getModel();
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
        TxtCustomerID.setText(s);
         }
    
    public void Reset(){
        TxtModel.setText("");
        TxtRentDate.setText("");
        TxtReturnDate.setText("");
        TxtRegNo.setText("");
        TxtModel.setText("");
        TxtPrice.setText("");
        TxtBrand.setText("");
    }
}
