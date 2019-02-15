class Ej_2_7 {
	
	public static void main (String[] args) {
		String saludo1 = "hola" + ", ¿que tal?";
		System.out.println("saludo1: "+ saludo1);

		String saludo2 = saludo1 + " ¿Cómo estás?";
		System.out.println("saludo2: "+ saludo2);

		int n = 3;
		String saludo3 = "abcd" + n;
		System.out.println("saludo3: "+ saludo3);

		int m = 'ñ';
		String saludo4 = "abcd" + m;
		System.out.println("saludo4: "+ saludo4);

		char p = 'ñ';
		String saludo5 = "abcd" + p;
		System.out.println("saludo5: "+ saludo5);

		char q = 'ñ' + 1; // cual sera el siguiente caracter a la enye???
		String saludo6 = "abcd" + q;
		System.out.println("saludo6: "+ saludo6);
	}
}