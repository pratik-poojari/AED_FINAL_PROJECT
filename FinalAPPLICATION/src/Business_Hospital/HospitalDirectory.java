/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Hospital;

import java.util.ArrayList;

/**
 *
 * @author Pratik Poojari
 */
public class HospitalDirectory {
    
     private ArrayList<Hospital> Hospitallist;


public HospitalDirectory() {
        Hospitallist = new ArrayList();
    }

public Hospital createHospital(String name, String address, String phone){
        Hospital h = new Hospital();
        h.setHospitalName(name);
        h.setHospitalAddress(address);
        h.setHospitalContactNo(phone);

        Hospitallist.add(h);
        return h;
    }
public ArrayList<Hospital> getHospitalList() {
        return Hospitallist;
    }

public Hospital findHospital(String name)
    {
        for(Hospital h : Hospitallist)
        {
            if(h.getHospitalName() == name)
            {
                return h;
            }
        }
        return null;
    }
 public void deleteHospital(Hospital hospital)
    {
        Hospitallist.remove(hospital);
    }  




    
}
