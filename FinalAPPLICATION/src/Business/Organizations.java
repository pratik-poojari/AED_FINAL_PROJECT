/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.SupplierEmp.SupplierEmpDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author PratikPoojari
 */
public abstract class Organizations {
   private String name1;
    private WorkQueue work;
    private EmployeeDirectory Employeedirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationid;
    private static int count=0;
    
    public enum Type{
        PharmacyAdmin("Pharmacy Admin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SupplierAdmin("SupplierAdmin"),
        SupplierDeliveryMan("SupplierDeliveryMan"),
        SysAdmin("System Admin"),
        Hospital("Hospital");   
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organizations(String name) {
        this.name1 = name;
        work = new WorkQueue();
        Employeedirectory = new EmployeeDirectory();
       
        userAccountDirectory = new UserAccountDirectory();
        organizationid = count;
        ++count;
    }
    public Organizations(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return Employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory Employeedirectory) {
        this.Employeedirectory = Employeedirectory;
    }

    public int getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(int organizationid) {
        this.organizationid = organizationid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organizations.count = count;
    }

    public WorkQueue getWork() {
        return work;
    }

    public void setWork(WorkQueue work) {
        this.work = work;
    }

    

    @Override
    public String toString() {
        return name1;
    }
}
