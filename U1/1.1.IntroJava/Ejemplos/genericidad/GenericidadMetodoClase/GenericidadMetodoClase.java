public class GenericidadMetodoClase {

	// Maximo de tres objetos "comparables"
	public static <T extends Comparable<T>> T maximo(T x, T y, T z) {

		T max = x; // m´aximo provisional
		
		if ( y.compareTo(max) > 0 ) {
			max = y; // y seria ahora el m´aximo provional
		}

		if ( z.compareTo(max) > 0) {
			max = z; // z ser´ıa el m´aximno
		}

		return max; // returna el m´aximo definitivamente
	}

	public static void main(String args[]) {

		System.out.printf("Máximo de %d, %d y %d es: %d\n\n",
			3, 4, 5, maximo( 3, 4, 5 ));
		System.out.printf("Máximo de %.1f, %.1f y %.1f es: %.1f\n\n",
			6.6, 8.8, 7.7, maximo( 6.6, 8.8, 7.7 ));
		System.out.printf("Máximo de %s, %s y %s es %s\n","hola",
			"adios", "hasta luego", maximo("hola", "adios", "hasta luego"));
		
	} // main

} // class