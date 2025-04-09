# Distinct en los Streams

`distinct()` **elimina** elementos **duplicados** en un Stream. Se basa en el método `equals()` de los objetos para saber si son iguales.

## 🔧 Ejemplo con Strings:

```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Pedro", "Yoi");

List<String> sinDuplicados = nombres.stream()
    .distinct()
    .collect(Collectors.toList());

System.out.println(sinDuplicados); // [Yoi, Pedro, Ana]
```

---

## 🔧 Ejemplo con objetos personalizados:

```java
class Persona {
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    // equals y hashCode basados en el ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona p = (Persona) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
```

### 🧪 Ejemplo:
```java
List<Persona> personas = List.of(
    new Persona(1, "Yoi"),
    new Persona(2, "Yoi"),
    new Persona(1, "Yoi")
);

List<Persona> resultado = personas.stream()
    .distinct()
    .collect(Collectors.toList());

resultado.forEach(p -> System.out.println(p.getNombre() + " (ID: " + p.id + ")"));
```
**SALIDA:**
```less
Yoi (ID: 1)
Yoi (ID: 2)
```

### 🔁 ¿Y si solo quieres evitar duplicados por nombre?

```java
List<String> nombresUnicos = personas.stream()
    .map(Persona::getNombre)
    .distinct()
    .collect(Collectors.toList());

System.out.println(nombresUnicos); // [Yoi]
```