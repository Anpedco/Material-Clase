class Carrera {

	int x;
	int y;

    //synchronized
	void actualizar(String quien, int tempo, int valor_x) {
		x = valor_x;

		try {
			// Espera aleatoria dentro del intervalo [0..tempo]
			Thread.sleep( (long)Math.ceil(Math.random()*tempo) );
		} catch (InterruptedException e ) {
		}

		y = valor_x;

		if ( x != y )
			System.out.println( quien + " ??????" );
		else
			System.out.println( quien + " OK" );

	} // actualizar

}  // Carrera



class UnoOtro extends Thread {

	String quien;
	int tempo;
	int x;
	Carrera ac;

	UnoOtro(String quien, int tempo, int x, Carrera ac) {
		this.quien = quien;
		this.tempo = tempo;
		this.x     = x;
		this.ac    = ac;
	}
	public void run() {
		System.out.println("Inicio " + quien);
		for( int i = 0; i < 20; i++ ) {
			ac.actualizar(quien, tempo, x);
		}
		System.out.println("Fin " + quien);
	}

	public static void main(String[] args) {
		Carrera a = new Carrera();
		new UnoOtro("A", 2034, 1, a).start();
		new UnoOtro("B", 1178, 2, a).start();
	}
} // UnoOtro