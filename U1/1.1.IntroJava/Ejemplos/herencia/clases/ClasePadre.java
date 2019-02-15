package clases;

class ClasePadre {
	
	public int x;
	protected int y;
	int z; 
	private int w;

	ClasePadre(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
		w = x + y + z;
	}

	ClasePadre(){
		this(1,1,1);
	}

	int get_w(){
		return w;
	}

	void saludo() {
		System.out.println("Hola, soy ClasePadre");
	}

	public String toString(){
		return "x=" + x + ", y=" + y +  ", z=" + z + ", w=" + w;
	}

}		