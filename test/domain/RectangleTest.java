/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cbraatz
 */
public class RectangleTest {
    
    public RectangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangle instance = new Rectangle(2, 3);
        double expResult = 6.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Rectangle.
     */
    /*@Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setHeight method, of class Rectangle.
     */
    /*@Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Rectangle instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getWidth method, of class Rectangle.
     */
    /*@Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setWidth method, of class Rectangle.
     */
    /*@Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 0.0;
        Rectangle instance = null;
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSides method, of class Rectangle.
     */
    /*@Test
    public void testGetSides() {
        System.out.println("getSides");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.getSides();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of perimeter method, of class Rectangle.
     */
    /*@Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}

