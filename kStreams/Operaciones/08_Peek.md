# Peek en los Streams

Este método es como ese amiguito chismoso del Stream: no cambia nada, pero le gusta mirar lo que pasa. 🧐🔍

## 🧪 Ejemplo 1: Ver el proceso mientras se filtra

```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler");

List<String> filtrados = nombres.stream()
    .peek(n -> System.out.println("Original: " + n))
    .filter(n -> n.length() > 3)
    .peek(n -> System.out.println("Filtrado: " + n))
    .collect(Collectors.toList());

System.out.println("Resultado final: " + filtrados);
```

```yaml
Original: Yoi
Original: Pedro
Filtrado: Pedro
Original: Ana
Original: Tyler
Filtrado: Tyler
Resultado final: [Pedro, Tyler]
```

---

## 🧪 Ejemplo 2: Debug de objetos

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

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 23),
    new Persona("Pedro", 30),
    new Persona("Ana", 19)
);

List<Persona> mayores = personas.stream()
    .peek(p -> System.out.println("Antes del filtro: " + p))
    .filter(p -> p.getEdad() >= 21)
    .peek(p -> System.out.println("Después del filtro: " + p))
    .collect(Collectors.toList());

System.out.println("Mayores" + mayores);
```

```yaml
Antes del filtro: Yoi (23)
Después del filtro: Yoi (23)
Antes del filtro: Pedro (30)
Después del filtro: Pedro (30)
Antes del filtro: Ana (19)
Mayores: [Yoi (23), Pedro (30)]
```


