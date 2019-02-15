class Ej_2_4 {
	
	static short f (int a, double b) {
		return (short) (a+b);
	}

	public static void main(String[] args) {

		byte b0 = 34; // no es necesario casting con literal que "cabe"

		//byte b1 = 128; // error, rango byte: -128..127
		
		byte b2 = (byte)128;
		// (byte)128 -> (byte)0x00_00_00_80 -> 0x80 -> -128 en complemento a 2 en 8 bits
		
		byte b3 = (byte)896; // (byte)0x380 -> 0x80 -> -128
		
		System.out.println("b0: " + b0 + ", b2: " + b2 + ", b3: " + b3 );
		
		float p1 = 2; // !!!
		float p2 = 3.4f;
		short x = f( /*(int)*/ p1, p2 ); // Error en compilación
		System.out.println( "x = " + x );

	} // main

}