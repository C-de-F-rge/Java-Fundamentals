# Min en los Streams

El método `min()` es una operación terminal que devuelve el menor elemento del stream, según un comparador.

## 🧠 Sintaxis
```java
Optional<T> resultado = stream.min(Comparator);
```
## 🧪 Ejemplo 1: Números

```java
List<Integer> numeros = List.of(8, 2, 5, 1, 10);

Optional<Integer> minimo = numeros.stream()
    .min(Integer::compareTo);

System.out.println("El mínimo es: " + minimo.orElse(-1));
// Output: El mínimo es: 1
```