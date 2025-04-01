# Las Clases en Java

Las clases representan las entidades principales de tu aplicación.
Pueden ser clases concretas o clases abstractas.

## Clase Concreta

```java
public class Coche {
    private String marca;   //Parametro

    public Coche(String marca) {//Constructor
        this.marca = marca;
    }

    public void mover() { // Método
        System.out.println("El coche está moviendo.");
    }
}
```

---

## Clase Abstracta

```java
// Clase abstracta
public abstract class Vehiculo {
    abstract void mover();  // Método abstracto

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }
}
```