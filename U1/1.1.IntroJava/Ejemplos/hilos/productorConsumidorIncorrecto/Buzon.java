public class Buzon {

	private int dato;
	private boolean hayDato = false;
	
	public void put(int valor) {

		while(hayDato){
			//System.out.print(".");
		};

		dato = valor;
		hayDato = true;
		
		System.out.println("");
		System.out.println("Productor.  put: " + valor );
		
		
	}

	public int get() {

		int x =0;
		while(!hayDato){
			//System.out.print("+");
		};


		hayDato = false;

		System.out.println("");
		System.out.println("Consumidor. get: " + dato);

		return dato;
	}
} // Class Buzon
