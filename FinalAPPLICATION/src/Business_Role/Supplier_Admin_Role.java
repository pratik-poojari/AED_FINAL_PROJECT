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
public class Supplier_Admin_Role extends Roles{
    private Roles.RoleType roletype;
    public Supplier_Admin_Role() {
        super();
        Roles.RoleType roletype = Roles.RoleType.SupplierAdmin;
    }

    public Roles.RoleType getRoleType() {
        return roletype;
    }

    
    
}

