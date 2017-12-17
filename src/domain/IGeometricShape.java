package domain;

/**
 *
 * @author cbraatz
 */

/* -----------------------------------------------------------------------------
FIXME: SOLID: O - open closed principle - 1
Se crea nueva interface para indicar que las figuras comparten propiedades y 
métodos, en este caso el área y el perímetro.
----------------------------------------------------------------------------- */
public interface IGeometricShape {
    
    public double area();
    public double perimeter();
    
    
}
