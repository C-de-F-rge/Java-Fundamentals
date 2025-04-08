# Las Expresiones Lamda en Java

Las Lamda son una forma de representar `Funciones Anónimas` (Sin nombre). Estas pueden recivir parámetros al igual que los métodos y usar para simplificar código.

## Sintaxis de Las Lamdas

```java
(parámetros) -> { cuerpo }
```

### Ejemplo 
```java
() -> {System.out.println("Hola, mundo"); };               // sin parámetros
(x) -> {x * x};                                            // un parámetro sin paréntesis
(a, b) -> {a + b};                                         // múltiples parámetros
```

---

## Donde Usar Lamdas
Principalmente en interfaces funcionales, como:

### Runnable (hilo de ejecución)
```java
Runnable tarea = () -> {System.out.println("Ejecutando hilo...")};
new Thread(tarea).start();

```

### Comparator (comparar elementos)
```java
List<String> nombres = List.of("Pedro", "Ana", "Yoi");
List<String> listaOrdenada = new ArrayList<>(nombres);

listaOrdenada.sort((a, b) -> {a.compareTo(b)}); // orden alfabético

System.out.println(listaOrdenada);
```

### Predicate (devuelve booleano)
```java
Predicate<String> esLargo = (texto) -> {texto.length() > 5;};

System.out.println(esLargo.test("Hola"));     // false
System.out.println(esLargo.test("Bienvenido"));// true
```

### Function (transformar datos)
```java
Function<String, Integer> longitud = (texto) -> {texto.length();};

System.out.println(longitud.apply("Yoi"));   // 3
System.out.println(longitud.apply("Pedro")); // 5
```

### Consumer (consume un dato y hace algo)
```java
Consumer<String> imprimir = (nombre) -> {System.out.println("Hola, " + nombre);};

imprimir.accept("Yoi");  // Hola, Yoi
```

---

## ¡Y en APIs como Streams!
```java
List<String> nombres = List.of("Pedro", "Ana", "Yoi", "Tyler");

nombres.stream()
    .filter(nombre -> nombre.length() > 3)        // Predicate
    .map(nombre -> nombre.toUpperCase())          // Function
    .forEach(nombre -> System.out.println(nombre)); // Consumer
```
