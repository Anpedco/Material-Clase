class Ej_2_1 {
	
	public static void main (String[] args) {
		/* ' ': código UTF-16 del carácter UNICODE entrecomillado (https://unicode-table.com/es/)  */
		char j ='ñ';
		char k = 241;
		short l = 241;
		short m = 'ñ';
		System.out.println("j: " + j + ", k: " + k + " l: " + l + ", m: " + m );
		/* IMPORTANTE: si falla en compilación, probable causa, juego de caracteres. Probad:
		   - Otra codificación al guardar el fichero:
		        * Save with encoding -> Western (ISO 8859-15) desde Sublime
		   - O especificar codificación desde línea de compilación:
		      > javac -encoding utf8 Ej_1_1.java
		      > java Ej_1_1

		      > javac -encoding iso8859-15 Ej_1_1.java
		      > java Ej_1_1

		    Probables diferencias entre Git Bash y cmd de Windows
		*/

	}
}