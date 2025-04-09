# To Array el los Strams

Es muy útil cuando necesitas `convertir` un stream en un `array` normal (T[]).

## 🧪 Ejemplo 1: Object[]
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana");

Object[] arreglo = nombres.stream().toArray();

System.out.println(Arrays.toString(arreglo)); // [Yoi, Pedro, Ana]
```

## 🧪 Ejemplo 2: String[] con lambda
```java
String[] arreglo = nombres.stream()
    .toArray(String[]::new);

System.out.println(Arrays.toString(arreglo)); // [Yoi, Pedro, Ana]
```


## 🧪 Ejemplo 3: Números cuadrados a Integer[]
```java
List<Integer> numeros = List.of(1, 2, 3, 4);

Integer[] cuadrados = numeros.stream()
    .map(n -> n * n)
    .toArray(Integer[]::new);

System.out.println(Arrays.toString(cuadrados)); // [1, 4, 9, 16]
```

