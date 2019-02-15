
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Excepciones_4 {
	
	public static void main( String [] args ) throws Exception{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		System.out.print("Introduce un número: ");
		
		String numeroStr = br.readLine();
		double x = Double.parseDouble( numeroStr );
		System.out.println(" x = " + x );

	}


}