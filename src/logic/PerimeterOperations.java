/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author cbraatz
 */

/* -----------------------------------------------------------------------------
    FIXME: SOLID: S - single responsibility principle
    se crea nueva clase de responsabilidad única para operaciones de perímetro
----------------------------------------------------------------------------- */
public class PerimeterOperations {
    
        public double sumPerimeters(ArrayList<Rectangle> rectangles) {
        double perimeter = 0;
        for(Rectangle rectangle : rectangles) {
            perimeter += 2 * rectangle.getHeight() + 2 * rectangle.getWidth();
        }
        return perimeter;
    }
    
}
