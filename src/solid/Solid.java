/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import domain.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 5));
        rectangles.add(new Rectangle(4, 6));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(8, 9));

        double sumOfAreas = Rectangle.sumAreas(rectangles);
        double sumOfOPerimeters = Rectangle.sumPerimeters(rectangles);

        System.out.println("�rea total: " + sumOfAreas + " -- Per�metro total: " + sumOfOPerimeters);
    }

}
