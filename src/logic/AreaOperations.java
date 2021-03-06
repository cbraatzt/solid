package logic;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import domain.EquilateralTriangle;
import domain.IGeometricShape;
import domain.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */

/* -----------------------------------------------------------------------------
    FIXME: SOLID: S - single responsibility principle
    se crea nueva clase de responsabilidad �nica para operaciones de �rea
----------------------------------------------------------------------------- */
public class AreaOperations {

    /*    
    public double sumAreas(ArrayList<Rectangle> rectangles) {
        double area = 0;
        for(Rectangle rectangle : rectangles) {
            area += rectangle.getHeight() * rectangle.getWidth();
        }
        return area;
    }
     */
    
   /* -------------------------------------------------------------------------
    FIXME: SOLID: O - open closed principle
    Se actualiza el m�todo pra sumar las �reas de forma que se reciban objetos
    de tipo de la interface IGeometricShape.
    ------------------------------------------------------------------------- */
    
    /*
    public double sumAreas(ArrayList<Object> shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                area += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            } else if (shape instanceof EquilateralTriangle) {
                area += Math.sqrt(3) * Math.pow(((EquilateralTriangle) shape).getSidelength(), 2) / 4;
            }
        }
        return area;
    }
*/
    
    public double sumAreas(ArrayList<IGeometricShape> shapes) {
        double area = 0;
        for(IGeometricShape shape : shapes) {
            area += shape.area();
        }
        return area;
    }    

}
