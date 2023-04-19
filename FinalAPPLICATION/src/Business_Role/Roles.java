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
public abstract class Roles {
    
    public enum RoleType{
        PharmacyAdmin("Pharmacy Admin"),
        Customer("Customer"),
        DeliveryMan("Delivery "),
        SupplierAdmin("SupplierAdmin"),
        SupplierDeliveryMan("Supplier Delivery Man"),
        SysAdmin("System Administrator"),
        Hospital("Hospital");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}