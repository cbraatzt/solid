package domain;

import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */
public class Rectangle implements IGeometricShape {
    public double sides = 4;
    public double height;
    public double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getSides() {
        return sides;
    }
    
    public Rectangle(double width, double heigt) {
        this.width = width;
        this.height = heigt;
    }
    
    /* -------------------------------------------------------------------------
    FIXME: SOLID: S - single responsibility principle
    Se viola el principio al declarar los métodos sumAreas y sumPerimeters en 
    la misma clase que Rectangle ya que la sumatoria hace parte de la lógica de
    la aplicación y no de la lógica de un rectángulo.
   
    public static double sumAreas(ArrayList<Rectangle> rectangles) {
        double area = 0;
        for(Rectangle rectangle : rectangles) {
            area += rectangle.getHeight() * rectangle.getWidth();
        }
        return area;
    }
    
    public static double sumPerimeters(ArrayList<Rectangle> rectangles) {
        double perimeter = 0;
        for(Rectangle rectangle : rectangles) {
            perimeter += 2 * rectangle.getHeight() + 2 * rectangle.getWidth();
        }
        return perimeter;
    }
    ------------------------------------------------------------------------- */

/* -------------------------------------------------------------------------
    FIXME: SOLID: O - open closed principle
    Se implementan los métodos de la interface de acuerdo a la figura.
    ------------------------------------------------------------------------- */
    public double area() {
        return height * width;
    }
    
    public double perimeter() {
        return height * 2 + width * 2;
    }
}
