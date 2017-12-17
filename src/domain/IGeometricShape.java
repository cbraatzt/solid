package domain;

/**
 *
 * @author cbraatz
 */

/* -----------------------------------------------------------------------------
FIXME: SOLID: O - open closed principle - 1
Se crea nueva interface para indicar que las figuras comparten propiedades y 
m�todos, en este caso el �rea y el per�metro.
----------------------------------------------------------------------------- */
public interface IGeometricShape {
    
    public double area();
    public double perimeter();
    
    
}
