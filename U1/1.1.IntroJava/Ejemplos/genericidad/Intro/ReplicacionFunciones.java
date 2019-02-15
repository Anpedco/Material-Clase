/* Situación de partida: esto no es genericidad */
class ReplicacionFunciones {

	public static void printArray_int( int [ ] vector_int ) {
		for ( int i = 0; i < vector_int.length; i++ ) {
			System.out.println( "vector_int[" + i + "]=" + vector_int[i] );
		}
	}

	public static void printArray_double( double [ ] vector_double ) {
		for ( int i = 0; i < vector_double.length; i++ ) {
			System.out.println( "vector_double[" + i + "]=" + vector_double[i] );
		}
	}

	public static void main( String [ ] args ) {
		int [ ] intArray = { 1, 2, 3 };
		double[ ] doubleArray = { 1.1, 2.2, 3.3, 4.4 } ;
		printArray_int( intArray );
		printArray_double( doubleArray );
	}
}