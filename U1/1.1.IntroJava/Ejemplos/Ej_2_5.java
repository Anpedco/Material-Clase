class Ej_2_5 {
	
	public static void main (String[] args) {
		//int x = 5.6; // Error en compilación
		int x = (int)5.6;
		double z = 4.5f;
		//float c = 4.5; // Error en compilación
		float c = (float) 4.5;

		System.out.println("x = " + x + ", z = " + z + ", c = " + c);
	}
}