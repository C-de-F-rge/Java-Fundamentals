# Collect en los Strams

`collect()` transforma el stream en una estructura de datos como:

- Lista
- Conjunto (Set)
- Mapa
- String
- Estadísticas (sumas, promedios...)

Y todo eso usando la clase auxiliar Collectors.

## 🔧 Sintaxis básica
```java
Stream<T> stream = ...
Resultado resultado = stream.collect(Collectors.<...>);
```

---

## 🧪 Ejemplo 1: Convertir a lista
```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana");

List<String> filtrados = nombres.stream()
    .filter(n -> n.startsWith("P"))
    .collect(Collectors.toList());

System.out.println(filtrados); // [Pedro]
```

## 🧪 Ejemplo 2: Convertir a conjunto (Set)
```java
Set<String> unicos = nombres.stream()
    .collect(Collectors.toSet());
```

## 🧪 Ejemplo 3: Mapear a un Map (clave-valor)
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

Map<String, Integer> mapa = personas.stream()
    .collect(Collectors.toMap(
        Persona::getNombre,
        Persona::getEdad
    ));

System.out.println(mapa); // {Pedro=30, Yoi=23, Ana=19}
```

## 🧪 Ejemplo 4: Juntar todo en un solo String

```java
String nombresJuntos = nombres.stream()
    .collect(Collectors.joining(", "));

System.out.println(nombresJuntos); // Yoi, Pedro, Ana
```

## 🧪 Ejemplo 5: Estadísticas
```java
Double promedio = personas.stream()
    .collect(Collectors.averagingInt(Persona::getEdad));

System.out.println("Promedio de edad: " + promedio); // Promedio de edad: 24.0
```

--- 

| **Collector  **            | **¿Qué hace? **                                              |
|------------------------|------------------------------------------------------------------|
| `toList()`             | Convierte el stream a `List`                                     |
| `toSet()`              | Convierte el stream a `Set`                                      |
| `toMap(k, v)`          | Crea un `Map<K, V>`                                              |
| `joining(", ")`        | Concatena los elementos con un separador                         |
| `counting()`           | Cuenta el número de elementos                                    |
| `averagingInt()`       | Calcula el promedio de enteros                                   |
| `summarizingInt()`     | Devuelve estadísticas: suma, promedio, mínimo, máximo, conteo    |
| `groupingBy(...)`      | Agrupa los elementos por una clave (como en SQL `GROUP BY`)      |
| `partitioningBy(...)`  | Divide los elementos en dos grupos: true y false                 |
