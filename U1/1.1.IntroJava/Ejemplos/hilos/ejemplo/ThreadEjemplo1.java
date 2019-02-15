

class Th extends Thread {
	
	public Th(String nombre) {
		super(nombre);
	}

	public void run() {
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " " + getName());
		System.out.println("Termina thread " + getName());
	}
} 




public class ThreadEjemplo1 extends Thread {
	
	public static void main (String [] args) {
	
		System.out.println("Inic. thread main");
	
		new Th("Pepe").start();
		new Th("Juan").start();

		System.out.println("Termina thread main");
	}
}
