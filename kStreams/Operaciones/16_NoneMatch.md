# NoneMatch en los Streams

Devuelve `true si ningún` elemento del stream cumple la condición.
En cuanto encuentra uno que la cumpla...`¡devuelve false y corta!`

## 🧪 Ejemplo básico
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler");

boolean ningunoEmpiezaConZ = nombres.stream()
    .noneMatch(nombre -> nombre.startsWith("Z"));

System.out.println("¿Ninguno empieza con Z? " + ningunoEmpiezaConZ); // true
```

## 🧪 Otro ejemplo con números
```java
List<Integer> numeros = List.of(1, 3, 5, 7);

boolean ningunoPar = numeros.stream()
    .noneMatch(n -> n % 2 == 0);

System.out.println("¿Ninguno es par? " + ningunoPar); // true
```

## 😈 Y si hay uno que cumple...

```java
List<String> palabras = List.of("hola", "adiós", "Zorro");

boolean ningunZorro = palabras.stream()
    .noneMatch(p -> p.equalsIgnoreCase("zorro"));

System.out.println("¿No hay 'Zorro'? " + ningunZorro); // false
```