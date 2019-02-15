public class ProductorConsumidorTest {
	public static void main(String[] args) {
		Buzon c = new Buzon ();
		Productor produce = new Productor (c);
		Consumidor consume = new Consumidor (c);
		produce.start();
		consume.start();




	}
}