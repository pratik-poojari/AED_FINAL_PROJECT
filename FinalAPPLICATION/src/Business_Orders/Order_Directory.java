/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Orders;

import Business_Customer.Customer;
import Business.Hospital.Hospital;
import java.util.ArrayList;
/**
 *
 * @author Pratik Poojari
 */
public class Order_Directory {
    private ArrayList<Orders> orderList;
    
    public Order_Directory() {
        orderList = new ArrayList();
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }
    
    public Orders NewOrderCreation(Customer cust)
    {
        Orders orders = new Orders();
        orders.setCustomer(cust);
        orderList.add(orders);
        cust.getPastOrderList().add(orders);
        return orders;
    }   
    
    public Orders NewHospitalCreation(Hospital hosp)
    {
        Orders orders = new Orders();
        orders.setHospital(hosp);
        orderList.add(orders);
        hosp.getPastOrderList().add(orders);
        return orders;
    } 
    
}
