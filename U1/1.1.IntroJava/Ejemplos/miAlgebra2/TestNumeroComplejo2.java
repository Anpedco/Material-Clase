package miAlgebra2;

class TestNumeroComplejo2 {
	
	public static void main (String[] args) {
		NumeroComplejo2 c;
		c = new NumeroComplejo2( 4.7, -11.25 );
		System.out.println("c: " + c);		

		NumeroComplejo2 d = new NumeroComplejo2( c );
		System.out.println( "d = " + d );
	} // main

} // TestNumeroComplejo2