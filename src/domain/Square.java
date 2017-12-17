package domain;

import domain.Rectangle;
/**
 *
 * @author cbraatz
 */
public class Square extends Rectangle {
    private double _height;
    private double _width;

    public Square(double width, double heigt) {
        super(width, heigt);
    }
    
    @Override
    public double getHeight() {
        return _height;
    }
    
    @Override
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getWidth() {
        return _height;
    }

    @Override
    public void setWidth(double width) {
        this.width = _width;
    }
    
    @Override
    public double area() {
        return getHeight() * getWidth();
    }
    
}
