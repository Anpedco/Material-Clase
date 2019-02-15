package espacioVectorial;

public interface GeometriaEuclidea extends Comparable<GeometriaEuclidea> {
	
	double sumaDeCuadrados();

	default double norma() {
		return Math.sqrt( sumaDeCuadrados() );
	}

	/* Añadido por la extensión de la clase Comparable */
	default int compareTo( GeometriaEuclidea c ) {
		if ( norma() > c.norma() ) return 1;
		else if ( norma() < c.norma() ) return -1;
		else return 0;
	}

}