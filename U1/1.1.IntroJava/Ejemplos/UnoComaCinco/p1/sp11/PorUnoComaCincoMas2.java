package p1.sp11;

public class PorUnoComaCincoMas2 {
	
	public PorUnoComaCinco a; // Se puede acceder a clase PorUnoComaCinco ???
	private int x;
	private float x_por_uno_coma_cinco_mas_2;

	public PorUnoComaCincoMas2( int x ) {
		a = new PorUnoComaCinco(x);
		// Acceso a metodo .get_x_por_uno_coma_cinco() ???
		x_por_uno_coma_cinco_mas_2 = a.get_x_por_uno_coma_cinco() + 2.f;
		this.x = a.x; // Acceso a propiedad x???
		// ¿¿¿ Podría acceder a a.x_por_uno_coma_cinco ???
	}

	public float get_x_por_uno_coma_cinco_mas_2() {
		return x_por_uno_coma_cinco_mas_2;
	}

	public int get_x() {
		return x;
	}

	public String toString() {
		return "[" + a + ", " + x_por_uno_coma_cinco_mas_2 + "]";
			       
	}
}