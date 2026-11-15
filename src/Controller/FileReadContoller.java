/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Shirt;
import Model.TShirt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pathum Sandaruwan
 */
public class FileReadContoller {

    public static ArrayList<Shirt> readShirtDetails() {
        ArrayList<Shirt> shirtDetails = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(new File("Shirt.txt"));
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int designid = Integer.parseInt(data[1]);
                String brand = data[2];
                String size = data[3];
                int floor = Integer.parseInt(data[4]);
                String section = data[5];
                double shoulder = Double.parseDouble(data[6]);
                double length = Double.parseDouble(data[7]);
                double sleevLength = Double.parseDouble(data[8]);
                shirtDetails.add(new Shirt(id, designid, brand, size, floor, section, shoulder, length, sleevLength));
                
            }
        } catch (FileNotFoundException ex) {

        }
        if(shirtDetails.size()!=0){
            return shirtDetails;
        }else{
            return null;
        }

    }
    
    public static ArrayList<TShirt> readTshirtDetails() {
        ArrayList<TShirt> shirtDetails = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(new File("T_Shirt.txt"));
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int designid = Integer.parseInt(data[1]);
                String brand = data[2];
                String size = data[3];
                int floor = Integer.parseInt(data[4]);
                String section = data[5];
                double shoulder = Double.parseDouble(data[6]);
                double length = Double.parseDouble(data[7]);
                double sleevLength = Double.parseDouble(data[8]);
                shirtDetails.add(new TShirt(id, designid, brand, size, floor, section, shoulder, length, sleevLength));
                
            }
        } catch (FileNotFoundException ex) {

        }
        if(shirtDetails.size()!=0){
            return shirtDetails;
        }else{
            return null;
        }

    }
    

}
