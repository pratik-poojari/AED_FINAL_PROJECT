/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Delivery;

/**
 *
 * @author Pratik Poojari
 */
public class DeliveryMan {
    private String name1;
    private String phone1;
    private String address1;
    private int id1;
    private static int count = 1;

    public DeliveryMan() {
        id1 = count;
        count++;
    }

    public int getId() {
        return id1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    
    public String getName() {
        return name1;
    }

    @Override
    public String toString() {
        return name1;
    }

    public String getPhone() {
        return phone1;
    }

    public void setPhone(String phone) {
        this.phone1 = phone;
    }

    public String getAddress() {
        return address1;
    }

    public void setAddress(String address) {
        this.address1 = address;
    }    
}
