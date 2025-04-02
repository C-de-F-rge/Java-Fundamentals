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
Las clases abstractas a diferencia de las Interfaces no obligan a implementar
los métodos de esta **a no ser que estos sean abstractos** la estructura de esta
es la siguiente.

```java
// Clase abstracta
public abstract class Vehiculo {
    abstract void mover();  // Método abstracto

    public void frenar() { 
        System.out.println("El vehículo está frenando.");
    }
}
```
---

Recuerda que la clase abstracta puede tener además métodos abstractos
los cuales si serán obligatorios de sobre escribir un ejemplo para 
comprender mejor.

**Ejemplo de Métodos Abstractos**
```java
abstract class Ave {
    abstract void hacerSonido(); // Obligatorio implementarlo en subclases

    public void volar() { // No es obligatorio sobrescribirlo, ya tiene código
        System.out.println("Esta ave está volando.");
    }
}

class Gallina extends Ave {
    @Override
    void hacerSonido() {
        System.out.println("La gallina dice: ¡Cluck cluck!");
    }
}
```
