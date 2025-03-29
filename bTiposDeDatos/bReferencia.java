package bTiposDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bReferencia {
    public static void main(String[] args) {
        /*
         * Tipos de datos de referencia en Java:
         * Son datos más complejos que pueden estar compuestos por varios valores
         * pueden ser objetos, clases, arreglos, etc.
         * manejan un almacenamiento de tipo HEAP lo cual permite tener un flujo
         * lento de datos de entrada y salida al ser de tipo FIFO
         */

        // -----------------------------------------------------------------------------------------------------

        /*
         * Clases Estandar de Java:
         */
        String str = "Hola Mundo";// String: cadena de caracteres, puede ser mutable o inmutable
        Integer num = 10;// Integer: objeto envoltorio para el tipo primitivo int
        Double decimal = 10.5;// Double: objeto envoltorio para el tipo primitivo double
        Boolean bool = true;// Boolean: objeto envoltorio para el tipo primitivo boolean
        Object obj = new Object();// Object: clase base para todos los objetos en Java

        // ------------------------------------------------------------------------------------------------------
        /*
         * Arreglos:
         * Son estructuras de datos que permiten almacenar un conjunto de elementos del
         * mismo tipo
         */
        int[] arr = { 1, 2, 3, 4, 5 };// Arreglo: colección de elementos del mismo tipo
        int[] array = new int[5];// Arreglo de enteros de tamaño 5

        // -----------------------------------------------------------------------------------------------------

        /*
         * interfaces o clases Abstractas:
         * Son clases que no pueden ser instanciadas, pero pueden ser heredadas por
         * otras
         */

        List<String> list = List.of("Elemento 1", "Elemento 2", "Elemento 3");// List: colección de elementos que puede
                                                                              // crecer o decrecer en tamaño

        // -----------------------------------------------------------------------------------------------------
        /*
         * COLECCIONES:
         * Son estructuras de datos que permiten almacenar y manipular grupos de objetos
         */

        ArrayList<String> arrayList = new ArrayList<>();// ArrayList: implementación de la interfaz List que permite
                                                        // almacenar elementos de forma dinámica

        HashMap<String, String> hashMap = new HashMap<>();// HashMap: implementación de la interfaz Map que permite
                                                          // almacenar pares clave-valor

        Map<String, String> map = new HashMap<>();// Map: interfaz que permite almacenar pares clave-valor

        Set<String> set = Set.of("Elemento 1", "Elemento 2", "Elemento 3");// Set: colección de elementos únicos que no
                                                                           // permite duplicados

        // -----------------------------------------------------------------------------------------------------
        /*
         * Clases de entrada y salida:
         * Son clases que permiten leer y escribir datos en diferentes formatos, como
         * archivos, consola, etc.
         * * Ejemplo: Scanner, PrintWriter, FileReader, FileWriter, BufferedReader,
         */

        Scanner scanner = new Scanner(System.in);// Scanner: clase que permite leer datos de entrada desde la consola
        System.out.println("Ingrese su nombre: ");

        String nombre = scanner.nextLine();// lee una línea de texto
        System.out.println("Hola " + nombre);

        // -----------------------------------------------------------------------------------------------------
        /*
         * Clases Perzonalizadas:
         * Son clases que se crean para representar objetos del mundo real, pueden tener
         * 
         * public class Persona{
         * String nombre;
         * int edad;
         * 
         * public Persona(String nombre, int edad) {
         * this.nombre = nombre;
         * this.edad = edad;
         * }
         * 
         * @Override
         * public String toString() {
         * return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
         * }
         * public String getNombre() {
         * return nombre;
         * }
         * }
         */

    }
}
