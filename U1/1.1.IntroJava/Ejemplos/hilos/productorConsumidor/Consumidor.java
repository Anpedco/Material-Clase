public class Consumidor extends Thread {

	private Buzon buzon;

	public Consumidor (Buzon c) {
		buzon= c;
	}

	public void run() {

		int value;
		for (int i = 0; i < 10; i++) {
			value = buzon.get();
			// Consumo de value
		}

	} // run

} // Consumidor