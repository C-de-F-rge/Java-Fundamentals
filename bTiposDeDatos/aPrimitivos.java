package bTiposDeDatos;

public class aPrimitivos {
    public static void main(String[] args) {

        /*
         * Tipos de datos primitivos en Java:
         * Son aquellos que aceptan un unico valor, suelen manejar valores simples
         * manejan un almacenamiento de tipo STACK lo cual permite tener un flujo
         * rapido de datos de entrada y salida al ser de tipo LIFO
         */

        byte b = 10;// byte: 8 bits, -128 a 127

        short s = 1000;// short: 16 bits, -32,768 a 32,767

        int i = 100000;// int: 32 bits, -2,147,483,648 a 2,147,483,647

        long l = 10000000000L;// long: 64 bits, -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

        float f = 10.5f;// float: 32 bits, -3.40282347E+38 a 3.40282347E+38

        double d = 10.5;// double: 64 bits, -1.79769313486231570E+308 a 1.79769313486231570E+308

        char c = 'A';// char: 16 bits, 0 a 65,535 (Unicode)

        boolean bool = true;// boolean: true o false

    }
}
