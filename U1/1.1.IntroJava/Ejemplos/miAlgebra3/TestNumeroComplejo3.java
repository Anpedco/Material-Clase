package miAlgebra3;

class TestNumeroComplejo3 {
	
	public static void main (String[] args) {
		NumeroComplejo3 c;
		c = new NumeroComplejo3( 4.7, -11.25 );
		System.out.println("c: " + c);		

		NumeroComplejo3 d = new NumeroComplejo3( c );
		System.out.println( "d = " + d );

		System.out.println("Descripción: " + NumeroComplejo3.descripcion());

		System.out.println("CERO: " + NumeroComplejo3.CERO );

		NumeroComplejo3.Polar x = new NumeroComplejo3.Polar(d);
		System.out.println("x: " + x );

	} // main

} // TestNumeroComplejo3