
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Excepciones_2 {
	

	static double leerNumero() throws NumberFormatException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		System.out.print("Introduce un número: ");

		try {

			String numeroStr = br.readLine();
			double x = Double.parseDouble( numeroStr );
			return x;

		} catch ( IOException e ) {

			System.out.println( "Error en Entrada/Salida. Excepción: " + e );

		} finally {
			System.out.println("Todo OK, o algún tipo de Excepción (E/S o formato de doubles)...");			
		}

		System.out.println("No deberia estar aquí");
		// nunca debe ocurrir esto
		return 0;

	}


	public static void main( String [] args ) {

		double z = 0;
		boolean valido;
		do {

			try {

				z = leerNumero();
				valido = true;

			} catch ( NumberFormatException e ) {

				System.out.println( "Formato de número erroneo. Excepción: " + e);
				valido = false;

			} 
		} while (!valido);	

		System.out.println(" z = " + z );

	}


}