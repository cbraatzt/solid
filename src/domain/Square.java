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
    private double sideLengt;

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getSideLengt() {
        return sideLengt;
    }

    public void setSideLengt(double sideLengt) {
        this.sideLengt = sideLengt;
    }
    
    public double area() {
        return sideLengt * sideLengt;
    }
    
    public double perimeter() {
        return sideLengt * 4;
    }  
}
