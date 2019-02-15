package espacioVectorial;

public class Coordenada3D extends Coordenada2D implements GeometriaEuclidea {

	/* 
		¿Es necesario implementar GeometricaEuclidea si ya lo hace el padre 
	   	y lo hereda?
	*/
	private double z;

	public Coordenada3D( double x, double y, double z ) {
		super( x, y ); // si no se pusiera: llamada implícita a super()
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	/* Actualiza sumadeCudarados de Coordenada2D. De esa forma, podemos reutilizar
		norma() de la implementación por defecto que hay en la interfaz
		GeometriaEuclidea, sin ninguna modificación adicional 
	*/

	public double sumadeCudarados() {
		return super.sumaDeCuadrados() + z*z;
	}

	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}

}