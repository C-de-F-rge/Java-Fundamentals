package cClasesEnvolventes;

public class ClaseBoolean {
    private static final boolean TRUE = true; // valor verdadero
    private static final boolean FALSE = false; // valor falso

    public static void main(String[] args) {

        /*
         * Métodos de Creación y Conversión:
         */
        // valueOf(boolean b): devuelve un objeto Boolean que representa el booleano b
        Boolean bool1 = Boolean.valueOf(TRUE); // convierte un booleano a un Boolean
        Boolean.valueOf("Hola Mundo"); // convierte una cadena a un Boolean

        // parseBoolean(String s): convierte una cadena a un booleano
        boolean bool2 = Boolean.parseBoolean("true"); // convierte una cadena a un boolean

        // toString(): convierte un booleano a una cadena
        String bool3 = Boolean.toString(TRUE); // convierte un booleano a una cadena

        /*
         * Métodos de Comparación:
         */
        // equals(Object obj): compara dos booleanos y devuelve true si son iguales
        System.out.println("Los booleanos son iguales: " + bool1.equals(bool2)); // los booleanos son iguales
        // devuelve true si son iguales y false si son diferentes

        // compare(boolean x, boolean y): compara dos booleanos y devuelve un entero
        System.out.println("Comparacion de booleanos: " + Boolean.compare(TRUE, FALSE)); // comparacion de booleanos
        // devuelve -1 si el booleano x es menor que el booleano y, 0 si son iguales y 1

        // ccompareTo(Boolean anotherBoolean): compara dos booleanos y devuelve un
        // entero
        System.out.println("Comparacion de booleanos: " + bool1.compareTo(bool2)); // comparacion de booleanos
        // devuelve 1 si el booleano es igual y 0 si no es igual

    }

}
