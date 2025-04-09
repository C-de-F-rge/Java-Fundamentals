# ForEach en los Streams

Es una operación terminal que recorre cada elemento del Stream y aplica una acción (normalmente una función lambda).

## 🧪 Sintaxis básica
```java
stream.forEach(element -> {
    // acción con el elemento
});
```

**Usando Referencia de Método:**
```java
stream.forEach(System.out::println);
```

---


## 🔥 Ejemplo 1: Imprimir nombres
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana");

nombres.stream()
    .forEach(nombre -> System.out.println("Hola " + nombre));
```

**📤 Salida:**
```nginx
Hola Yoi
Hola Pedro
Hola Ana
```

---

## 🔥 Ejemplo 2: Con objetos

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

personas.stream()
    .filter(p -> p.edad >= 21)
    .forEach(p -> System.out.println("Mayor de edad: " + p));
```

**📤 Salida:**
```nginx
Mayor de edad: Yoi (23)
Mayor de edad: Pedro (30)
```