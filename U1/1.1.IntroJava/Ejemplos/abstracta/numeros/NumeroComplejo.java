package numeros;

public abstract class NumeroComplejo {


	abstract public double getParteReal();
	abstract public void   setParteReal(double parteReal);
	abstract public double getParteImaginaria();
	abstract public void   setParteImaginaria(double parteImaginaria);
	abstract public double getModulo();
	abstract public void   setModulo(double modulo);
	abstract public double getArgumento();
	abstract public void   setArgumento(double argumento);


	public NumeroComplejo sumar(NumeroComplejo a) {
		setParteReal( getParteReal() + a.getParteReal() );
		setParteImaginaria( getParteImaginaria() + a.getParteImaginaria() );
		return this;
	}

	public NumeroComplejo restar(NumeroComplejo a) {
		setParteReal( getParteReal() - a.getParteReal() );
		setParteImaginaria( getParteImaginaria() - a.getParteImaginaria() );
		return this;
	}

	public NumeroComplejo multiplicar(NumeroComplejo a) {
		setModulo( getModulo() * a.getModulo() );
		setArgumento( getArgumento() + a.getArgumento() );
		return this;
	}

	public NumeroComplejo dividir(NumeroComplejo a) {
		setModulo( getModulo() / a.getModulo() );
		setArgumento( getArgumento() - a.getArgumento() );
		return this;
	}
} // numeros