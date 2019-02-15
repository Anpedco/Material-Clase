class Ej_5_2 {
	

    // Aquí nombres es equivalente un array de Strings
	public static void metodo( String ... nombres ) {

		System.out.println( "Hay un total de " + nombres.length + " nombres" );
	
		for( String valor : nombres ) {
			System.out.println("nombre: " + valor);
		}

		// Alternativa convencional recorrido array
		for ( int i = 0; i < nombres.length; i++ ) {
			System.out.println( "-nombre: " + nombres[i] );	
		}
	}



	public static void main (String[] args) {
		
		metodo( "a", "b", "c" );

		String [] x = {"d", "e", "f", "g"};
		metodo(x);

		metodo(new String[] {"h", "i"}); // argumento anónimo

	} // main

}  // Ej_5_2