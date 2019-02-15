/* Sin modificación */

package espacioVectorial;

public class Coordenada3D<T extends Numero> extends Coordenada2D<T> {

	private T z;

	public Coordenada3D( T x, T y, T z ) {
		super( x, y); // si no se pusiera: llamada implícita a super()
		this.z = z;
	}

	public T getZ() {
		return z;
	}

	/* Actualiza sumadeCudarados de Coordenada2D. De esa forma, podemos reutilizar
		norma() del padre sin ninguna modificación adicional 
	*/

	public double sumaDeCuadrados() {
		return super.sumaDeCuadrados() + z.doubleValue()*z.doubleValue();
	}

	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}

}