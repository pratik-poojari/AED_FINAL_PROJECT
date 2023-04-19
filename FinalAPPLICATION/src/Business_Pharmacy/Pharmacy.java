/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Pharmacy;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business_Medicine.Medicine;
import Business_Orders.Order_Directory;
import Business_Orders.Orders;
import Business.SupplierOrders.SupplierOrders;
import java.util.ArrayList;

/**
 *
 * @author Pratik Poojari
 */
public class Pharmacy {
    private String name;
    private String address;
    private String email;
    private String phone;
    private int id;
    private static int count = 1;
    private DeliveryManDirectory deliveryManDirectory;
    private EmployeeDirectory employeeDirectory;
    private Order_Directory orderDirectory;
    private Medicine medicineCatalog;
    private ArrayList<SupplierOrders> PastSupplierOrderList;
   
    
    public Pharmacy() {
        id = count;
        count++;
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.orderDirectory = new Order_Directory();
        this.medicineCatalog = new Medicine();
        this.PastSupplierOrderList = new ArrayList<SupplierOrders>();
    }
    
    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    @Override
    public String toString() {
        return name;
    }

    public Order_Directory getOrderDirectory() {
        return orderDirectory;
    }
    
    public ArrayList<SupplierOrders> getPastSupplierOrderList() {
        return PastSupplierOrderList;
    }

    public Medicine getMedicineCatalog() {
        return medicineCatalog;
    }
    
    public void deleteOrder(Orders o)
    {
        this.getOrderDirectory().getOrderList().remove(o);
    }
    
    public DeliveryMan findDeliveryMan(String name)
    {
        for(DeliveryMan dm : this.deliveryManDirectory.getDeliveryManList())
        {
            if(dm.getName().equals(name))
            {
                return dm;
            }
        }
        return null;
    }    



public void AddSupplierOrder()
    {
        
    }    
}

 
