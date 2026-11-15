/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Trouser;
import java.util.ArrayList;

/**
 *
 * @author nisal
 */
public class Trouser_Dashboard_Controller {
    
    public ArrayList<Trouser> search(Double[] CustomerSize){ // size = [shoulder, length,sleeveLength,tolerance]
        ArrayList<Trouser> SuitableTrouser = new ArrayList<>();
        for (Trouser trouser : FileReadContoller.readTrouserDetails()) {
            if(trouser.fit(CustomerSize)){
                SuitableTrouser.add(trouser);
            }
        }
        if(SuitableTrouser.size()!=0){
            return SuitableTrouser;
        }else{
            return null;
        }
    }
}
