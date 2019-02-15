public class Productor extends Thread {

	private Buzon buzon;
	
	public Productor (Buzon c) {
		buzon = c;
	}
	
	public void run() {
	
		for (int i = 0; i < 10; i++) {
	
			// produce i
			buzon.put(i);
	
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
			}
	
		}
	
	} // run

} // Productor