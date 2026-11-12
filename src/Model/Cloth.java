/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pathum Sandaruwan
 */
public abstract class Cloth {
    //protected static final double TOLERANCE = 1.0;   // allowed difference in inches

    private String brand, size, section;
    private int floor,id,designId;
    

    public Cloth(int id,int designId,String brand, String size, int floor, String section) {
        this.id = id;
        this.designId = designId;
        this.brand = brand;
        this.size = size;
        this.floor = floor;
        this.section = section;
    }

    //public abstract boolean fits(double[] measurements);
    public abstract String getCategory();

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the name
     */
    

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return the designId
     */
    public int getDesignId() {
        return designId;
    }

    /**
     * @param designId the designId to set
     */
    public void setDesignId(int designId) {
        this.designId = designId;
    }
    
    

    
}
