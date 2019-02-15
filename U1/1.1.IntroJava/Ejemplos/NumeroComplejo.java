package miAlgebra;

class NumeroComplejo {

	private double parteReal;       // parte real del número complejo
	private double parteImaginaria; // parte imaginaria del número complejo



	// Construye un número complejo
	public NumeroComplejo( double r, double i) {
		parteReal = r;
		parteImaginaria = i;
	}

	// Crea un número complejo con solo parte real;
	// parte imaginaria nula
	public NumeroComplejo( double r ) {
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
	public NumeroComplejo sumar( NumeroComplejo c) {
		parteReal += c.getParteReal( );
		parteImaginaria += c.getParteImaginaria( );
		return this;
	}

	// Pendiente de realizar
	public NumeroComplejo restar( NumeroComplejo c) {
		return null; // acción provisional
	}

	// Pendiente de realizar
	public String toString() {
		return "" + parteReal + " " + parteImaginaria + "j";
		//return null; // accion provisional
	}
	
} // class NumeroComplejo