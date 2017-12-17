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

    /* -------------------------------------------------------------------------
    Se incurre en la violación del principio de interface segregation principle
    al dar más información de la necesaria de la interface.
    ------------------------------------------------------------------------- */
    public double area();
    public double perimeter();
    
    
}
