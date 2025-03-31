# Finally en Java
El bloque finally se ejecuta siempre, haya o no una excepción. Se usa para cerrar
recursos como archivos, conexiones a BD, etc.

## ✅ Ejemplo con finally
```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("Este mensaje se ejecuta siempre.");
        }
    }
}
```

**Salida**
```sh
Resultado: 5  
Este mensaje se ejecuta siempre.
```

---

## ✅ Try sin Catch
OJO: Obligatoriamente debe llevar Finally o Catch, en este caso funciona
pero no se está manejando la excepción.
```java
public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            // Código que puede lanzar una excepción
            int result = 10 / 0; // Esto lanzará una ArithmeticException
            System.out.println("Este mensaje no se imprimirá porque se lanzará una excepción antes.");
        } finally {
            // Código que se ejecutará independientemente de si se lanza una excepción o no
            System.out.println("Este bloque finally siempre se ejecutará.");
        }

        System.out.println("Este mensaje tampoco se imprimirá porque la excepción no está manejada.");
    }
}
```

**Salida**
```sh
Este bloque finally siempre se ejecutará.
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at TryFinallyExample.main(TryFinallyExample.java:5)
```