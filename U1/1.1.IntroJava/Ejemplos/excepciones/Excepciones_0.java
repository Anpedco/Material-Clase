

class Excepciones_0 {
	

	public static void main( String [] args ) {

		
		String numeroStr = "3.2454aadf56";

		double x=0;

		boolean valido = true;

		try {

			x = Double.parseDouble( numeroStr );
			System.out.println("Numero: " + x );
		
		} catch ( NumberFormatException e ) {
		
			System.out.println( "Formato de número erroneo. Excepción: " + e);
			valido = false;

			// int j = 3/0; // Pruébese... 
		
		} finally {
		
			System.out.println("El string \"" + numeroStr + "\" tenia un formato " + ((valido)? "" : "in") + "correcto");
		
		}

        System.out.println("En cualquier caso, ... si no hay excepciones en catch");


	}


}