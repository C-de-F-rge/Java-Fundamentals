# Estructuras de Tipo Stack en Java

Las estructuras stack funcionan mediante objetos de tipo `LIFO` (Last-in First-out).

## Métodos para Stack

### Push(E e)
Agrega un elemento al `tope`.
```java
stack.push("Joe Doe");
stack.push("Dante-Dev");
stack.push("Tyler");
```

### Pop()
`Elimina` y `retorna` el elemento del `tope`.
```java
String nombre = stack.pop();
System.out.println(nombre); // Devuelve el Eliminado: Tyler
```

### Peek()
Retorna el `tope` sin eliminarlo.
```java
System.out.println(stack.push()); // Devuelve: Dante-Dev
```

### IsEmpty()
`verifica` si está vacía.
```java
boolean bool = stack.isEmpty();
System.out.println(bool); // devuelve: False - porque no está vacía.
```

---

## Ejemplo de Uso para Stack.

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");
        
        System.out.println("Contenido de la pila: " + pila);
        
        // Sacamos el último agregado (último plato puesto)
        System.out.println("Plato retirado: " + pila.pop());  // Plato 3
        System.out.println("Contenido de la pila después de pop: " + pila);
        
        // Solo ver el último sin eliminarlo (pico el plato superior)
        System.out.println("Plato superior (peek): " + pila.peek());  // Plato 2
    }
}
```