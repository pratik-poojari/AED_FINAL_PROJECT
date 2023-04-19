/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Role;

import Business.Ecosystem_Area;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HospitalRole.HospitalAreaJPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;


/**
 *
 * @author Pratik Poojari
 */
public class Hospital_Admin_Role extends Roles{
    
     private Roles.RoleType roletype;
    public Hospital_Admin_Role() {
        Roles.RoleType roletype = Roles.RoleType.Hospital;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem_Area business) {
        return new HospitalAreaJPanel(userProcessContainer, account, business);
    }
    
}
