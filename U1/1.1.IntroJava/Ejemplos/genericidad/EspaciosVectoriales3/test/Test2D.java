package test;

import espacioVectorial.*; 

class Test2D {

/*

	Usaremos maximo definido en GeometriaEuclidea

	public static <T extends Comparable<T>> T maximo(T x, T y) {
		T max = x; // máximo provisional
		
		if ( y.compareTo(max) > 0 ) {
			max = y; // y seria ahora el m´aximo provional
		}

		return max; // returna el m´aximo definitivamente
	} // maximo
*/
	public static void main (String[] args) {
		Coordenada2D<Numero> xy = new Coordenada2D<Numero>( new Numero<Double>(3.4), new Numero<Double>(-5.6) ); 
		System.out.println( "Coordenada 2D xy: " + xy ); 
		System.out.println( "Coordenada x: " + xy.getX() ); 
		System.out.println( "Coordenada y: " + xy.getY() ); 
		System.out.println( "Norma: " + xy.norma() );


		// No es necesario especificar clase en new clase<>
		Coordenada2D<Numero> pq = new Coordenada2D<>( new Numero<Integer>(10), new Numero<Integer>(-25) ); 
		System.out.println( "Coordenada 2D pq: " + pq ); 
		System.out.println( "Coordenada x: " + pq.getX() ); 
		System.out.println( "Coordenada y: " + pq.getY() ); 
		System.out.println( "Norma: " + pq.norma() );

		System.out.println("max(xy, pq) = " + xy.maximo(pq));


		// No es necesario especificar clase en new clase<>	
		Coordenada2D<Numero> st = new Coordenada2D<>( new Numero<Boolean>(false), new Numero<Boolean>(true) ); 
		System.out.println( "Coordenada 2D pq: " + st ); 
		System.out.println( "Coordenada x: " + st.getX() ); 
		System.out.println( "Coordenada y: " + st.getY() ); 
		System.out.println( "Norma: " + st.norma() );

		System.out.println("max(st, pq) = " + st.maximo(pq));

	} // main 
	
} // Test2D