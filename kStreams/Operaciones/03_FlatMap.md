# FlatMap en los Streams

Mientras que map() transforma elementos individuales, flatMap() transforma cada elemento en una secuencia/stream y luego las aplana en un solo stream continuo.
📌 Ideal cuando tienes listas dentro de listas, o Streams dentro de Streams.

## Método
```java
<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
```

---

## 🟢 1. Aplanar listas de listas
```java
List<List<String>> listaDeListas = List.of(
    List.of("Yoi", "Pedro"),
    List.of("Ana", "Tyler")
);

List<String> todosLosNombres = listaDeListas.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());

System.out.println(todosLosNombres); // [Yoi, Pedro, Ana, Tyler]
```

---

## 🟢 2. Dividir frases en palabras
```java
List<String> frases = List.of(
    "Hola mundo",
    "Java es genial"
);

List<String> palabras = frases.stream()
    .flatMap(frase -> Arrays.stream(frase.split(" ")))
    .collect(Collectors.toList());

System.out.println(palabras); // [Hola, mundo, Java, es, genial]
```

---

## 🟢 3. FlatMap con objetos personalizados

```java
class Persona {
    private String nombre;
    private List<String> mascotas;

    public Persona(String nombre, List<String> mascotas) {
        this.nombre = nombre;
        this.mascotas = mascotas;
    }

    public List<String> getMascotas() {
        return mascotas;
    }
}

List<Persona> personas = List.of(
    new Persona("Yoi", List.of("Firulais", "Michi")),
    new Persona("Pedro", List.of("Rex"))
);

List<String> todasLasMascotas = personas.stream()
    .flatMap(persona -> persona.getMascotas().stream())
    .collect(Collectors.toList());

System.out.println(todasLasMascotas); // [Firulais, Michi, Rex]
```