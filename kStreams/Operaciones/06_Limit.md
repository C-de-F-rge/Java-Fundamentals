# Limit en los Streams

Hora de darle con todo a `limit()` en Streams. Esta operación es 🔥 para quedarte solo con los primeros n elementos de un stream.

## 🧪 Ejemplo 1: Top 3 nombres
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler", "Mateo");

List<String> top3 = nombres.stream()
    .limit(3)
    .collect(Collectors.toList());

System.out.println(top3); // [Yoi, Pedro, Ana]
```

## 🧪 Ejemplo 2: Top 2 mayores (con sorted())
```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() { return edad; }
    public String getNombre() { return nombre; }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 23),
    new Persona("Pedro", 30),
    new Persona("Ana", 19),
    new Persona("Tyler", 25)
);

List<Persona> topMayores = personas.stream()
    .sorted(Comparator.comparing(Persona::getEdad).reversed())
    .limit(2)
    .collect(Collectors.toList());

topMayores.forEach(p -> System.out.println(p.getNombre() + " - " + p.getEdad()));
```

```nginx
Pedro - 30  
Tyler - 25
```