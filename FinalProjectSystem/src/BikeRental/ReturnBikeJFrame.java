/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BikeRental;

import HomeLanding.HomeLanding;
import HomeLanding.VehicleAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author monicasriramreddy
 */
public class ReturnBikeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBikeJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public ReturnBikeJFrame() {
        initComponents();
        DisplayCarOnRent();
        TxtRegNo.setEditable(false);
        TxtRentID.setEditable(false);
        TxtCustomerID.setEditable(false);
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

        ReturnBikePanel = new javax.swing.JPanel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnRentBike = new javax.swing.JButton();
        BtnManageBike = new javax.swing.JButton();
        BtnReturnCar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblBikeOnRent = new javax.swing.JTable();
        TxtCustomerID = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        BtnConfirm = new javax.swing.JButton();
        TxtRegNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LblReturnCarHeading = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnBikePanel.setBackground(new java.awt.Color(51, 51, 51));
        ReturnBikePanel.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBikePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonsPanel.setBackground(new java.awt.Color(153, 153, 153));
        ButtonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRentBike.setBackground(new java.awt.Color(51, 51, 51));
        BtnRentBike.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnRentBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnRentBike.setText("Manage Rents");
        BtnRentBike.setBorder(null);
        BtnRentBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRentBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRentBikeActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnRentBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 128, 29));

        BtnManageBike.setBackground(new java.awt.Color(51, 51, 51));
        BtnManageBike.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnManageBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageBike.setText("Manage Bike");
        BtnManageBike.setBorder(null);
        BtnManageBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageBikeActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnManageBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 128, 29));

        BtnReturnCar1.setBackground(new java.awt.Color(51, 51, 51));
        BtnReturnCar1.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnReturnCar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnCar1.setText("Back");
        BtnReturnCar1.setBorder(null);
        BtnReturnCar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnCar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnCar1ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnReturnCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 128, 29));

        ReturnBikePanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 1090));

        TblBikeOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Reg No", "Rent ID", "Rent Fee"
            }
        ));
        TblBikeOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBikeOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblBikeOnRent);

        ReturnBikePanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 491, 535, 160));

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });
        ReturnBikePanel.add(TxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 212, 150, 32));

        TxtRentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRentIDActionPerformed(evt);
            }
        });
        ReturnBikePanel.add(TxtRentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 262, 150, 32));

        BtnConfirm.setBackground(new java.awt.Color(153, 153, 153));
        BtnConfirm.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });
        ReturnBikePanel.add(BtnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
        ReturnBikePanel.add(TxtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 313, 150, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Oriya MN", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LeaseLyfe");
        ReturnBikePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 109, -1, -1));

        LblReturnCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblReturnCarHeading.setFont(new java.awt.Font("Oriya MN", 3, 18)); // NOI18N
        LblReturnCarHeading.setForeground(new java.awt.Color(255, 255, 255));
        LblReturnCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReturnCarHeading.setText("Return Bikes");
        LblReturnCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReturnBikePanel.add(LblReturnCarHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 172, 243, -1));

        jLabel6.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");
        ReturnBikePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 212, -1, 32));

        jLabel8.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");
        ReturnBikePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 262, -1, 32));

        jLabel10.setFont(new java.awt.Font("Oriya MN", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Reg No :");
        ReturnBikePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 312, -1, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Returnbike.png"))); // NOI18N
        ReturnBikePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 140, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Returnbike1.png"))); // NOI18N
        ReturnBikePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 200, 110));

        getContentPane().add(ReturnBikePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRentBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRentBikeActionPerformed
        // TODO add your handling code here:
        RentBikeJFrame rc = new RentBikeJFrame();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRentBikeActionPerformed

    private void BtnManageBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageBikeActionPerformed
        // TODO add your handling code here:
        ManageBikeJFrame mc = new ManageBikeJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManageBikeActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
        try{
            int flag = 0;
            int flag2 = 0;
                if(flag == 0){
             String sql = "Select bike_payment_status from Customer where CustomerID = '"+TxtCustomerID.getText()+"'";
            ResultSet rs = c.selectDatabase(sql);
            while(rs.next()){
                if(rs.getString(1).equalsIgnoreCase("Done")){
                    flag2 = 1;
                }
            }
            if(flag2==1){
            JOptionPane.showMessageDialog(this,"Return Confirmed");
            String sql1 ="UPDATE Car SET Status = 'Available', rentid = NULL  WHERE Productid = '"+TxtRegNo.getText()+"'";
            c.updateDatabase(sql1);
 
            DisplayCarOnRent();
            TxtCustomerID.setText("");
            TxtRentID.setText("");
            TxtRegNo.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"Payment status is still pending");
            }
            

        }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void TblBikeOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBikeOnRentMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblBikeOnRent.getModel();
        int MyIndex = TblBikeOnRent.getSelectedRow();
        TxtCustomerID.setText(model.getValueAt(MyIndex,0).toString());
        TxtRentID.setText(model.getValueAt(MyIndex,2).toString());
        TxtRegNo.setText(model.getValueAt(MyIndex,1).toString());
    }//GEN-LAST:event_TblBikeOnRentMouseClicked

    private void TxtRentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRentIDActionPerformed

    private void BtnReturnCar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnCar1ActionPerformed
        // TODO add your handling code here:
        VehicleAdminLandingPage hl = new VehicleAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnCar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBikeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JButton BtnManageBike;
    private javax.swing.JButton BtnRentBike;
    private javax.swing.JButton BtnReturnCar1;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblReturnCarHeading;
    private javax.swing.JPanel ReturnBikePanel;
    private javax.swing.JTable TblBikeOnRent;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void DisplayCarOnRent() {
        String reg,brand,carmodel,status,price;
        try{
            String sql = "select * from Bike where Status = 'Booked' and rentid IS NOT NULL";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblBikeOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
            }
            while (rs.next()) {
                reg = rs.getString(8);
                brand = rs.getString(1);
                carmodel = rs.getString(11);
                status = rs.getString(5);
                String[] row = {status,reg,brand,carmodel};
                model.addRow(row);                  
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();    
        }
    
    }
}
