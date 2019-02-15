class Ej_5_4 {

	enum laborables { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES };

	public static void main (String [] args) {

		/* VIERNES incorrecto, Laborables.VIERNES correcto */
		laborables mejorDiaLaborable = laborables.VIERNES; 

		System.out.println("Mejor día laborable: " + mejorDiaLaborable);

		int i = 1;
		for (laborables d: laborables.values()) {
			System.out.println("Laborable " + (i++) + ": " + d);
		}

	} // main

} // Test