# Any Match en los Streams

Devuelve `true si algún` elemento del stream cumple la condición que le pasas en el predicado.
Tan pronto encuentra uno que lo cumpla, termina la evaluación (¡es eficiente!).

## 🧪 Ejemplo básico
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler");

boolean hayPedro = nombres.stream()
    .anyMatch(nombre -> nombre.equals("Pedro"));

System.out.println("¿Hay Pedro? " + hayPedro); // true
```

## 🧪 Ejemplo con números
```java
List<Integer> numeros = List.of(3, 5, 7, 9);

boolean hayPar = numeros.stream()
    .anyMatch(n -> n % 2 == 0);

System.out.println("¿Hay algún número par? " + hayPar); // false
```