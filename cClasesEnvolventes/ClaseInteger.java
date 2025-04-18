package cClasesEnvolventes;

public class ClaseInteger {
        /*
         * Constantes de la clase Integer:
         */
        private static final int MIN_VALUE = Integer.MIN_VALUE; // valor minimo de un entero 2147483648
        private static final int MAX_VALUE = Integer.MAX_VALUE; // valor maximo de un entero -2147483647
        private static final int SIZE = Integer.SIZE; // tamaño de un entero en bits 32
        private static final int BYTES = Integer.BYTES; // tamaño de un entero en bytesx 4

        public static void main(String[] args) {
                // Crear un objeto Integer
                Integer num1 = 10; // numero entero
                Integer num2 = new Integer(10); // numero entero

                /*
                 * Clase Integer:
                 * Es una clase que representa un numero entero, es inmutable;
                 * es decir, una vez creado no se puede modificar.
                 * A continuacion se presentan algunos metodos de la clase Integer:
                 */

                // --------------------------------------------------------------------------------------------------

                /*
                 * Métodos de Creación y Conversión:
                 */
                // valueOf(int i): devuelve un objeto Integer que representa el entero i
                Integer num6 = Integer.valueOf(10); // convierte un int a un Integer

                // valueOf(String s): devuelve un objeto Integer que representa el entero s
                Integer num3 = Integer.valueOf("10"); // convierte una cadena a un entero

                // parseInt(String s): convierte una cadena a un entero
                Integer num8 = Integer.parseInt(null); // convierte una cadena a un entero
                Integer num10 = Integer.parseInt("10.0"); // convierte una cadena a un entero

                // tostring(): convierte un entero a una cadena
                String num4 = num1.toString(); // convierte un entero a una cadena
                String num5 = Integer.toString(10); // convierte un entero a una cadena

                // toBinaryString(int i): convierte un entero a una cadena binaria
                String num7 = Integer.toBinaryString(10); // convierte un entero a una cadena binaria

                // toHexString(int i): convierte un entero a una cadena hexadecimal
                String num9 = Integer.toHexString(10); // convierte un entero a una cadena hexadecimal

                // toOctalString(int i): convierte un entero a una cadena octal
                String num11 = Integer.toOctalString(10); // convierte un entero a una cadena octal

                /*
                 * Método de Comparación:
                 */

                // compare(int x, int y): compara dos enteros y devuelve un entero negativo,
                // cero o positivo si el entero x es menor, igual o mayor que el entero y
                System.out.println("Comparacion de enteros: " + Integer.compare(10, 20)); // comparacion de enteros
                // devuelve -1 si el entero x es menor que el entero y, 0 si son iguales y 1 si
                // el

                // compareTo(Integer anotherInteger): compara dos enteros y devuelve un entero
                // negativo, cero o positivo si el entero es menor, igual o mayor que el otro
                System.out.println("Comparacion de enteros: " + num1.compareTo(num2)); // comparacion de enteros

                // equals(Object obj): compara dos enteros y devuelve true si son iguales
                System.out.println("Los enteros son iguales: " + num1.equals(num2)); // los enteros son iguales
                // devuelve true si son iguales y false si son diferentes

                /*
                 * Métodos de Operaciones Matemáticas:
                 */

                // Max(int a, int b): devuelve el mayor de dos enteros
                System.out.println("Mayor de dos enteros: " + Integer.max(10, 20)); // mayor de dos enteros

                // Min(int a, int b): devuelve el menor de dos enteros
                System.out.println("Menor de dos enteros: " + Integer.min(10, 20)); // menor de dos enteros

                // sum(int a, int b): devuelve la suma de dos enteros
                System.out.println("Suma de dos enteros: " + Integer.sum(10, 20)); // suma de dos enteros

                // divideUnsigned(int dividend, int divisor): devuelve el cociente de dos
                // enteros sin signo
                System.out.println("Cociente de dos enteros sin signo: " + Integer.divideUnsigned(10, 20)); // cociente
                                                                                                            // de dos
                                                                                                            // enteros
                                                                                                            // sin signo

                // remainderUnsigned(int dividend, int divisor): devuelve el resto de dos
                // enteros sin signo
                System.out.println("Resto de dos enteros sin signo: " + Integer.remainderUnsigned(10, 20)); // resto de
                                                                                                            // dos
                                                                                                            // enteros
                                                                                                            // sin signo

                /*
                 * Métodos de Representación Binaria:
                 */

                // bitCount(int i): devuelve el número de bits que son 1 en la representación
                // binaria de un entero
                System.out
                                .println("Numero de bits que son 1 en la representacion binaria de un entero: "
                                                + Integer.bitCount(10));
                // numero de bits que son 1 en la representacion binaria de un entero

                // highestOneBit(int i): devuelve un entero con el bit más alto establecido en 1
                // y todos los demás bits establecidos en 0
                System.out.println(
                                "Bit mas alto establecido en 1 y todos los demas bits establecidos en 0: "
                                                + Integer.highestOneBit(10));
                // bit mas alto establecido en 1 y todos los demas bits establecidos en 0

                // lowestOneBit(int i): devuelve un entero con el bit más bajo establecido en 1
                // y todos los demás bits establecidos en 0
                System.out.println(
                                "Bit mas bajo establecido en 1 y todos los demas bits establecidos en 0: "
                                                + Integer.lowestOneBit(10));
                // bit mas bajo establecido en 1 y todos los demas bits establecidos en 0

                // numberOfLeadingZeros(int i): devuelve el número de ceros a la izquierda en la
                System.out.println(
                                "Numero de ceros a la izquierda en la representacion binaria de un entero: "
                                                + Integer.numberOfLeadingZeros(10));
                // numero de ceros a la izquierda en la representacion binaria de un entero

                // numberOfTrailingZeros(int i): devuelve el número de ceros a la derecha en la
                System.out.println(
                                "Numero de ceros a la derecha en la representacion binaria de un entero: "
                                                + Integer.numberOfTrailingZeros(10));
                // numero de ceros a la derecha en la representacion binaria de un entero

        }

}
