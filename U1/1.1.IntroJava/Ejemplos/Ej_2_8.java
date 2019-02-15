class Ej_2_8 {
	
	public static void main (String[] args) {
		char a = 'z';
		char enye = '\u00f1';
		char comilla_simple = '\'';
		char comilla_doble = '\"';
		char comilla_doble2 = '"';

		System.out.println( a + enye + "\'" + comilla_simple + comilla_doble + comilla_doble2 + "\"" );
		
		System.out.println( "h" + a + enye + "\'" + comilla_simple + comilla_doble + comilla_doble2 + "\"" );
		
		System.out.println( 'h' + a + enye + "\'" + comilla_simple + comilla_doble + comilla_doble2 + "\"" );
		
	}
}