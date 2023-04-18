/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Drugs;

/**
 *
 * @author Pratik Poojari
 */
public class Drugs {
    
    private String Diseasename;
    private String Drugname;
    private String Drugcompostion;
    private String id;
    

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getDiseasename() {
        return Diseasename;
    }

    public void setDiseasename(String Diseasename) {
        this.Diseasename = Diseasename;
    }

    public String getDrugname() {
        return Drugname;
    }

    public void setDrugname(String Drugname) {
        this.Drugname = Drugname;
    }

    public String getDrugcompostion() {
        return Drugcompostion;
    }

    public void setDrugcompostion(String Drugcompostion) {
        this.Drugcompostion = Drugcompostion;
    }
    
    



    @Override
    public String toString() {
        return Drugname;
    }

   
}
