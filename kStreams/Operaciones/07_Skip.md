# Skip en los Streams

Vamos a darle con toda a `skip()`, el compita inseparable de limit() cuando hablamos de paginación o de ignorar elementos en Streams 💻✨

## 🧪 Ejemplo 1: Saltar los primeros 2 elementos
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler");

List<String> saltados = nombres.stream()
    .skip(2)
    .collect(Collectors.toList());

System.out.println(saltados); // [Ana, Tyler]
```

## 🧪 Ejemplo 2: Saltar y limitar (paginación simple)
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler", "Mateo");

int pagina = 2;
int tamanoPagina = 2;

List<String> pagina2 = nombres.stream()
    .skip((pagina - 1) * tamanoPagina)
    .limit(tamanoPagina)
    .collect(Collectors.toList());

System.out.println(pagina2); // [Ana, Tyler]
```

## 🧪 Ejemplo 3: Top 3 personas más jóvenes, pero saltando al más joven (posición 1)
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

List<Persona> top3SinElMasJoven = personas.stream()
    .sorted(Comparator.comparing(Persona::getEdad)) // ordenar por edad asc
    .skip(1) // saltar al más joven
    .limit(3)
    .collect(Collectors.toList());

top3SinElMasJoven.forEach(p -> 
    System.out.println(p.getNombre() + " - " + p.getEdad())
);
```

**SALIDA**
```nginx
Yoi - 23  
Tyler - 25  
Pedro - 30
```