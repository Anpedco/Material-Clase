package testClasesAnonimas;

import espacioVectorial.*;

class TestAnonimato {
	
	public static void main (String[] args) {

		// Referencia: extensi´ on convencional de una clase
		class NuevaCoordenada3D extends Coordenada3D{
			NuevaCoordenada3D(double x, double y, double z){
				super(x, y, z);
			}

			@Override public String toString() {
				return "[" + super.toString() + "]";
			}
		};

		NuevaCoordenada3D n = new NuevaCoordenada3D(1., 2., 3.);
		System.out.println("n: " + n);


		// Clase an´ onima: no reutilizable posteriormente
		Coordenada3D m = new Coordenada3D(10., 20., 30.) {
			// Si no hay sobreescritura se mantienen constructores de superclase
			@Override public String toString() {
				return "{" + super.toString() + "}";
			}			
		};

		System.out.println("m:" + m);
		
		// Sin generar objeto intermedio:
		System.out.println("Coordenada: " +
			new Coordenada3D(100, 200, 300) {
				@Override public String toString() {
					return "\"" + super.toString() + "\"";
				} // toString
			} // new Coordenada3D
		);  // println

		// Con Polimorfismo
		GeometriaEuclidea g = new Coordenada3D(3.4, 5.6, 3.3) {
			@Override public String toString() {
				return "#" + super.toString() + "#";
			}
		};

		System.out.println("norma de g: " + g.norma() + " .toString: "+ g);
		
		// Clase anónima implementando un interfaz
		GeometriaEuclidea g2 = new GeometriaEuclidea() {
			// public ya que los métodos abstractos del interfaz son
			// siempre publicos y en la implementación no se puede
			// aminorar el acceso
			public double sumaDeCuadrados() { // ...pequeña licencia...
				return 81.;
			}

			@Override public String toString() {
				return "*" + super.toString() + "*";
			}
		};

		// Explicación
		System.out.println("norma de g2: " + g2.norma() + " .toString: "+ g2);

	} // main
} // TestAnonimato