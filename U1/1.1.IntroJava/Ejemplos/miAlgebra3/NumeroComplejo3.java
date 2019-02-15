package miAlgebra3;

class NumeroComplejo3 {

	private double parteReal;       // parte real del número complejo
	private double parteImaginaria; // parte imaginaria del número complejo


	// Atributo estático
	static NumeroComplejo3 CERO = new NumeroComplejo3(0.);

	// Método estático
	static String descripcion() {
		return "Un número complejo está compuesto por...";
	}

	// Clase estática
	static class Polar {

		private double modulo;
		private double argumento;

		public Polar(NumeroComplejo3 a) {
			modulo = Math.sqrt(  a.getParteReal()*a.getParteReal()
				               + a.getParteImaginaria()*a.getParteImaginaria() );
			argumento = Math.atan(a.getParteImaginaria() / a.getParteReal() );
		}

		public double getModulo() {
			return modulo;
		}

		public double getArgumento() {
			return argumento;
		}

		public String toString() {
			return "" + modulo + "|" + argumento;
		}

	} // clase Polar

	// Constructor de copia
	public NumeroComplejo3( NumeroComplejo3 c) {
		this( c.getParteReal(), c.getParteImaginaria() );
		// this( c.parteReal, c.parteImaginaria ); // equivalente
	}

	// Construye un número complejo
	public NumeroComplejo3( double r, double i) {
		parteReal = r;
		parteImaginaria = i;
	}

	// Crea un número complejo con solo parte real;
	// parte imaginaria nula
	public NumeroComplejo3( double r ) {
		this(r, 0.);
	}


	// Devuelve parte real del número complejo
	public double getParteReal( ) {
		return parteReal;
	}

	// Devuelve parte imaginaria del número complejo
	public double getParteImaginaria( ) {
		return parteImaginaria;
	}

	// Suma "este" numero complejo con el del parámetro.
	// El resultado de la suma se queda "aquí" y también
	// se devuelve o "retorna"
	public NumeroComplejo3 sumar( NumeroComplejo3 c) {
		parteReal += c.getParteReal( );
		parteImaginaria += c.getParteImaginaria( );
		return this;
	}

	// Pendiente de realizar
	public NumeroComplejo3 restar( NumeroComplejo3 c) {
		return null; // acción provisional
	}

	// Pendiente de realizar
	public String toString() {
		return "" + parteReal + " " + parteImaginaria + "j";
		//return null; // accion provisional
	}
	
} // class NumeroComplejo3