# Modificador de comportamiento Static en Java

**static** es un modificador que hace que un atributo, método o bloque
pertenezca a la clase en lugar de a las instancias (objetos).

## Variables
Una variable **static** es compartida por todas las instancias de la clase.

```java
class Ejemplo {
    static int contador = 0; // Variable estática

    Ejemplo() {
        contador++; // Se incrementa en cada instancia
    }

    void mostrarContador() {
        System.out.println("Contador: " + contador);
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo obj1 = new Ejemplo();
        Ejemplo obj2 = new Ejemplo();
        
        obj1.mostrarContador(); // Contador: 2
        obj2.mostrarContador(); // Contador: 2
    }
}
```

---

## static en Métodos
Un método **static** pertenece a la clase y puede llamarse sin instanciar objetos.

```java
class Utilidad {
    static void mostrarMensaje() {
        System.out.println("¡Hola, soy un método estático!");
    }
}

public class Main {
    public static void main(String[] args) {
        Utilidad.mostrarMensaje(); // ✅ No necesitamos crear un objeto
    }
}
```

---

## NOTA:
✔ Nota: Un método static NO puede acceder a atributos o métodos de instancia directamente.

❌ Esto da error:

```java
class Prueba {
    int numero = 10; // Variable de instancia

    static void metodoEstatico() {
        System.out.println(numero); // ❌ ERROR: No se puede acceder a una variable de instancia desde un método estático
    }
}
```

---

## static en Bloques
Los bloques **static** se ejecutan UNA VEZ cuando la clase se carga en memoria.

```java
class Ejemplo {
    static {
        System.out.println("Bloque estático ejecutado.");
    }

    Ejemplo() {
        System.out.println("Constructor ejecutado.");
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo obj1 = new Ejemplo();
        Ejemplo obj2 = new Ejemplo();
    }
}
```

**SALIDA:**
```cpp
Bloque estático ejecutado.  // ✅ Se ejecuta solo una vez
Constructor ejecutado.       // ✅ Se ejecuta por cada objeto creado
Constructor ejecutado.
```

---

## static en Clases Internas
 Solo las clases internas pueden ser **static**, no las clases normales.

 ```java
 class Externa {
    static class Interna {
        void mostrar() {
            System.out.println("Clase interna estática.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Externa.Interna obj = new Externa.Interna();
        obj.mostrar();
    }
}
```