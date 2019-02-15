package numeros;

public class NumeroComplejoCartesiano extends NumeroComplejo{
	
	private double parteReal;
	private double parteImaginaria;

	public NumeroComplejoCartesiano(double parteReal, double parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public NumeroComplejoCartesiano(NumeroComplejoCartesiano c) {
		this(c.parteReal, c.parteImaginaria);
	}

	public NumeroComplejoCartesiano(NumeroComplejoPolar p) {
		this(p.getParteReal(), p.getParteImaginaria());
	}

	public NumeroComplejoCartesiano() {
		parteReal = 0.;
		parteImaginaria = 0.;
	}

	public double getModulo() {
		return Math.sqrt(parteReal*parteReal + parteImaginaria*parteImaginaria);
	}

	public void setModulo(double modulo) {
		double argumento = getArgumento();
		parteReal        = modulo * Math.cos(argumento);
		parteImaginaria  = modulo * Math.sin(argumento);
	}

	public double getArgumento() {
		return Math.atan(parteImaginaria/parteReal);
	}

	public void setArgumento(double argumento) {
		double modulo   = getModulo();
		parteReal       = modulo * Math.cos(argumento);
		parteImaginaria = modulo * Math.cos(argumento);
	}

	public double getParteReal() {
		return parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public String toString() {
		return "(" + parteReal + " "+ ((parteImaginaria<0.)?"":"+") + 
		       parteImaginaria + " i)";
	}

} // Numero complejo cartesiano