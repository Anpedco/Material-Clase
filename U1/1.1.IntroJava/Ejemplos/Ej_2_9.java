class Ej_2_9 {

    static class OtraClase {
        // Clase vacía: no hace nada. Es correcto
    }

    static int i;
    static float x;
    static char a;
    static boolean z;
    static OtraClase objeto;

    public static void main(String[] args) {


        System.out.println("i: " + i );
        System.out.println("x: " + x );
        System.out.println("a: " + a );
        System.out.println("(short)a: " + (short)a );
        System.out.println("z: " + z );
        System.out.println("objeto: " + objeto );
        
        int local_i; 
        // Error: uso sin inicializar!!!
        //System.out.println("local_i: " + local_i);
    
    } // main

} // Ej_2_9