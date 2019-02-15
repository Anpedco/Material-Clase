class Sobrecarga {

	// Método printArray sobrecargado: esto NO es genericidad

	public static void printArray( int [ ] vector_int ) {
		for ( int i = 0; i < vector_int.length; i++ ) {
			System.out.println( "vector_int[" + i + "]=" + vector_int[i] );
		}
	}

	public static void printArray( double [ ] vector_double ) {
		for ( int i = 0; i < vector_double.length; i++ ) {
			System.out.println( "vector_double[" + i + "]=" + vector_double[i] );
		}
	}

	public static void main( String [ ] args ) {
		int [ ] intArray = { 1, 2, 3 };
		double[ ] doubleArray = { 1.1, 2.2, 3.3, 4.4 } ;
		printArray( intArray );
		printArray( doubleArray );
	} // main

} // class