package test;

import espacioVectorial.*;

class Test3D {
	
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


	// Polimorfismo en la llamada
	static void printNorma(GeometriaEuclidea C) {
		System.out.println("Norma: " + C.norma() );
	}

	public static void main (String[] args) {

		Coordenada2D<Numero> xy = new Coordenada2D<>(  new Numero<Double>(3.4),  new Numero<Double>(-5.6) );
		System.out.println( "Coordenadas xy (2D): " + xy );
		System.out.println( "Coordenada x: " + xy.getX() );
		System.out.println( "Coordenada y: " + xy.getY() );
		System.out.println( "Norma: " + xy.norma() );
		printNorma(xy);

		Coordenada3D<Numero> xyz = new Coordenada3D<>(  new Numero<Double>(3.4),  new Numero<Double>(-5.6),  new Numero<Double>(3.3) );
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
		Coordenada2D<Numero> pqr = (Coordenada2D<Numero>) xyz;
		System.out.println( "Coordenada pqr (2D???) : " + pqr );
		System.out.println( "Coordenada x: " + pqr.getX() );
		System.out.println( "Coordenada y: " + pqr.getY() );
		//Error: System.out.println( "Coordenada z: " + pqr.getZ() );
		System.out.println( "Norma?????: " + pqr.norma() );
		printNorma(pqr);
		
		Coordenada3D<Numero> ijk = (Coordenada3D<Numero>) pqr;
		System.out.println( "Coordenada ijk (3D) : " + ijk );
		System.out.println( "Coordenada x: " + ijk.getX() );
		System.out.println( "Coordenada y: " + ijk.getY() );
		System.out.println( "Coordenada z: " + ijk.getZ() );
		System.out.println( "Norma: " + ijk.norma() );
		printNorma(ijk);



		Coordenada3D<Numero> abc = new Coordenada3D<Numero>( new Numero<Integer>(10),  new Numero<Integer>(20),  new Numero<Integer>(30) );

		System.out.println("maximo(xyz, abc) = " + xyz.maximo(abc));

		System.out.println("maximo(xyz, pqr) = " + xyz.maximo(pqr));

		// Comparación entre Coordenada2D y Coordenada3D: es posible: 
		//   se comparan normas
		System.out.println("maximo(xy, xyz) = " + xy.maximo(xyz));



		Coordenada3D<Numero> rst = new Coordenada3D<>( new Numero<Boolean>(true), new Numero<Boolean>(true), new Numero<Boolean>(false) );
		System.out.println( "Coordenada rst (3D): " + rst );
		System.out.println( "Coordenada x: " + rst.getX() );
		System.out.println( "Coordenada y: " + rst.getY() );
		System.out.println( "Coordenada z: " + rst.getZ() );
		System.out.println( "Norma: " + rst.norma() );
		printNorma(rst);

		System.out.println("maximo(rst, xyz) = " + rst.maximo(xyz));



	} // main
} // Test3D