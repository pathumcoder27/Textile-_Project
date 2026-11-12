/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nisal
 */
public class Shirt extends Cloth {
    private double shoulder, length;

    public Shirt(String brand, String name, String size, int floor, String section,
                 double shoulder, double length) {
        super(brand, name, size, floor, section);
        this.shoulder = shoulder;
        this.length = length;
    }

//    @Override
//    public boolean fits(double[] m) {   // m[0] = shoulder, m[1] = length
//        return Math.abs(shoulder - m[0]) <= TOLERANCE
//            && Math.abs(length - m[1]) <= TOLERANCE;
//    }

    @Override
    public String getCategory() { return "Shirt"; }
}
