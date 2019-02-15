class Ej_2_1 {
	
	public static void main (String[] args) {
		/* ' ': c�digo UTF-16 del car�cter UNICODE entrecomillado (https://unicode-table.com/es/)  */
		char j ='�';
		char k = 241;
		short l = 241;
		short m = '�';
		System.out.println("j: " + j + ", k: " + k + " l: " + l + ", m: " + m );
		/* IMPORTANTE: si falla en compilaci�n, probable causa, juego de caracteres. Probad:
		   - Otra codificaci�n al guardar el fichero:
		        * Save with encoding -> Western (ISO 8859-15) desde Sublime
		   - O especificar codificaci�n desde l�nea de compilaci�n:
		      > javac -encoding utf8 Ej_1_1.java
		      > java Ej_1_1

		      > javac -encoding iso8859-15 Ej_1_1.java
		      > java Ej_1_1

		    Probables diferencias entre Git Bash y cmd de Windows
		*/

	}
}