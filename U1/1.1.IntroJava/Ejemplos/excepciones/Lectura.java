/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/

class Lectura {

	public static void main( String [] args ) {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		String linea;
			
		try {

			System.out.print("Escribe una línea (fin con <CR>): ");
			linea = br.readLine();
			System.out.println("Línea leída: " + linea );

		} catch ( IOException e ) {

			System.out.println( "Error en lectura. Excepción: " +  e);
			
		}

	} //main

} // Excepciones 