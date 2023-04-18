/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Medicine;
import java.util.ArrayList;

/**
 *
 * @author Pratik Poojari
 */
public class Medicine {
    private ArrayList<MedicineItem> medicineCatalogList;
    
    public Medicine() {
        medicineCatalogList = new ArrayList();
    }

    public ArrayList<MedicineItem> getMedicineItemList() {
        return medicineCatalogList;
    }
    
    public boolean checkIfMedicineItemIsUnique(String name){
        for (MedicineItem mi : medicineCatalogList){
            if (mi.getName() == name)
                return false;
        }
        return true;
    }
    
    public MedicineItem createNewFoodItem(String name, int price)
    {
        MedicineItem mi = new MedicineItem(name, price);
        medicineCatalogList.add(mi);
        return mi;
    }
    
    public void deleteMedicineItem(MedicineItem mi)
    {
        medicineCatalogList.remove(mi);
    }   
}
