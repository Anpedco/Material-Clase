package test;

import numeros.*;

class TestNumeroComplejo {
	
	public static void main (String[] args) {

		NumeroComplejoPolar p   = new NumeroComplejoPolar( 10, -0.5 );
		System.out.println("p:         " + p + " = " + new NumeroComplejoCartesiano(p));		

		NumeroComplejoCartesiano c  = new NumeroComplejoCartesiano(3.,4.0);
		System.out.println("c:         " + c + " = " + new NumeroComplejoPolar(c));

		/* p2 <- p */
		NumeroComplejoPolar p2  = new NumeroComplejoPolar(p);		
		/* c2 <- c */
		NumeroComplejoCartesiano c2 = new NumeroComplejoCartesiano(c);

		/* Suma de numero complejo cartesiano con uno polar */
		/* p2 <- p2 (p original) +  c */
		System.out.print("p2<-p+c:   " + p2.sumar(c));
		System.out.println(" = " + new NumeroComplejoCartesiano(p2));

		/* Suma de numero complejo polar con uno cartesiano */
		/* c2 <- c2 (c original) + p */
		System.out.print("c2<-p+c:   " + c2.sumar(p));
		System.out.println(" = " + new NumeroComplejoPolar(c2));

		

	} // main

} // TestNumeroComplejo