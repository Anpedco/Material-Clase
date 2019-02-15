package test;

import espacioVectorial.*;

class Test3D {
	
	// Polimorfismo en la llamada
	static void printNorma(GeometriaEuclidea C) {
		System.out.println("Norma: " + C.norma() );
	}

	public static void main (String[] args) {

		Coordenada2D xy = new Coordenada2D( 3.4, -5.6 );
		System.out.println( "Coordenadas xy (2D): " + xy );
		System.out.println( "Coordenada x: " + xy.getX() );
		System.out.println( "Coordenada y: " + xy.getY() );
		System.out.println( "Norma: " + xy.norma() );
		printNorma(xy);

		Coordenada3D xyz = new Coordenada3D( 3.4, -5.6, 3.3 );
		System.out.println( "Coordenada xyz (3D): " + xyz );
		System.out.println( "Coordenada x: " + xyz.getX() );
		System.out.println( "Coordenada y: " + xyz.getY() );
		System.out.println( "Coordenada z: " + xyz.getZ() );
		System.out.println( "Norma: " + xyz.norma() );
		printNorma(xyz);

		/* Acceso a un m´etodo del objeto xyz */
		String xyzStr = xyz.toString();
		/* No se puede acceder explicitamente a un m´etodo de un padre desde
		un objeto hijo (s´ı desde la clase -vease sumaDeCuadrados()-):
		String xyzStr2 = xyz.super.toString(); // Error!!! */

		// Polimorfismo
		Coordenada2D pqr = (Coordenada2D) xyz;
		System.out.println( "Coordenada pqr (2D???) : " + pqr );
		System.out.println( "Coordenada x: " + pqr.getX() );
		System.out.println( "Coordenada y: " + pqr.getY() );
		//Error: System.out.println( "Coordenada z: " + pqr.getZ() );
		System.out.println( "Norma?????: " + pqr.norma() );
		printNorma(pqr);
		
		Coordenada3D ijk = (Coordenada3D) pqr;
		System.out.println( "Coordenada ijk (3D) : " + ijk );
		System.out.println( "Coordenada x: " + ijk.getX() );
		System.out.println( "Coordenada y: " + ijk.getY() );
		System.out.println( "Coordenada z: " + ijk.getZ() );
		System.out.println( "Norma: " + ijk.norma() );
		printNorma(ijk);
		
	} // main
} // Test3D