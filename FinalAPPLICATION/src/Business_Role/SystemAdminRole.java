/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Role;


import javax.swing.JPanel;


/**
 *
 * @author Pratik Poojari
 */
public class SystemAdminRole extends Roles{
    private Roles.RoleType roletype;
    public SystemAdminRole() {
        Roles.RoleType roletype = Roles.RoleType.SysAdmin;
    }

}

