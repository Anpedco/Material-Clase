package espacioVectorial;

public interface GeometriaEuclidea {
	
	double sumaDeCuadrados();

	default double norma() {
		return Math.sqrt( sumaDeCuadrados() );
	}
}