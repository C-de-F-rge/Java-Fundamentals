# Deque en Java

Esta estructura permite la inserción y eliminación de elementos tanto al principio como al final de de la colección, ofreciendo una flexibilidad superior a las colas tradicionales.

## Métodos de Inserción para Deque

### AddFirst(E e)
Inserta un elemento al `principio` de la Deque, lanza una `Excepción` si la operacion no es posible.
```java
deque.addFirst("Yoi");
System.out.println(deque); // [Yoi]
```

### AddLast(E e)
Inserta el elemento especificado al `final` del Deque, lanza una `Excepción` si la operación no es posible.
```java
deque.addLast("Pedro");
System.out.println(deque); // [Yoi, Pedro]
```

### OfferFirst(E e)
Inserta un elemento al `principio` de la Deque, retorna `False` si la operación no es posible.
```java
deque.offerFirst("Tyler");
System.out.println(deque); // [Tyler, Yoi, Pedro]
```

### OfferLast(E e)
Inserta un elemento al `final` de la Deque, retorna `False` si la operación no es posible.
```java
deque.offerLast("Leo");
System.out.println(deque); // [Tyler, Yoi, Pedro, Leo]
```

---

## Métodos de Eliminación para Deque

### RemoveFirst()
Elimina el `primero` y lanza una `excepción` si está vacío.
```java
String primeroEliminado = deque.removeFirst();
System.out.println("Eliminado primero: " + primeroEliminado);
System.out.println(deque); // [Yoi, Pedro, Leo]
```

### RemoveLast()
Elimina el `ultimo` y lanza una `excepción` si está vacío.
```java
String ultimoEliminado = deque.removeLast();
System.out.println("Eliminado último: " + ultimoEliminado);
System.out.println(deque); // [Yoi, Pedro]
```

### PollFirst()
Elimina el `primero` y devuelve `null` si está vacío.
```java
String eliminado = deque.pollFirst();
System.out.println("Poll primero: " + eliminado);
System.out.println(deque); // [Pedro]
```

### PollLast()
Elimina el `ultimo` y devuelve `null` si está vacío.
```java
String eliminadoUltimo = deque.pollLast();
System.out.println("Poll último: " + eliminadoUltimo);
System.out.println(deque); // []
```

---

## Método de Consulta de Elementos para Deque

### GetFirst()
Devuelve el `primero` sin eliminar y lanza una `Excepción` si está vacío.
```java
deque.add("Yoi");
System.out.println("Primero con getFirst(): " + deque.getFirst()); // Yoi
```

### GetFirst()
Devuelve el `ultimo` sin eliminar y lanza una `Excepción` si está vacío.
```java
deque.add("Pedro");
System.out.println("Último con getLast(): " + deque.getLast()); // Pedro
```

### PeekFirst()
Devuelve el `primero` sin eliminar y devuelve `null` si está vacío.
```java
System.out.println("Peek primero: " + deque.peekFirst()); // Yoi
```

### GetFirst()
Devuelve el `ultimo` sin eliminar y devuelve `null` si está vacío.
```java
System.out.println("Peek último: " + deque.peekLast()); // Pedro
```

---

## Ejemplo de Uso de Deque

```java
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> colaClientes = new LinkedList<>();

        // Clientes normales entran por el final
        colaClientes.addLast("Cliente1");
        colaClientes.addLast("Cliente2");

        // Cliente VIP entra por el frente
        colaClientes.addFirst("VIP1");

        // Otro cliente normal
        colaClientes.addLast("Cliente3");

        // Otro VIP
        colaClientes.addFirst("VIP2");

        // Mostramos el estado actual de la cola
        System.out.println("Cola actual: " + colaClientes); 
        // Resultado: [VIP2, VIP1, Cliente1, Cliente2, Cliente3]

        // Atendiendo clientes desde el frente
        while (!colaClientes.isEmpty()) {
            String atendido = colaClientes.removeFirst();
            System.out.println("Atendiendo a: " + atendido);
        }
    }
}
```