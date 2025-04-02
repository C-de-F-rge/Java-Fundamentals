# Modificador de Acceso Private en Java

El modificador **private** es el más restrictivo de todos. Solo permite
el acceso dentro de la misma clase.

## Variables
Se usa para encapsulación, evitando acceso directo desde fuera de la clase.

```java
public class Persona {
    private String nombre = "Zephir"; // Solo accesible dentro de esta clase

    public String getNombre() { // Método público para acceder
        return nombre;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        // System.out.println(p.nombre); // ❌ ERROR: "nombre" es private
        System.out.println(p.getNombre()); // ✅ Correcto, usando el getter
    }
}
```
