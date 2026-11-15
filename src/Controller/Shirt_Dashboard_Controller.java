/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Shirt;

import java.util.ArrayList;


/**
 *
 * @author Pathum Sandaruwan
 */
public class Shirt_Dashboard_Controller {
    
    public ArrayList<Shirt> search(Double[] CustomerSize){ // size = [shoulder, length,sleeveLength,tolerance]
        ArrayList<Shirt> SuitableShirt = new ArrayList<>();
        for (Shirt shirt : FileReadContoller.readShirtDetails()) {
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
