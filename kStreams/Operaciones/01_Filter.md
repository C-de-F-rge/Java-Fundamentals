# Filter para los Streams

Este método permite dejar pasar solo los elementos que cumplen una condición, es decir, filtra según un criterio que tú definas.

## Sitaxis Básica

```java
.stream().filter(e -> /* condición */)
```

---

## ✅ Ejemplos Simples

### 🟢 Filtrar nombres con más de 3 letras:

```java
List<String> nombres = List.of("Ana", "Yoi", "Pedro", "Tyler");

List<String> filtrados = nombres.stream()
    .filter(nombre -> nombre.length() > 3)
    .collect(Collectors.toList());

System.out.println(filtrados); // [Pedro, Tyler]
```

---

### 🟢 Filtrar números pares:

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

List<Integer> pares = numeros.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

System.out.println(pares); // [2, 4, 6]
```

---

## 🔥 ¿Qué tan complejo puede ser?
¡Tan complejo como necesites! Puedes usar `condiciones compuestas`, `invocar métodos`, o incluso `usar clases` completas como `predicados`.

### 🟡 Condición compuesta:
 
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler", "Ana", "Paco");

List<String> filtrados = nombres.stream()
    .filter(n -> n.length() > 3 && n.startsWith("P"))
    .collect(Collectors.toList());

System.out.println(filtrados); // [Pedro, Paco]
```

---

### 🟡 Usando un método externo:

```java
private static boolean esNombreValido(String nombre) {
    return nombre.length() > 3 && nombre.contains("e");
}

// en el stream:
List<String> filtrados = nombres.stream()
    .filter(Main::esNombreValido)
    .collect(Collectors.toList());
```

#### NOTA: Equivalencia entre Lamda y Method Reference.
```java
.filter(n -> esNombreValido(n)) // usando lambda

// Es igual a:

.filter(Main::esNombreValido) // usando method reference
```

---

### 🔵 Usando objetos personalizados

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 25),
    new Persona("Pedro", 32),
    new Persona("Ana", 17)
);

List<Persona> adultos = personas.stream()
    .filter(p -> p.edad >= 18)
    .collect(Collectors.toList());
```

