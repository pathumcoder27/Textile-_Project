/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nisal
 */
public abstract class Cloth {
    private String brand, name, size, section;
    private int floor;

    public Cloth(String brand, String name, String size, int floor, String section) {
        this.brand = brand;
        this.name = name;
        this.size = size;
        this.floor = floor;
        this.section = section;
    }

    //public abstract boolean fits(double[] measurements);
    public abstract String getCategory();

    public String getBrand() { return brand; }
    public String getName() { return name; }
    public String getSize() { return size; }
    public int getFloor() { return floor; }
    public String getSection() { return section; }
}
