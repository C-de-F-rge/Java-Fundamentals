## java.lang
**Versión:** _JDK 1.0_

La librería _java.lang_ se incluye de manera automática en todos los programas Java.
Esta contiene clses esenciales como las (Clases [(Envolventes)](..\cClasesEnvolventes\aCLASES_ENVOLVENTES.md)), la clase Math, System y algunas Excepciones cómo **Exception, RuntimeException, etc**.

---

# 1. Manejo de Cadenas (_String_)
**java.lang.String**

```java
public class StringExample {
    public static void main(String[] args) {
        String mensaje = "Hola, Mundo!";
        System.out.println("Longitud: " + mensaje.length());
        System.out.println("Mayúsculas: " + mensaje.toUpperCase());
        System.out.println("¿Contiene 'Mundo'? " + mensaje.contains("Mundo"));
    }
}
```
**OUTPUT:**
```bash
Longitud: 10  
Mayúsculas: HOLA, Mundo!  
¿Contiene 'Mundo'? true  
```

---

# 2. Conversión de Tipos Primitivos (_Wrapper Classes_)
**Interger, Double, Boolean**

```java
public class WrapperExample {
    public static void main(String[] args) {
        int numero = Integer.parseInt("100"); // Convertir String a int
        double precio = Double.valueOf("9.99"); // Convertir String a Double

        System.out.println("Número: " + numero);
        System.out.println("Precio: " + precio);
    }
}
```

---

# 3. Manejo de Errores (_Exception y RuntimeException_)

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto generará una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
```
**OUTPUT:**
```bash
Error: División por cero no permitida.
```

---

# 4. Manejo de Hilos (_Thread_)
**java.lang.thread**

```java
public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución...");
    }

    public static void main(String[] args) {
        ThreadExample hilo = new ThreadExample();
        hilo.start(); // Iniciar hilo
    }
}
```
**OUTPUT:**
```bash
Hilo en ejecución...
```

---

# 5. Gestión de Memoria (_System.gc() y Runtime_)
**System, Runtime**

```java
public class SystemExample {
    public static void main(String[] args) {
        System.out.println("Tiempo actual en milisegundos: " + System.currentTimeMillis());
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria disponible: " + runtime.freeMemory());
    }
}
```

---

# 6. Comparaciones y Operaciones Matemáticas (_Math_)
**java.lang.Math**

```java
public class MathExample {
    public static void main(String[] args) {
        System.out.println("Máximo entre 10 y 20: " + Math.max(10, 20));
        System.out.println("Raíz cuadrada de 16: " + Math.sqrt(16));
        System.out.println("Número aleatorio: " + Math.random()); // Entre 0.0 y 1.0
    }
}
```
