package test;

import p1.sp11.PorUnoComaCincoMas2;

class Test2 {

	PorUnoComaCincoMas2 x; // Motivo del problema: 
	
	public static void main (String [] args) {

		/* ERROR en compilación: acceso a miembro no estático desde metodo
		   estático: no permitido */
		x = new PorUnoComaCincoMas2(4);

		System.out.println("x: " + x);

	}
}