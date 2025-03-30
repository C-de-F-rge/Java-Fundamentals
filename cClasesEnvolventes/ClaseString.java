package cClasesEnvolventes;

public class ClaseString {

    public static void main(String[] args) {

        // Crear un objeto String
        String str1 = "Hola Mundo"; // cadena de caracteres
        String str2 = new String("Hola Mundo"); // cadena de caracteres

        /*
         * Clase String:
         * Es una clase que representa una cadena de caracteres, es inmutable;
         * es decir, una vez creada no se puede modificar.
         * A continuacion se presentan algunos metodos de la clase String:
         */

        // --------------------------------------------------------------------------------------------------
        /*
         * Métodos de Información:
         */

        // length(): devuelve la longitud de la cadena
        System.out.println("Longitud de la cadena: " + str1.length()); // longitud de la cadena
        // charAt(int index): devuelve el caracter en la posicion index
        System.out.println("Caracter en la posicion 0: " + str1.charAt(0)); // caracter en la posicion 0
        // isEmpty(): devuelve true si la cadena esta vacia
        System.out.println("La cadena esta vacia: " + str1.isEmpty()); // la cadena esta vacia
        // isBlank(); la cadena esta vacia o contiene solo espacios en blanco
        System.out.println("La cadena esta vacia o contiene solo espacios en blanco: " + str1.isBlank()); // la cadena
                                                                                                          // esta vacia
                                                                                                          // o contiene
                                                                                                          // solo
                                                                                                          // espacios en
                                                                                                          // blanco

        /*
         * Métodos de comparación:
         */

        // equals(Object obj): compara dos cadenas y devuelve true si son iguales
        System.out.println("Las cadenas son iguales: " + str1.equals(str2)); // las cadenas son iguales
        // equalsIgnoreCase(String str): compara dos cadenas y devuelve true si son
        // iguales, ignorando mayusculas y minusculas
        System.out
                .println("Las cadenas son iguales (ignorando mayusculas y minusculas): " + str1.equalsIgnoreCase(str2)); // las
                                                                                                                         // cadenas
                                                                                                                         // son
                                                                                                                         // iguales
                                                                                                                         // (ignorando
                                                                                                                         // mayusculas
                                                                                                                         // y
                                                                                                                         // minusculas)
        // compareTo(String str): compara dos cadenas y devuelve un entero negativo,
        // cero o positivo si la cadena es menor, igual o mayor que la otra
        System.out.println("Comparacion de cadenas: " + str1.compareTo(str2)); // comparacion de cadenas

        /*
         * Métodos de búsqueda:
         */

        // contains(CharSequence sequence): devuelve true si la cadena contiene la
        // secuencia de caracteres
        System.out.println("La cadena contiene la secuencia de caracteres 'Mundo': " + str1.contains("Mundo")); // la
                                                                                                                // cadena
                                                                                                                // contiene
                                                                                                                // la
                                                                                                                // secuencia
                                                                                                                // de
                                                                                                                // caracteres
                                                                                                                // 'Mundo'
        // startsWith(String prefix): devuelve true si la cadena comienza con el prefijo
        System.out.println("La cadena comienza con 'Hola': " + str1.startsWith("Hola")); // la cadena comienza con
                                                                                         // 'Hola'
        // endsWith(String suffix): devuelve true si la cadena termina con el sufijo
        System.out.println("La cadena termina con 'Mundo': " + str1.endsWith("Mundo")); // la cadena termina con 'Mundo'
        // indexOf(String str): devuelve la posicion de la primera ocurrencia de la
        // cadena
        System.out.println("Posicion de la primera ocurrencia de 'Mundo': " + str1.indexOf("Mundo")); // posicion de la
                                                                                                      // primera
                                                                                                      // ocurrencia de
                                                                                                      // 'Mundo'
        // lastIndexOf(String str): devuelve la posicion de la ultima ocurrencia de la
        // cadena
        System.out.println("Posicion de la ultima ocurrencia de 'Mundo': " + str1.lastIndexOf("Mundo")); // posicion de
                                                                                                         // la ultima
                                                                                                         // ocurrencia
                                                                                                         // de 'Mundo'

        /*
         * Métodos de modificación:
         */
        // toUpperCase(): convierte la cadena a mayusculas
        System.out.println("Cadena en mayusculas: " + str1.toUpperCase()); // cadena en mayusculas
        // toLowerCase(): convierte la cadena a minusculas
        System.out.println("Cadena en minusculas: " + str1.toLowerCase()); // cadena en minusculas
        // trim(): elimina los espacios en blanco al principio y al final de la cadena
        System.out.println("Cadena sin espacios en blanco: " + str1.trim()); // cadena sin espacios en blanco
        // replace(char oldChar, char newChar): reemplaza un caracter por otro en la
        // cadena
        System.out.println("Cadena con 'o' reemplazado por 'a': " + str1.replace('o', 'a')); // cadena con 'o'
                                                                                             // reemplazado por 'a'
        // replaceAll(String regex, String replacement): reemplaza todas las ocurrencias
        // de una expresion regular por otra cadena
        System.out.println("Cadena con 'o' reemplazado por 'a': " + str1.replaceAll("o", "a")); // cadena con 'o'
                                                                                                // reemplazado por 'a'

        /*
         * Métodos de Extracción:
         */
        // substring(int beginIndex): devuelve la subcadena desde el indice beginIndex
        System.out.println("Subcadena desde el indice 5: " + str1.substring(5)); // subcadena desde el indice 5
        // substring(int beginIndex, int endIndex): devuelve la subcadena desde el
        System.out.println("Subcadena desde el indice 5 hasta el 10: " + str1.substring(5, 10)); // subcadena desde el
                                                                                                 // indice 5 hasta el
                                                                                                 // 10

        /*
         * Métodos de Division y Unión:
         */
        // split(String regex): divide la cadena en partes usando una expresion regular
        String[] partes = str1.split(" "); // divide la cadena en partes usando un espacio como separador
        // join(String delimiter, String[] elements): une las partes de la cadena usando
        // un delimitador
        String str3 = String.join("-", partes); // une las partes de la cadena usando un guion como delimitador

        /*
         * Método para Convertir a otro tipo:
         */
        // toCharArray(): convierte la cadena a un arreglo de caracteres
        char[] arr = str1.toCharArray(); // convierte la cadena a un arreglo de caracteres
        // valueOf(string data): convierte un arreglo de caracteres a una cadena
        String str4 = String.valueOf(arr); // convierte un arreglo de caracteres a una cadena
    }

}
