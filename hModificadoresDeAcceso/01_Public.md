# Modificador de Acceso Public en Java

**public** es el modificador de acceso más abierto en Java. Permite
que cualquier otra clase, dentro o fuera del paquete, acceda al elemento que lo tenga.

## En Clases
Hace que las clases sean visibles dentro y fuera del mismo paquete, haciendolas
accesibles desde cualquier parte del código.

```java
public class MiClase{
    //Código...
}
```

---

# En Métodos
Hace que el método pueda ser llamado desde cualquier parte.

```java
public class MiClase{
    public void mostrarMetodo(){
        System.out.println("Hola, Mundo");
    }
}
```

### Ejemplo de Acceso a otra clase:
```java
MiClase obj = new MiClase();
obj.mostrarMetodo(); //Se puede llamar sin restricciones.
```

---

## Variables

```java
public class MiClase{
    public int numero = 10; //Cualquiera puede acceder y Modificar
}
```

---

## Constructores
Hace que el constructor pueda ser llamado desde cualquier
parte para crear objetos.

```java
public class MiClase {
    public MiClase() { 
        System.out.println("Constructor público");
    }
}
```

## Interfaces
Todas las interfaces en Java son public por defecto, pero
puedes declararlas explícitamente.

```java
public interface MiInterfaz {
    void metodo();
}
```