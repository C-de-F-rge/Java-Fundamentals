# AllMatch en los Streams

Devuelve `true si todos` los elementos del stream cumplen la condición que le pasas.
Si encuentra uno que no cumple, corta la ejecución y devuelve false.

## 🧪 Ejemplo básico

```java
List<String> nombres = List.of("Yoi", "Yamato", "Yuri");

boolean todosEmpiezanConY = nombres.stream()
    .allMatch(nombre -> nombre.startsWith("Y"));

System.out.println("¿Todos empiezan con Y? " + todosEmpiezanConY); // true

```

## 🧪 Ejemplo con números
```java
List<Integer> edades = List.of(20, 25, 30, 18);

boolean todosMayoresDeEdad = edades.stream()
    .allMatch(e -> e >= 18);

System.out.println("¿Todos son mayores de edad? " + todosMayoresDeEdad); // true

```