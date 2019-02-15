package clases;

public class ClaseHija extends ClasePadre {
	
	public int z;

	public ClaseHija(int x, int y, int z) {
		super( x, y, z );
		this.z = super.z;
	}

	public ClaseHija(){
		this(1000, 1000);
	}

	public ClaseHija( int x ) {
		this.x = x;
	}

	public ClaseHija( int x, int y ) {
		this.x = x;
		this.y = y;
	}

	public void saludo(){
		System.out.println("Hola, soy ClaseHija");
	}

	public void saludo_heredado(){
		super.saludo();
	}

	public int get_w() {
		return super.get_w();
	}

	public int get_y(){
		return y;
	}

	public String toString() {
		return "[" + super.toString() + "]";
	}

}		