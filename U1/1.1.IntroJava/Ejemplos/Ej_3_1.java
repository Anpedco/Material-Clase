class Ej_3_1 {
	
	public static void main (String[] args) {
		int x;
		
		x = 1;
		x += 6 + 3 * 5 % 9 / 3 << 2; // x = 33; 

		System.out.println( "x = " + x );		
		
		//////////
		
		x = 1;
		x = x + ( ( 6 + ( ( (3 * 5) % 9 ) / 3 ) ) << 2 ); // x = 33;

		System.out.println( "x = " + x );

	}
}