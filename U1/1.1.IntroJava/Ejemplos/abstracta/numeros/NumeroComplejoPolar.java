package numeros;

public class NumeroComplejoPolar extends NumeroComplejo{
	
	private double modulo;
	private double argumento;

	public NumeroComplejoPolar(double modulo, double argumento) {
		this.modulo = modulo;
		this.argumento = argumento;
	}

	public NumeroComplejoPolar(NumeroComplejoPolar p) {
		this(p.modulo, p.argumento);
	}

	public NumeroComplejoPolar(NumeroComplejoCartesiano c) {
		this(c.getModulo(), c.getArgumento());
	}

	public NumeroComplejoPolar() {
		modulo = 0.;
		argumento = 0.;
	}

	public double getModulo() {
		return modulo;
	}

	public void setModulo(double modulo) {
		this.modulo = modulo;
	}

	public double getArgumento() {
		return argumento;
	}

	public void setArgumento(double argumento) {
		this.argumento = argumento;
	}

	public double getParteReal() {
		return modulo * Math.cos(argumento);
	}

	public double getParteImaginaria() {
		return modulo * Math.sin(argumento);
	}

	public void setParteReal(double parteReal) {
		double parteImaginaria = getParteImaginaria();
		modulo = Math.sqrt(parteReal*parteReal + parteImaginaria*parteImaginaria);
		argumento = Math.atan(parteImaginaria/parteReal);
	}

	public void setParteImaginaria(double parteImaginaria) {
		double parteReal = getParteReal();
		modulo = Math.sqrt(parteReal*parteReal + parteImaginaria*parteImaginaria);
		argumento = Math.atan(parteImaginaria/parteReal);
	}

	public String toString() {
		return "("+ modulo + "|_" + argumento + ")";
	}

} // NumeroComplejoPolar