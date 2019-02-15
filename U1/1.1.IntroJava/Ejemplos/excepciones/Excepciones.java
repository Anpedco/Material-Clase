
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Excepciones {
	


	public static void main( String [] args ) {

		

		String numeroStr = "3.245-456";

		double x=0;
		boolean valido = true;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		do {
			valido = true;
			System.out.print("Introduce un número: ");

			try {
				numeroStr = br.readLine();
				x = Double.parseDouble( numeroStr );

			} catch ( Exception e ) {
				System.out.println( "Formato de número erroneo.");
				valido = false;
			}
		} while (!valido);

		System.out.println("x="+x);




	}


}