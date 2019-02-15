package espacioVectorial; 

public class Numero<T> {

	T objeto;

	public Numero(T objeto) {
		this.objeto = objeto;
	}

	public double doubleValue() {
		if (objeto instanceof Boolean) {
			if ( ((Boolean)objeto)) {
				return 1.;
			} else{
				return 0.;
			}
		} else {
			return ((Number)objeto).doubleValue();
		}
	}

	public String toString() {
		return objeto.toString();
	}
	 
}