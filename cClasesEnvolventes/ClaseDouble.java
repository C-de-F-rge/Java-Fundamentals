package cClasesEnvolventes;

public class ClaseDouble {

    /*
     * Constantesde la clase Double:
     */
    private static final double MIN_VALUE = Double.MIN_VALUE; // valor minimo de un double 4.9E-324
    private static final double MAX_VALUE = Double.MAX_VALUE; // valor maximo de un double 1.7976931348623157E308
    private static final int SIZE = Double.SIZE; // tamaño de un double en bits 64
    private static final int BYTES = Double.BYTES; // tamaño de un double en bytes 8
    private static final double NaN = Double.NaN; // valor no numerico
    private static final double POSITIVE_INFINITY = Double.POSITIVE_INFINITY; // infinito positivo
    private static final double NEGATIVE_INFINITY = Double.NEGATIVE_INFINITY; // infinito negativo

    /*
     * Métodos de Creación y Conversión:
     */
    // valueOf(double d): devuelve un objeto Double que representa el double d
    private static Double num1 = Double.valueOf(10.0); // convierte un double a un Double
    // valueOf(String s): devuelve un objeto Double que representa el double s
    private static Double num2 = Double.valueOf("10.0"); // convierte una cadena a un Double
    // parseDouble(String s): convierte una cadena a un double
    private static double num3 = Double.parseDouble("10.0"); // convierte una cadena a un double
    // toString(): convierte un double a una cadena
    private static String num4 = Double.toString(10.0); // convierte un double a una cadena
    // doubleValue(): convierte un Double a un double
    private static double num7 = num1.doubleValue(); // convierte un Double a un double
    // intValue(): convierte un Double a un int
    private static int num8 = num1.intValue(); // convierte un Double a un int

    // toHexString(double d): convierte un double a una cadena hexadecimal
    private static String num5 = Double.toHexString(10.0); // convierte un double a una cadena hexadecimal

    // toBinaryString(double d): convierte un double a una cadena binaria
    private static String num6 = Long.toBinaryString(Double.doubleToLongBits(10.0));
    // convierte un double a una cadena binaria

    /*
     * Métodos de Comparación:
     */
    // equals(Object obj): compara dos doubles y devuelve true si son iguales
    private static boolean num9 = num1.equals(num2); // los doubles son iguales

    // compare(double x, double y): compara dos doubles y devuelve un entero
    // negativo,
    // cero o positivo si el double x es menor, igual o mayor que el double y
    private static int num10 = Double.compare(10.0, 20.0); // comparacion de doubles

    // devuelve -1 si el double x es menor que el double y, 0 si son iguales y 1 si
    // el
    // double x es mayor que el double y
    // compareTo(Double anotherDouble): compara dos doubles y devuelve un entero
    // negativo, cero o positivo si el double es menor, igual o mayor que el otro
    private static int num11 = num1.compareTo(num2); // comparacion de doubles
    // devuelve -1 si el double es menor que el otro, 0 si son iguales y 1 si el
    // double

    /*
     * Métodos de Matemáticos:
     */

    // sum(double a, double b): suma dos doubles y devuelve el resultado
    private static double num12 = Double.sum(10.0, 20.0); // suma de doubles

    // max(double a, double b): devuelve el mayor de dos doubles
    private static double num13 = Double.max(10.0, 20.0); // mayor de dos doubles

    // min(double a, double b): devuelve el menor de dos doubles
    private static double num14 = Double.min(10.0, 20.0); // menor de dos doubles

    /*
     * Métodos para Propiedades Especiales:
     */

    // isNaN(double d): devuelve true si el double es NaN (no numerico)
    private static boolean num15 = Double.isNaN(NaN); // el double es NaN (no numerico)

    // isInfinite(double d): devuelve true si el double es infinito
    private static boolean num16 = Double.isInfinite(POSITIVE_INFINITY); // el double es infinito

    // isFinite(double d): devuelve true si el double es finito
    private static boolean num17 = Double.isFinite(10.0); // el double es finito

}
