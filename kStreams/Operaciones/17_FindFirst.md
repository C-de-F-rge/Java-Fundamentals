# FindFirst en los Streams

`findFirst()` busca y devuelve el primer elemento del stream (según el orden de aparición).
✅ Es una operación terminal y devuelve un `Optional<T>`.

## 🧠 Sintaxis
💡 Como devuelve un `Optional`, puedes usar `.get(), .orElse(), .ifPresent()...`

```java
Optional<T> resultado = stream.findFirst();
```

---

## 🧪 Ejemplo básico
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler");

Optional<String> primero = nombres.stream().findFirst();

primero.ifPresent(p -> System.out.println("El primero es: " + p)); 
// Output: El primero es: Yoi
```

## 🔍 Con filtro previo
```java
List<String> nombres = List.of("Zuko", "Pedro", "Zara", "Zelda");

Optional<String> zConZ = nombres.stream()
    .filter(n -> n.startsWith("Z"))
    .findFirst();

System.out.println("Primero con Z: " + zConZ.orElse("Ninguno"));
// Output: Primero con Z: Zuko
```

## 🧪 Tip: uso con .map() y otros
```java
List<String> animales = List.of("Tigre", "León", "Jaguar");

String enMayus = animales.stream()
    .map(String::toUpperCase)
    .findFirst()
    .orElse("Sin animales");

System.out.println(enMayus); // TIGRE
```