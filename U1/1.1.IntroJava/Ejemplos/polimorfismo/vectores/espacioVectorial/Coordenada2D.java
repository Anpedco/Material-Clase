package espacioVectorial;

public class Coordenada2D implements GeometriaEuclidea {

	private double x;
	private double y;

	public Coordenada2D (double x, double y) {
		this( x ); /* equivalente a this.x = x; */
		this.y = y;
	}

	public Coordenada2D (double x) {
		this.x = x;
		this.y = 0.;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/* Implementación de la interfaz GeometriaEuclidea */
	public double sumaDeCuadrados() {
		return x*x + y*y;
	}

	@Override
	public String toString () {
		return "(" + x + ", " + y + ")";
	}
}