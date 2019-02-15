class Ej_5_5 {

	enum Optimismo { EXCELENTE, BIEN, REGULAR, MAL }

	enum TipoDia { LABORABLE, FESTIVO }

	enum Dias { 

		/* Secuencia separada por comas. Acaba con punto y coma */
		LUNES(TipoDia.LABORABLE, Optimismo.MAL), 
		MARTES(TipoDia.LABORABLE, Optimismo.REGULAR), 
		MIERCOLES(TipoDia.LABORABLE, Optimismo.BIEN), 
		JUEVES(TipoDia.LABORABLE, Optimismo.BIEN), 
		VIERNES(TipoDia.LABORABLE, Optimismo.EXCELENTE),
		SABADO(TipoDia.FESTIVO, Optimismo.EXCELENTE),
		DOMINGO(TipoDia.FESTIVO, Optimismo.REGULAR);

		private Optimismo nivelOptimismo;
		private TipoDia tipoDia;

		/* No se pueden crear mas objetos que los definidos 
		anteriormente, pero con este constructor se "autoconstruyen"*/
		Dias(TipoDia tipoDia, Optimismo nivelOptimismo) {
			this.tipoDia = tipoDia;
			this.nivelOptimismo = nivelOptimismo;
		}

		public TipoDia getTipoDia() {
			return tipoDia;
		}

		public Optimismo getNivelOptimismo() {
			return nivelOptimismo;
		}

	} // Dias


	public static void main (String [] args) {

		Dias mejorDia = Dias.SABADO; 

		System.out.println("Mejor día de la semana: " + mejorDia);
		switch (mejorDia) {
			/* Dias.VIERNES: ¡incorrecto!; VIERNES: ¡correcto! */
			case VIERNES:  
			case SABADO:
			case DOMINGO:
					System.out.println("Normal...");
				break;	
			default:
				System.out.println("Pues no lo entiendo...");

		}
		
		int i = 1;
		for ( Dias d: Dias.values() ) {
			System.out.println("Laborable " + (i++) 
				+ ", tipo de dia: " + d.getTipoDia()  
				+ ", optimismo: " + d.getNivelOptimismo());
		}		

	} // main

} // Test3