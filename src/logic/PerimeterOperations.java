/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.EquilateralTriangle;
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
    
    /*
    public double sumPerimeters(ArrayList<Rectangle> rectangles) {
        double perimeter = 0;
        for(Rectangle rectangle : rectangles) {
            perimeter += 2 * rectangle.getHeight() + 2 * rectangle.getWidth();
        }
        return perimeter;
    }
    */
    
    public double sumPerimeters(ArrayList<Object> shapes) {
        double perimeter = 0;
        for(Object shape : shapes) {
            if (shape instanceof Rectangle) {
                perimeter += 2 * ((Rectangle) shape).getHeight() + 2 * ((Rectangle) shape).getWidth();
            } else if (shape instanceof EquilateralTriangle) {
                perimeter += 2 * ((EquilateralTriangle) shape).getSidelength() * 3;
            }
        }
        return perimeter;
    }
    
}
