package logic;

import domain.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */

/* -----------------------------------------------------------------------------
    FIXME: SOLID: S - single responsibility principle
    se crea nueva clase de responsabilidad única para operaciones de área
----------------------------------------------------------------------------- */
public class AreaOperations {
    
    public double sumAreas(ArrayList<Rectangle> rectangles) {
        double area = 0;
        for(Rectangle rectangle : rectangles) {
            area += rectangle.getHeight() * rectangle.getWidth();
        }
        return area;
    }
    
}
