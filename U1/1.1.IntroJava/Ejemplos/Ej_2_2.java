class Ej_2_2 {
	
	static short f (int a, double b) {
		return (short) (a+b);
	}

	public static void main(String[] args) {
		long x = 1;
		byte p1 = 2; /* CAMBIESE A TIPO float y observese consecuencias...*/
		float p2 = 3.4f;
		x = f( p1, p2 );
		System.out.println( "x = " + x );
	}

}