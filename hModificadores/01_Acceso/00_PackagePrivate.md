# Modificador de Acceso PackageProtected (Default) en Java

Cuando defines una clase sin modificadores de acceso en Java,
significa que tiene acceso por defecto (o package-private).
Esto implica lo siguiente:

- Es solo accesible dentro del mismo paquete.
- No puede ser usada desde otros paquetes, aunque se intente importar.
- Los miembros (atributos y métodos) también son accesibles solo dentro del mismo paquete.

## 📌 Ejemplo de una clase sin modificador de acceso

```java
// Archivo: Main.java (MISMO PAQUETE)

class ClasePorDefecto {
    void mensaje() {
        System.out.println("Soy una clase con acceso por defecto.");
    }
}


public class Main {
    public static void main(String[] args) {
        ClasePorDefecto obj = new ClasePorDefecto();
        obj.mensaje(); // ¡Funciona porque está en el mismo paquete!
    }
}
```

🚫 Pero si intentamos acceder desde otro paquete, falla:

```java
// Archivo en OTRO paquete
import mi.paquete.ClasePorDefecto; // ❌ Error: No es accesible fuera del paquete

public class OtroPaquete {
    public static void main(String[] args) {
        ClasePorDefecto obj = new ClasePorDefecto(); // ❌ Error de compilación
    }
}
```


