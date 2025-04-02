# Modificador de Comportamiento Final en Java

Sirve para indicar que una variable, método o clase no puede ser **modificada** o **sobrescrita**.

## Variables (final) → Constantes
Evita que la variable cambie su valor después de asignarla.

```java
public class Ejemplo {
    final int edad = 25; // 🔒 No se puede modificar

    public void cambiarEdad() {
        // edad = 30; // ❌ ERROR: No se puede reasignar
    }
}
```

---

## Constante Global
Si final se usa con static, la variable se convierte en una constante global.

```java
public class Config {
    public static final double PI = 3.1416; // 🔥 Constante global
}
```

La podremos utilizar en otras clases pero no será editable:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Config.PI); // ✅ Correcto
    }
}
```

---

## Métodos (final) → No se pueden sobrescribir (override)
Evita que un método sea modificado en una subclase.
```java
class Padre {
    final void mostrarMensaje() {
        System.out.println("Mensaje original");
    }
}

class Hija extends Padre {
    // ❌ ERROR: No se puede sobrescribir un método final
    // void mostrarMensaje() { 
    //     System.out.println("Mensaje cambiado");
    // }
}
```

---

## Clases (final) → No se pueden heredar
Evita que una clase sea extendida.
```java
final class Figura {
    void dibujar() {
        System.out.println("Dibujando...");
    }
}

// ❌ ERROR: No se puede heredar de una clase final
// class Circulo extends Figura { } 
```
