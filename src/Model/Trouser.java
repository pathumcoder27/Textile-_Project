/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pathum Sandaruwan
 */
public class Trouser extends Cloth{
    
    private double length,waist;

    public Trouser(int id,int designId, String brand, String size, int floor, String section,double length,double waist) {
        super(id,designId, brand, size, floor, section);
        this.length = length;
        this.waist = waist;
    }
    

    @Override
    public String getCategory() { return "Trouser"; }

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

    /**
     * @return the waist
     */
    public double getWaist() {
        return waist;
    }

    /**
     * @param waist the waist to set
     */
    public void setWaist(double waist) {
        this.waist = waist;
    }

   
    
}
