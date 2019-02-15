public class Buzon {

	private int dato;
	private boolean hayDato = false;
	
	synchronized 
	public void put(int valor) {

		if (hayDato) {
			try {
				// espera a que se consuma el dato
				wait();
			} catch (InterruptedException e) {
			}
		} // hay dato

		dato = valor;
		hayDato = true;
		
		System.out.println("Productor.  put: " + valor );
		
		// notificar que ya hay dato.
		notify();
	}

	synchronized 
	public int get() {

		if (!hayDato) {
			try {
			// espera a que el productor coloque un valor
				wait();
			} catch (InterruptedException e) {
			}
		}

		hayDato = false;
		System.out.println("Consumidor. get: " + dato);
			
		// notificar que el valor ha sido consumido
		notify(); 

		return dato;
	}
} // Class Buzon
