# FindAny en los Streams

`findAny()` devuelve cualquier elemento del stream.

## 🧠 Sintaxis
```java
Optional<T> resultado = stream.findAny();
```

## 🧪 Ejemplo normal (secuencial)
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler");

Optional<String> alguno = nombres.stream().findAny();

System.out.println("Elemento encontrado: " + alguno.orElse("Nada"));
// Output: Elemento encontrado: Yoi (en la mayoría de casos)
```

## 🚀 Ejemplo paralelo
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler", "Zuko", "Zara");

Optional<String> alguno = nombres.parallelStream().findAny();

System.out.println("Elemento paralelo: " + alguno.orElse("Nada"));
// Puede ser cualquiera: Yoi, Pedro, etc.
```
