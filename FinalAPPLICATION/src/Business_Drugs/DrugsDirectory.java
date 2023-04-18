/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Drugs;


import java.util.ArrayList;

/**
 *
 * @author Pratik Poojari
 */
public class DrugsDirectory {
    
 private ArrayList<Drugs> drugsList;

    
 public DrugsDirectory() {
        drugsList = new ArrayList();
    }
 
    
    public ArrayList<Drugs> getDrugsList() {
        return drugsList;
    }

    public void setDrugsList(ArrayList<Drugs> drugsList) {
        this.drugsList = drugsList;
    }

    
   
    
    public Drugs createDrugs(String Id, String DrugName, String DrugCompostion, String Disease){
        Drugs drugsobj = new Drugs();
        drugsobj.setId(Id);
        drugsobj.setDrugname(DrugName);
        drugsobj.setDiseasename(Disease);
        drugsobj.setDrugcompostion(DrugCompostion);
        drugsList.add(drugsobj);
        
        return drugsobj;
    }    
    
    public void deleteDrugs(Drugs drugs)
    {
        drugsList.remove(drugs);
    } 
    
    
}
