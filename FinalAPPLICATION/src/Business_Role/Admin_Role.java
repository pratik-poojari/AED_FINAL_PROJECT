/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Role;

import javax.swing.JPanel;
import userinterface.PharmacyAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Pratik Poojari 
 */
public class Admin_Role extends Roles{
    private RoleType roletype;
    public Admin_Role() {
        super();
        RoleType roleType = RoleType.PharmacyAdmin;
    }

    public RoleType getRoleType() {
        return roletype;
    }
    
    
}
