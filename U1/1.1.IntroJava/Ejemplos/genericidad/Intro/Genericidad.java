class Genericidad {

	/* Tipo/clase genérico T */
	public static <T> void printArray( T [ ] vector ) {
		for ( int i = 0; i < vector.length; i++ ) {
			System.out.println( "vector[" + i + "]=" + vector[i] );
		}
	}

	public static void main( String [ ] args ) {

		Integer [ ] intArray = { 1, 2, 3 };
		Double[ ] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		printArray( intArray );
		printArray( doubleArray );

	} // main

} // class