# Sorted en los Streams

`sorted()` sin argumentos → usa el `orden natural` (alfabético, numérico, etc.)

## 🧪 Ejemplo 1: sorted() simple (orden natural)
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler");

List<String> ordenados = nombres.stream()
    .sorted()
    .collect(Collectors.toList());

System.out.println(ordenados); // [Ana, Pedro, Tyler, Yoi]
```

## 🧪 Ejemplo 2: sorted() con números
```java
List<Integer> numeros = List.of(5, 2, 9, 1, 7);

List<Integer> ordenados = numeros.stream()
    .sorted()
    .collect(Collectors.toList());

System.out.println(ordenados); // [1, 2, 5, 7, 9]
```

## 🧪 Ejemplo 3: sorted() con Comparator (por longitud de string)
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler");

List<String> ordenados = nombres.stream()
    .sorted((a, b) -> a.length() - b.length())
    .collect(Collectors.toList());

System.out.println(ordenados); // [Ana, Yoi, Pedro, Tyler]
```

## 🧪 Ejemplo 4: Ordenar objetos personalizados
```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 23),
    new Persona("Pedro", 30),
    new Persona("Ana", 19)
);

List<Persona> ordenadas = personas.stream()
    .sorted(Comparator.comparing(Persona::getEdad))
    .collect(Collectors.toList());

ordenadas.forEach(p -> System.out.println(p.getNombre() + " - " + p.getEdad()));
```
**SALIDA**
```nginx
Ana - 19  
Yoi - 23  
Pedro - 30
```

---

## 🧠 También puedes:

### Invertir orden con .reversed()
```java
.sorted(Comparator.comparing(Persona::getEdad).reversed())
```

### Ordenar por múltiples criterios:
```java
.sorted(Comparator.comparing(Persona::getEdad).thenComparing(Persona::getNombre))
```