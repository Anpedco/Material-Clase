package test;

import p1.sp11.PorUnoComaCincoMas2;

class Test1 {
	
	public static void main (String [] args) {

		PorUnoComaCincoMas2 z = new PorUnoComaCincoMas2(4);

		System.out.println("z: " + z); // z.toString() -public-

		// z.a ??? z.x ??? z.x_por_uno_coma_cinco_mas_2 ???

		Object t = z.a; // ¿¿¿ No puedo PorUnoComaCinco x = z.a ???

		System.out.println("t: " + t); // t.toString() ?????????
		//System.out.println("t.get_x_por_uno_coma_cinco(): " 
		//	   + t.get_x_por_uno_coma_cinco() ); // ???
		
	}
}