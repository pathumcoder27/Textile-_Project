/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pathum Sandaruwan
 */
public class Shirt extends Cloth {
    private double shoulder, length,sleeveLength;

    public Shirt(int id, int designId, String brand, String size, int floor, String section,double shoulder, double length, double sleeveLength) {
        super(id, designId, brand, size, floor, section);
        this.shoulder = shoulder;
        this.length = length;
        this.sleeveLength = sleeveLength;
        
    }


    @Override
    public String getCategory() { return "Shirt"; }

    /**
     * @return the shoulder
     */
    public double getShoulder() {
        return shoulder;
    }

    /**
     * @param shoulder the shoulder to set
     */
    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
}
