package test;

import clases.ClaseHija;

class TestHerencia {
	
	public static void main ( String[] args ) {

		ClaseHija a = new ClaseHija(1,2,3);
		a.saludo(); 
		a.saludo_heredado(); // ¿no podría a.super.saludo()?

		System.out.println("a: " + a);
		System.out.println("a.x: " + a.x);
		System.out.println("a.get_y(): " + a.get_y()); // ¿No puedo a.y ???
		System.out.println("a.z: " + a.z); // ¿Por qué puedo a.z ???
		System.out.println("a.get_w(): " + a.get_w()); // ¿Por qué no puedo a.w ???

		ClaseHija b = new ClaseHija(10, 20);
		System.out.println("b: " + b);

		ClaseHija c = new ClaseHija();
		System.out.println("c: " + c);

	} // main
} // TestHerencia		