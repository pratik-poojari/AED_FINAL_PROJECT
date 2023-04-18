/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author Pratik Poojari
 */
public class Hospital {
    
    private String Hospitalname;
    private int Hospitalid;
    private String Hospitaladdress;
    private String Hospitalcontactno;
    private String emailid;
    
    private static int count = 1;
    private ArrayList<Orders> PastOrderList;

    public String getHospitalName() {
        return Hospitalname;
    }

    public void setHospitalName(String HospitalName) {
        this.Hospitalname = HospitalName;
    }

    public int getHospitalId() {
        return Hospitalid;
    }

    public void setHospitalId(int HospitalId) {
        this.Hospitalid = HospitalId;
    }

    public String getHospitalAddress() {
        return Hospitaladdress;
    }

    public void setHospitalAddress(String HospitalAddress) {
        this.Hospitaladdress = HospitalAddress;
    }

    public String getHospitalContactNo() {
        return Hospitalcontactno;
    }

    public void setHospitalContactNo(String HospitalContactNo) {
        this.Hospitalcontactno = HospitalContactNo;
    }

    public String getEmailId() {
        return emailid;
    }

    public void setEmailId(String emailId) {
        this.emailid = emailId;
    }
    
      public Hospital() {
        Hospitalid = count;
        count++;
        this.PastOrderList = new ArrayList<Orders>();
    }
    
      @Override
    public String toString() {
        return Hospitalname;
    }
    public ArrayList<Orders> getPastOrderList() {
        return PastOrderList;
    }
    
     public void AddOrder()
    {
        
    }  
    
    
}
