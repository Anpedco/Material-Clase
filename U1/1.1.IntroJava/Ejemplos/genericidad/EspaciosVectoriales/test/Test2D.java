package test;

import espacioVectorial.*; 

class Test2D {


	public static <T extends Comparable<T>> T maximo(T x, T y) {
		T max = x; // máximo provisional
		
		if ( y.compareTo(max) > 0 ) {
			max = y; // y seria ahora el m´aximo provional
		}

		return max; // returna el m´aximo definitivamente
	} // maximo

	public static void main (String[] args) {
		Coordenada2D xy = new Coordenada2D( 3.4, -5.6 ); 
		System.out.println( "Coordenada 2D xy: " + xy ); 
		System.out.println( "Coordenada x: " + xy.getX() ); 
		System.out.println( "Coordenada y: " + xy.getY() ); 
		System.out.println( "Norma: " + xy.norma() );


		Coordenada2D pq = new Coordenada2D( 10.3, -25.4 ); 
		System.out.println( "Coordenada 2D pq: " + pq ); 
		System.out.println( "Coordenada x: " + pq.getX() ); 
		System.out.println( "Coordenada y: " + pq.getY() ); 
		System.out.println( "Norma: " + pq.norma() );

		System.out.println("max(xy, pq) = " + maximo(xy, pq));

	} // main 
	
} // Test2D