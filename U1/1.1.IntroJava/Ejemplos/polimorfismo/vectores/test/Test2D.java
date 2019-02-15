package test;

import espacioVectorial.*; 

class Test2D {

	public static void main (String[] args) {
		Coordenada2D xy = new Coordenada2D( 3.4, -5.6 ); 
		System.out.println( "Coordenada 2D: " + xy ); 
		System.out.println( "Coordenada x: " + xy.getX() ); 
		System.out.println( "Coordenada y: " + xy.getY() ); 
		System.out.println( "Norma: " + xy.norma() );

	} // main 
	
} // Test2D