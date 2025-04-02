# Modificador de Acceso Protected en Java

El modificador **protected** es más restringido que public, pero más
abierto que **private**. Permite el acceso dentro del mismo paquete y 
en subclases (herencia), incluso si están en otro paquete.

## Variables

```java
package paquete1;

public class ClasePadre {
    protected int edad = 30;
}
```

```java
package paquete1;

public class ClaseHija extends ClasePadre {
    public void mostrarEdad() {
        System.out.println("Edad: " + edad); // ✅ Acceso permitido
    }
}
```

---

## Métodos
Un método **protected** puede ser llamado dentro del mismo paquete
o desde una subclase en otro paquete.

```java
package paquete1;

public class ClasePadre {
    protected void mostrarMensaje() {
        System.out.println("Mensaje protegido");
    }
}
```

```java
package paquete2;
import paquete1.ClasePadre;

public class ClaseHija extends ClasePadre {
    public void usarMetodo() {
        mostrarMensaje(); // ✅ Se puede llamar porque ClaseHija hereda de ClasePadre
    }
}
```


