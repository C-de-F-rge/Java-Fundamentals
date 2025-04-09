# Reduce en los Streams

reduce() reduce (valga la redundancia 😄) todos los elementos del stream a un solo resultado, combinándolos de forma acumulativa, usando una expresión lambda o función binaria.

## 🧩 Formas comunes de reduce()

| **Forma** | **Descripción** |
|--------------------------|--------------------|
| `Optional<T> reduce(BinaryOperator<T> acumulador)` | Devuelve un `Optional` porque <br> puede que el stream esté vacío |
| `T reduce(T identidad, BinaryOperator<T> acumulador)` | Usa un valor inicial (`identidad`) |
| `<U> U reduce(U identidad, BiFunction<U,? super` <br> `T,U> acumulador, BinaryOperator<U> combiner)` | Para operaciones paralelas avanzadas |

---

## 🧪 Ejemplo 1: Sumar números

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);

// Sin identidad -> devuelve Optional
Optional<Integer> suma = numeros.stream()
    .reduce((a, b) -> a + b);

suma.ifPresent(System.out::println); // 15
```

## 🧪 Ejemplo 2: Sumar con identidad
✅ `0` es el valor identidad, como decir: "empieza en 0".

```java
int resultado = numeros.stream()
    .reduce(0, (a, b) -> a + b);

System.out.println(resultado); // 15
```

## 🧪 Ejemplo 3: Multiplicar

```java
int producto = numeros.stream()
    .reduce(1, (a, b) -> a * b);

System.out.println(producto); // 120
```

## 🧪 Ejemplo 4: Concatenar strings
```java
List<String> palabras = List.of("Hola", "amigo", "mío");

String frase = palabras.stream()
    .reduce("", (a, b) -> a + " " + b);

System.out.println(frase.trim()); // Hola amigo mío
```
