
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Excepciones_3 {
	


	public static void main( String [] args ) {

		String numeroStr = null;

		boolean valido;

		double x = 0;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		do {

			valido = true;
			System.out.print("Introduce un número: ");

			try {

				numeroStr = br.readLine();
				x = Double.parseDouble( numeroStr );
				System.out.println(" x = " + x );

			} catch ( NumberFormatException | IOException e ) {

				System.out.println( "Formato de número erroneo o Error de E/S. Excepción: " + e);
				valido = false;

			} finally {

				System.out.println("El string \"" + numeroStr + "\" tenia un formato " + ((valido)? "" : "in") + "correcto");

			}

		} while (!valido);






	}


}