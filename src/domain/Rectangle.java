package domain;

import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */
public class Rectangle {
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
    Se viola el principio al declarar los m�todos sumAreas y sumPerimeters en 
    la misma clase que Rectangle ya que la sumatoria hace parte de la l�gica de
    la aplicaci�n y no de la l�gica de un rect�ngulo.
   
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
}
