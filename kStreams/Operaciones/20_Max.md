# Max enlos Streams

El método `max()` devuelve el mayor elemento del stream según un Comparator.
También es una operación terminal y devuelve un `Optional<T>`.

## 🔧 Sintaxis
```java
Optional<T> resultado = stream.max(Comparator);
```

## 🧪 Ejemplo 1: Con números
```java
List<Integer> numeros = List.of(4, 8, 15, 2, 23, 42);

Optional<Integer> mayor = numeros.stream()
    .max(Integer::compareTo);

System.out.println("El número más grande es: " + mayor.orElse(-1));
// Output: El número más grande es: 42
```

## 🧪 Ejemplo 2: Con objetos (por edad)

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 26),
    new Persona("Pedro", 30),
    new Persona("Tyler", 22)
);

Optional<Persona> mayor = personas.stream()
    .max(Comparator.comparing(p -> p.edad));

mayor.ifPresent(p -> System.out.println("El mayor es: " + p));
// Output: El mayor es: Pedro (30)
```