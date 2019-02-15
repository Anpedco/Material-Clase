// X es superclase de Y y de Z.
// Y y Z son clases "hermanas" (incompatibles)

// Tres clases en un mismo fichero: ok si hay SOLO una clase pública

class X {
}

class Y extends X{
}

class Z extends X{
}

public class Polimorfismo {
	public static void main(String args[ ]) {
		X x = new X();
		Y y = new Y();
		Z z = new Z();
		X xy = new Y(); // Ok (el objeto de clase Y lo es también de la clase X)
		X xz = new Z(); // Ok (el objeto de clase Z lo es también de la clase X)
		Y yz = new Z(); // Error en compilación: incompatible type (siblings)
		Y y1 = new X(); // Error en compilación: X is not a Y
		Z z1 = new X(); // Error en compilación: X is not a Z
		X x1 = y; // Ok (y es objeto de subclase de X)
		X x2 = z; // Ok (z es objeto de subclase de X)
		Y y1 = (Y) x; // Compila OK, pero error en tiempo de ejecución
		Z z1 = (Z) x; // Compila OK, pero error en tiempo de ejecución
		Y y2 = (Y) x1; // ok (x1 es de clase Y)
		Z z2 = (Z) x2; // ok (x2 es de clase Z)
		Y y3 = (Y) z; // Compila OK, pero error en tiempo de ejecución (siblings)
		Z z3 = (Z) y; // Compila OK, pero error en tiempo de ejecución (siblings)
		Object o = z;
		Object o1 = (Y) o; // Compila OK, pero error en tiempo de ejecución
	} // main
} // Polimorfismo
