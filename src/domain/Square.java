package domain;

import domain.Rectangle;
/**
 *
 * @author cbraatz
 */

    /* -------------------------------------------------------------------------
    FIXME: SOLID: L - liskov substitution principle
    Se implementa la interface IGeometricShape en lugar de heredar de la clase
    Rectangle
    ------------------------------------------------------------------------- */
public class Square implements IGeometricShape {
    private double sides = 4;
    private double sidelength;

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getSideLengt() {
        return sidelength;
    }

    public void setSideLengt(double sidelength) {
        this.sidelength = sidelength;
    }
    
    public double area() {
        return sidelength * sidelength;
    }
    
    public double perimeter() {
        return sidelength * 4;
    }  
    
    public Square(double sidelength) {
        this.sidelength = sidelength;
    }
}
