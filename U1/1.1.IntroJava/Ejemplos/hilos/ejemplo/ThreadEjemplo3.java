

public class ThreadEjemplo3 extends Thread {
	
	public ThreadEjemplo3(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " " + getName());
		System.out.println("Termina thread " + getName());
	}
	

	public static void main (String [] args) {
	
		System.out.println("Inic. thread main");
	
		new ThreadEjemplo3("Pepe").start();
		new ThreadEjemplo3("Juan").start();


		System.out.println("Termina thread main");
	}
}
