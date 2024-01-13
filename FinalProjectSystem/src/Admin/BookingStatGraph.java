/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;
import MySQLConnection.MySQLConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author preetikulkarni
 */
public class BookingStatGraph extends javax.swing.JPanel {

    /**
     * Creates new form BookingStatGraph
     */
    MySQLConnection c = new MySQLConnection();
    public BookingStatGraph() throws SQLException {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(1000, 800));
        add(chartPanel);
    }
    private CategoryDataset createDataset() throws SQLException {
        String BikeRequestedCount = "";
        String BikeApprovedCount = "";
        String CarRequestedCount = "";
        String CarApprovedCount = "";
        String PhoneRequestedCount = "";      
        String PhoneApprovedCount = "";      
        String LaptopRequestedCount = "";      
        String LaptopApprovedCount = "";
                
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String BikeRequestedsql="select count(*) from Customer where BikeApprove = 'Requested'";
        ResultSet BikeRequested = c.selectDatabase(BikeRequestedsql);
        while(BikeRequested.next()){
         BikeRequestedCount = BikeRequested.getString(1);
        }
        String BikeApprovedsql="select count(*) from Customer where BikeApprove = 'Booked'";
        ResultSet BikeApproved = c.selectDatabase(BikeApprovedsql);
        while(BikeApproved.next()){
            BikeApprovedCount = BikeApproved.getString(1);
        }
        String CarRequestedsql="select count(*) from Customer where CarApprove = 'Requested'";
         ResultSet CarRequested = c.selectDatabase(CarRequestedsql); 
        while(CarRequested.next()){
            CarRequestedCount = CarRequested.getString(1);
        } 
          
            
        String CarApprovedsql="select count(*) from Customer where CarApprove = 'Booked'";
        ResultSet CarApproved = c.selectDatabase(CarApprovedsql);
        while(CarApproved.next()){
            CarApprovedCount = CarApproved.getString(1);
        }
        
            
        String PhoneRequestedsql="select count(*) from Customer where PhoneApprove = 'Requested'";
        ResultSet PhoneRequested = c.selectDatabase(PhoneRequestedsql);
        while(PhoneRequested.next()){
            PhoneRequestedCount = PhoneRequested.getString(1);
        }
           
            
        String PhoneApprovedsql="select count(*) from Customer where PhoneApprove = 'Booked'";
        ResultSet PhoneApproved = c.selectDatabase(PhoneApprovedsql);
        while(PhoneApproved.next()){
            PhoneApprovedCount = PhoneApproved.getString(1);
        } 
        
            
        String LaptopRequestedsql="select count(*) from Customer where LaptopApprove = 'Requested'";
         ResultSet LaptopRequested = c.selectDatabase(LaptopRequestedsql);
        while(LaptopRequested.next()){
            LaptopRequestedCount = LaptopRequested.getString(1);
        }
            
        String LaptopApprovedsql="select count(*) from Customer where LaptopApprove = 'Booked'";
        ResultSet LaptopApproved = c.selectDatabase(LaptopApprovedsql);
        while(LaptopApproved.next()){
            LaptopApprovedCount = LaptopApproved.getString(1);
        } 
         
         

        // Sample data (you should replace this with your actual data)
        dataset.addValue(Integer.parseInt(BikeRequestedCount), "Requested", "Bike");
        dataset.addValue(Integer.parseInt(BikeApprovedCount), "Approved", "Bike");

        dataset.addValue(Integer.parseInt(CarRequestedCount), "Requested", "Car");
        dataset.addValue(Integer.parseInt(CarApprovedCount), "Approved", "Car");

        dataset.addValue(Integer.parseInt(PhoneRequestedCount), "Requested", "Laptop");
        dataset.addValue(Integer.parseInt(PhoneApprovedCount), "Approved", "Laptop");

        dataset.addValue(Integer.parseInt(LaptopRequestedCount), "Requested", "Phone");
        dataset.addValue(Integer.parseInt(LaptopApprovedCount), "Approved", "Phone");

        return dataset;
    }
   
   private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Booking Analysis",
                "Category",
                "Number of Bookings",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setDomainAxis(new CategoryAxis("Category"));
        plot.setRangeAxis(new NumberAxis("Number of Bookings"));

        // Adjust the position of the category labels
        CategoryAxis xAxis = plot.getDomainAxis();
        xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        return chart;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
