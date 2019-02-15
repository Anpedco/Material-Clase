class Ej_5_1 {
	

	static double maximo( double a, double b ) {
		return ( ( a>=b )? a : b );
	}

	
	static double maximo( double a, double b, double c ) {
		return maximo( maximo(a,b), c );
	}


	static String maximo( String dia1, String dia2 ) {
		final String [ ] semana = { "lunes", "martes","miercoles","jueves","viernes", "sabado", "domingo" };
		int dia1_idx = 0;
		int dia2_idx = 0;

		for (int i = 0; i < 7; i++ ) {
			if (dia1.equalsIgnoreCase(semana[i])) {
				dia1_idx = i;
				break;
			}
		}

		for (int i = 0; i < 7; i++ ) {
			if (dia2.equalsIgnoreCase(semana[i])) {
				dia2_idx = i;
				break;
			}
		}

		return semana[ (int)maximo(dia1_idx, dia2_idx) ];
	}


	public static void main (String[] args) {
		System.out.println( "maximo( 3, 9.5 ) = " + maximo(3, 9.5) );
		System.out.println( "maximo( 12.1, 9.5, 3 ) = " + maximo(12.1, 9.5, 3) );
		System.out.println( "maximo( \"martes\", \"sabado\" ) = " + maximo("martes", "sabado") );
	}
}