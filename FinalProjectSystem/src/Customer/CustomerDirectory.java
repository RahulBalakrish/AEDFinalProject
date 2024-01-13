/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author sreshtakamani
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setHistory(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        customerList.add(newCustomer);
        return newCustomer;
        
    }
     public Customer updateCustomer(){
         
        Customer newCustomer = new Customer();
        customerList.add(newCustomer);
        return newCustomer;
     }
    public void deleteEmployee(Customer eh){
        customerList.remove(eh);
    }
}
