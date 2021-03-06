package solid;

import domain.EquilateralTriangle;
import domain.IGeometricShape;
import domain.Rectangle;
import domain.Square;
import java.util.ArrayList;
import logic.AreaOperations;
import logic.PerimeterOperations;

/**
 *
 * @author cbraatz
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 5));
        rectangles.add(new Rectangle(4, 6));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(8, 9));
        */
        
        ArrayList<IGeometricShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Rectangle(5, 1));
        shapes.add(new Rectangle(8, 9));
        shapes.add(new EquilateralTriangle(6));
        shapes.add(new Square(3));

    /* -------------------------------------------------------------------------
    FIXME: SOLID: S - single responsibility principle
        double sumOfAreas = Rectangle.sumAreas(rectangles);
        double sumOfOPerimeters = Rectangle.sumPerimeters(rectangles);
    ------------------------------------------------------------------------- */
    
    AreaOperations areaOperations = new AreaOperations();
    PerimeterOperations perimeterOperations = new PerimeterOperations();
    /*
    double sumOfAreas = areaOperations.sumAreas(rectangles);
    double sumOfOPerimeters = perimeterOperations.sumPerimeters(rectangles);
    */
    double sumOfAreas = areaOperations.sumAreas(shapes);
    double sumOfOPerimeters = perimeterOperations.sumPerimeters(shapes);
    
        System.out.println("�rea total: " + sumOfAreas + " -- Per�metro total: " + sumOfOPerimeters);
    }

}
