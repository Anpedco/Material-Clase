
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Excepciones_5 {
	

	static class ExcepcionPorComa extends Exception {
		String mensaje;
		ExcepcionPorComa(String s) {
			super(s);
			mensaje = s;
		}
		ExcepcionPorComa(){
			super();
			mensaje="Motivo desconocido";
		}
		public String toString() {
			return mensaje;
		}


	}


	public static void main( String [] args ) throws Exception{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		System.out.print("Introduce un número: ");
		
		try {
			String numeroStr = br.readLine();
			if ( numeroStr.indexOf(",")>=0 ) throw new ExcepcionPorComa(numeroStr+" lleva coma!!!");
			double x = Double.parseDouble( numeroStr );
			System.out.println(" x = " + x );
		} catch (ExcepcionPorComa e ) {
			System.out.println("Excepcion por coma. Excepcion: " + e );
		}

	}


}