## Throw en Java
El throw se usa para lanzar una excepción de forma manual cuando detectamos una situación no válida.

##✅ Ejemplo con throw
```java
public class ThrowExample {
    public static void main(String[] args) {
        validarEdad(15);
    }

    public static void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Edad insuficiente para registrarse.");
        }
        System.out.println("Registro exitoso.");
    }
}
```

**Salida**
```sh
Exception in thread "main" java.lang.IllegalArgumentException: Edad insuficiente para registrarse.
```