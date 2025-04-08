# Queue en Java

Es una estructura de datos en la cual se insertan elementos al final y se eliminan desde el frente.

## Método para Queue

### Add(E e)
Inaserta un elemento en la cola, si la operación es exitosa devuelve `true` y si falla devuelve una `excepción`.

```java
boolean bool = cola.add("Yoi");
System.out.println(bool); // True

cola.add("Pedro");
cola.add("Tyler");
System.out.println(cola); // [Yoi, Pedro, Tyler]
```

### Offer(E e)
afrefa un elemento y si falla devuelve `false`

```java
boolean exito = cola.offer("Leo");
System.out.println("¿Se agregó? " + exito); // true
System.out.println(cola); // [Yoi, Pedro, Tyler, Leo]
```

### Remove()
Elimina y devuelve el primer elemento, lanza una excepción si está está vacía.

```java
String eliminado = cola.remove();
System.out.println("Eliminado: " + eliminado); // Yoi
System.out.println(cola); // [Pedro, Tyler, Leo]
```

### Poll()
Elimina y devuelve el primer elemento, devuelve `null` si está vacio.

```java
String siguiente = cola.poll();
System.out.println("Eliminado con poll(): " + siguiente); // Pedro
System.out.println(cola); // [Tyler, Leo]
```

---

## Ejemplo de Queue en Java

```java
import java.util.Queue;
import java.util.LinkedList;

public class EjemploQueue {
    public static void main(String[] args) {
        // Crear una cola de tipo LinkedList
        Queue<String> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        // Mostrar la cola
        System.out.println("Cola después de añadir elementos: " + cola);

        // Consultar el primer elemento sin eliminarlo
        String primerElemento = cola.peek();
        System.out.println("Primer elemento (peek): " + primerElemento);

        // Eliminar y obtener el primer elemento
        String elementoEliminado = cola.poll();
        System.out.println("Elemento eliminado (poll): " + elementoEliminado);

        // Mostrar la cola después de la eliminación
        System.out.println("Cola después de poll: " + cola);

        // Intentar eliminar todos los elementos
        while (!cola.isEmpty()) {
            System.out.println("Eliminando: " + cola.poll());
        }

        // Verificar el estado de la cola
        System.out.println("¿La cola está vacía? " + cola.isEmpty());
    }
}
```