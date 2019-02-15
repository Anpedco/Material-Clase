/* Sin modificación */

package espacioVectorial;

// Se exige que T extienda Number para que tenga implementado .doubleValue() 

public class Coordenada2D<T extends Numero> implements GeometriaEuclidea {

	private T x;
	private T y;

	public Coordenada2D (T x, T y) {
		this( x ); /* equivalente a this.x = x; */
		this.y = y;
	}

	public Coordenada2D (T x) {
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public T getY() {
		return y;
	}

	/* Implementación de la interfaz GeometriaEuclidea */
	public double sumaDeCuadrados() {
		// uso de doubleValue() al extender T la clase Number (véase javadoc)
		return x.doubleValue()*x.doubleValue() + y.doubleValue()*y.doubleValue();
	}


	@Override
	public String toString () {
		return "(" + x + ", " + y + ")";
	}
}