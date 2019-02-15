class Ej_5_3 {
	
	static class Clase_A {
		int i;

		public Clase_A( int i ) {
			this.i = i;
		}

		public String toString() {
			return "valor (clase A) = " + i;
		}

		// metodo equals heredado de Object

	}

	static class Clase_B {
		int j;

		public Clase_B( int j ) {
			this.j = j;
		}

		public String toString() {
			return "valor (clase B) = " + j;
		}

		// metodo equals heredado de Object sobreescrito
		// por este metodo nuevo
		public boolean equals( Clase_B x ) {
			if (x.j == j) {
				return true;
			} else {
				return false;
			}
		}

		// Idealmente debería sobreescribirse adicionalmente un método
		// denominado hashcode...

	}

	public static void main (String[] args) {
		Clase_A a = new Clase_A(3);
		Clase_A a2 = new Clase_A(3);

		Clase_B b = new Clase_B(5);
		Clase_B b2 = new Clase_B(5);

		System.out.println( "a: " + a + ", a2: " + a2);
		System.out.println( "b: " + b + ", b2: " + b2);

		System.out.println( "a==a2 : " + a.equals(a2) );
		System.out.println( "b==b2 : " + b.equals(b2) );
	}
}