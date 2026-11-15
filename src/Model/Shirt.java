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
    
    @Override
    public boolean fit(Double[] size){ // size = [shoulder, length,sleeveLength,tolerance]
        if(size[0]<=this.getShoulder() && this.getShoulder()<=size[0]+size[3]){
            if(size[1]<=this.getLength()&& this.getLength()<=size[1]+size[3]){
                if(size[2]<=this.getSleeveLength() && this.getSleeveLength()<=size[2]+size[3]){
                    return true;
                }
            }
        }
        return false;
    }

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

    /**
     * @return the sleeveLength
     */
    public double getSleeveLength() {
        return sleeveLength;
    }

    /**
     * @param sleeveLength the sleeveLength to set
     */
    public void setSleeveLength(double sleeveLength) {
        this.sleeveLength = sleeveLength;
    }
}
