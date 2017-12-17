/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author cbraatz
 */
public class EquilateralTriangle {    
    public double sides = 3;
    public double sidelength;

    public double getSides() {
        return sides;
    }

    public double getSidelength() {
        return sidelength;
    }

    public void setSidelength(double sidelength) {
        this.sidelength = sidelength;
    }
    
    public EquilateralTriangle(double sidelength) {
        this.sidelength = sidelength;
    }
    
}
