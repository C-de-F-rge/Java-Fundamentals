# Modificador de Acceso Private en Java

El modificador **private** es el más restrictivo de todos. Solo permite
el acceso dentro de la misma clase.

## Variables
Se usa para encapsulación, evitando acceso directo desde fuera de la clase.
aqui vamos a requerir de setters y getters par lograr interactuar con la 
información dentro de las clases.

```java
public class Persona {
    private String nombre = "Zephir"; // Solo accesible dentro de esta clase

    public String getNombre() { // Método público para acceder
        return nombre;
    }
}
```

**Ejemplo de Manejo:**
```java
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        // System.out.println(p.nombre); // ❌ ERROR: "nombre" es private
        System.out.println(p.getNombre()); // ✅ Correcto, usando el getter
    }
}
```

---

## Métodos 
Métodos private solo pueden ser usados dentro de la misma clase.
```java
public class Calculadora {
    private int sumar(int a, int b) {
        return a + b;
    }

    public int calcularSuma(int x, int y) {
        return sumar(x, y); // ✅ Se puede llamar dentro de la misma clase
    }
}
```

**Ejemplo de Manejo:**
```java
public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        // c.sumar(2,3); // ❌ ERROR: Método privado
        System.out.println(c.calcularSuma(2, 3)); // ✅ Correcto
    }
}
```
---

## Constructores
Un constructor private impide que la clase sea instanciada desde fuera.
```java
public class Singleton {
    private static Singleton instancia;

    private Singleton() { } // 🔒 Solo esta clase puede instanciarse

    public static Singleton getInstancia() { // Patrón Singleton
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
```

**Ejemplo de Manejo:**
```java
public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); // ❌ ERROR: Constructor privado
        Singleton obj = Singleton.getInstancia(); // ✅ Correcto
    }
}
```

---

## Clases Internas
No se puede usar private en clases normales, pero sí en clases dentro de otras clases.

```java
public class Externa {
    private class Interna {
        void mensaje() {
            System.out.println("Soy una clase interna privada");
        }
    }

    public void mostrarMensaje() {
        Interna obj = new Interna();
        obj.mensaje(); // ✅ Se puede acceder dentro de la clase Externa
    }
}
```