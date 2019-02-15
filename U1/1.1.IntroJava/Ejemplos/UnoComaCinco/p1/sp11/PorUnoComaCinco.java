package p1.sp11;

class PorUnoComaCinco {

	private float x_por_uno_coma_cinco;
	int x;

	PorUnoComaCinco( int x ) {
		this ( (float) (1.5 * x) );
		this.x = x;
	}

	private PorUnoComaCinco( float y ) {
		x_por_uno_coma_cinco = y;
	}

	float get_x_por_uno_coma_cinco() {
		return x_por_uno_coma_cinco;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + x_por_uno_coma_cinco + ")"; 
	}

}