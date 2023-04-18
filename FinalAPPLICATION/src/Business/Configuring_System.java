/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;



/**
 *
 * @author PratikPoojari
 */
public class Configuring_System {
    public static Ecosystem_Area configure(){
        
        Ecosystem_Area system = Ecosystem_Area.getInstance();
        
        //Create a network,enterprise,user account and to initialize some organizations
       
        
        
        Employee employee = system.getEmployeedirectory().createEmployee("RRH", "SomeAddress", "SomePhone");
               

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        return system;
    }
}
