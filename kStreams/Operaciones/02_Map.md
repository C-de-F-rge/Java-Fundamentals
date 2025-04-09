# Map en los Streams

El método map() transforma cada elemento del stream y devuelve un nuevo stream con los resultados.
📌 Es como decir: "por cada elemento, devuélveme otro valor modificado"


## Método

```java
<R> Stream<R> map(Function<? super T, ? extends R> mapper)
```

---

## 🟢 1. Transformar nombres a mayúsculas

```java
List<String> nombres = List.of("yoi", "pedro", "ana");

List<String> enMayus = nombres.stream()
    .map(nombre -> nombre.toUpperCase())
    .collect(Collectors.toList());

System.out.println(enMayus); // [YOI, PEDRO, ANA]
```

---


## 🟢 2. Obtener la longitud de cada palabra

```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana");

List<Integer> longitudes = nombres.stream()
    .map(nombre -> nombre.length())
    .collect(Collectors.toList());

System.out.println(longitudes); // [3, 5, 3]
```

---

## 🟢 4. Convertir objetos
```java
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

List<Persona> personas = List.of(
    new Persona("Yoi", 25),
    new Persona("Pedro", 30),
    new Persona("Ana", 22)
);

List<String> nombres = personas.stream()
    .map(Persona::getNombre)
    .collect(Collectors.toList());

System.out.println(nombres); // [Yoi, Pedro, Ana]
```

### Combinados:
```java
List<String> resumen = personas.stream()
    .map(p -> p.getNombre() + " tiene " + p.getEdad() + " años")
    .collect(Collectors.toList());

System.out.println(resumen);
// [Yoi tiene 25 años, Pedro tiene 30 años, Ana tiene 22 años]
```
