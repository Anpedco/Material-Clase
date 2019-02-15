package espacioVectorial;

public interface GeometriaEuclidea extends Comparable<GeometriaEuclidea> {
	
	double sumaDeCuadrados();

	default double norma() {
		return Math.sqrt( sumaDeCuadrados() );
	}

	/* Añadido por el compromiso de la extensión de la clase Comparable<GeometriaEuclidea> */
	default int compareTo( GeometriaEuclidea c ) {
		if ( norma() > c.norma() ) return 1;
		else if ( norma() < c.norma() ) return -1;
		else return 0;
	}

	/* Obtención del máximo a partir de compareTo */
	public default GeometriaEuclidea maximo(GeometriaEuclidea c) {
		GeometriaEuclidea max = this;
		if (c.compareTo(max) > 0 ) {
			max = c;
		}
		return max;
	}

}