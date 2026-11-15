/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TShirt;
import java.util.ArrayList;

/**
 *
 * @author Pathum Sandaruwan
 */
public class TShirt_Dashboard_Controller {
    
    public ArrayList<TShirt> search(Double[] CustomerSize){ // size = [shoulder, length,sleeveLength,tolerance]
        ArrayList<TShirt> SuitableShirt = new ArrayList<>();
        for (TShirt shirt : FileReadContoller.readTshirtDetails()) {
            if(shirt.fit(CustomerSize)){
                SuitableShirt.add(shirt);
            }
        }
        if(SuitableShirt.size()!=0){
            return SuitableShirt;
        }else{
            return null;
        }
    }
}
