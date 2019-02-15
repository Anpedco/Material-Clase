
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import ????.NumberformatException ????

class Excepciones_1 {
	
	public static void main( String [] args ) throws Exception {

		String numeroStr;

		boolean valido;

		double x;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		do {

			valido = true;
			System.out.print("Introduce un número: ");

			try {

				numeroStr = br.readLine();

				try {

					x = Double.parseDouble( numeroStr );
					System.out.println(" x = " + x );

				} catch ( NumberFormatException e ) {

					System.out.println( "Formato de número erroneo. Excepción: " + e);
					valido = false;
					throw new Exception();

				} finally {

					System.out.println("El string \"" + numeroStr + "\" tenia un formato " + ((valido)? "" : "in") + "correcto");

				}

			} catch ( IOException e ) {

				System.out.println( "Error en Entrada/Salida. Excepción: " + e );
				valido = false;

			} 

		} while (!valido);

	}

}