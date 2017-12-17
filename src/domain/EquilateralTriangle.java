package domain;

import domain.IGeometricShape;
/**
 *
 * @author cbraatz
 */
public class EquilateralTriangle implements IGeometricShape {    
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
    
    /* -------------------------------------------------------------------------
    FIXME: SOLID: O - open closed principle
    Se implementan los métodos de la interface de acuerdo a la figura.
    ------------------------------------------------------------------------- */
    public double area() {
        return Math.sqrt(3) * Math.pow(sidelength, 2) / 4;
    }
    
    public double perimeter() {
        return sidelength * 3;
    }
}
