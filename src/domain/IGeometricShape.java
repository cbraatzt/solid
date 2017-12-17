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

    /* -------------------------------------------------------------------------
    Se incurre en la violaci�n del principio de interface segregation principle
    al dar m�s informaci�n de la necesaria de la interface.
    ------------------------------------------------------------------------- */
    public double area();
    public double perimeter();
    
    
}
