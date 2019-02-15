package miAlgebra2;

class NumeroComplejo2 {

	private double parteReal;       // parte real del número complejo
	private double parteImaginaria; // parte imaginaria del número complejo

	// Constructor de copia
	public NumeroComplejo2( NumeroComplejo2 x) {
		this( x.getParteReal(), x.getParteImaginaria() );
		// this( x.parteReal, x.parteImaginaria ); // equivalente
	}

	// Construye un número complejo
	public NumeroComplejo2( double r, double i) {
		parteReal = r;
		parteImaginaria = i;
	}

	// Crea un número complejo con solo parte real;
	// parte imaginaria nula
	public NumeroComplejo2( double r ) {
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
	public NumeroComplejo2 sumar( NumeroComplejo2 c) {
		parteReal += c.getParteReal( );
		parteImaginaria += c.getParteImaginaria( );
		return this;
	}

	// Pendiente de realizar
	public NumeroComplejo2 restar( NumeroComplejo2 c) {
		return null; // acción provisional
	}

	// Pendiente de realizar
	public String toString() {
		return "" + parteReal + " " + parteImaginaria + "j";
		//return null; // accion provisional
	}
	
} // class NumeroComplejo2