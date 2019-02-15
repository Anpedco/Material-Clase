package test;

import espacioVectorial.*; 



/**
 * <h1> Test para coordenadas en 2 dimensiones </h1>
 * En este test se lleva a cabo la verificación de que 
 * se pueden generar y escribir coordenadas en 2D
 *
 * @author Paco Martínez
 * @version 1.0
 * @since febrero 2019
 *
 * @see test.Test3D
 *
 */
class Test2D {



	/**
      * Pruebas para {@link espacioVectorial.Coordenada2D}.
      *
      * Este método verifica el correcto funcionamiento de la clase
      * {@link espacioVectorial.Coordenada2D}, escribiendo coordenadas
      * en 2D, obteniendo sus componentes y su norma Euclídea.
      */
	public static void main (String[] args) {
		Coordenada2D xy = new Coordenada2D( 3.4, -5.6 ); 
		System.out.println( "Coordenada 2D: " + xy ); 
		System.out.println( "Coordenada x: " + xy.getX() ); 
		System.out.println( "Coordenada y: " + xy.getY() ); 
		System.out.println( "Norma: " + xy.norma() );

	} // main 
	
} // Test2D