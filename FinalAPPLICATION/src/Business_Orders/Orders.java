/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Orders;

import Business_Customer.Customer;
import Business_Delivery.DeliveryMan;
import Business_Medicine.MedicineItem;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Business_Hospital.Hospital;
/**
 *
 * @author Pratik Poojari
 */
public class Orders {
    private Customer customer1;
    private int orderid;
    private LocalDateTime orderdate;
    private static int count = 1;
    private ArrayList<MedicineItem> medicineItemList;
    private DeliveryMan deliveryman;
    private int totalAmount;
    private String message;
    private boolean status;
    
    private Hospital hospital;
    
    public Orders() {
        orderid = count;
        count++;
        this.orderdate = LocalDateTime.now();
        this.medicineItemList = new ArrayList<MedicineItem>();
        this.message = "";
        this.status = false;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    
    public Customer getCustomer() {
        return customer1;
    }

    public void setCustomer(Customer customer) {
        this.customer1 = customer;
    }

    public ArrayList<MedicineItem> getMedicineItemList() {
        return medicineItemList;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryman;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryman = deliveryMan;
    }

    public int getOrderId() {
        return orderid;
    }

    public LocalDateTime getOrderDate() {
        return orderdate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
    
    public void delete_medicine(MedicineItem mi)
    {
        medicineItemList.remove(mi);
    }
    
    public int calculate_amount()
    {
        int sum = 0;
        for(MedicineItem mi : this.getMedicineItemList())
        {
            sum = sum + mi.getPrice();
        }
        this.totalAmount = sum;
        return sum;
    }
    
    public void addItem(MedicineItem mi)
    {
        medicineItemList.add(mi);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return Integer.toString(orderid);
    }   
  
}
