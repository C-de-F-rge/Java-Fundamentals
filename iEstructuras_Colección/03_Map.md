# Los Map en Java

Los Map permiten almacenar estructuras de tipo `Clave-Valor` donde cada clave es única y está asociada a un valor específico. Facilita la busqueda basado en claves únicas para cada objeto.

## Put (K key, V value)
Asocia un valor a una clave única, si la clave ya tiene un valor, este lo remplaza por el nuevo.

```java
Map<String, Integer> edades = new HashMap<>();
edades.put("Pedro", 25);
edades.put("Tyler", 44);
edades.put("Pedro", 23); //Remplaza el valor anterior

System.out.println(edades); // {Pedro=23, Tyler=44}
```

## Get (Object key)
Devuelve el valor asociado a una clave, o `Null` si no existe.

```java
System.out.println(edades.get("Pedro"));   // 23
System.out.println(edades.get("Yoi")); // null
```

## ContainsKey(Object Key)
Verifica si el `Map` contiene esa clave.

```java
System.out.println(edades.containsKey("Pedro")); // true
System.out.println(edades.containsKey("Yoi")); // false
```

## ContainsValue (Object value)
verifica si alguna clave tiene ese valor

```java
System.out.println(edades.containsValue(23)); // true: lo tiene la llave Pedro
System.out.println(edades.containsValue(50)); // false
```

## Remove (Object Key)
Elimina una clave (y su valor) en el mapa
```java
edades.remove("Tyler");
System.out.println(edades); // {Pedro=23}
```

## Size()
Devuelve la cantidad de pares clave-valor
```java
System.out.println(edades.size()); // 1
```

## IsEmpty()
Retorna `true` si el mapa no tiene elementos
```java
System.out.println(edades.isEmpty()); // false
edades.clear(); // Borra todo
System.out.println(edades.isEmpty()); // true
```

## Clear()
Limpio todo el mapa.

```java
edades.clear();
System.out.println(edades); // {}
```
## Consumer()
permite traer todos los objetos que tenga el Map mediante un ForEach - Lamda.

```java
personas.forEach((clave, persona) -> { 
            System.out.println("ID: " + clave + " -> " + persona);
            });
```

## Ejemplo con Objetos

```java
public class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString() para imprimir bonito
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creamos el HashMap
        Map<String, Persona> personas = new HashMap<>();

        // Agregamos objetos con put(clave, valor)
        personas.put("yoi123", new Persona("Yoi", 25));
        personas.put("pedro456", new Persona("Pedro", 30));
        personas.put("tyler789", new Persona("Tyler", 28));

        // Imprimimos todos los valores del mapa
        personas.forEach((clave, persona) -> { 
            System.out.println("ID: " + clave + " -> " + persona);
            });
    }
}
```

---

## HashMap
```java
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main (String[] args) {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");
        capitales.put("Ecuador", "Quito");
        capitales.put("Brasil", "Brasilia");

        capitales.forEach((pais, capital) -> {
            System.out.printf("La capital de %s es %s\n", pais, capital);
        });
    }
}
```

## LinkedHashMap
```java
import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
    public static void main (String[] args) {
        Map<Long, String> nombres = new LinkedHashMap<>();
        nombres.put(1L, "Juan");
        nombres.put(2L, "Joe");
        nombres.put(3L, "Andres");

        nombres.forEach((key, nombres) -> {
            System.out.println("La llave: %d contiene el valor: %s\n", key, capital);
        });
    }
}
```

## TreeMap

```java
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMapForEach {
    public static void main(String[] args) {
        Map<String, String> capitales = new TreeMap<>();
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");
        capitales.put("Ecuador", "Quito");
        capitales.put("Brasil", "Brasilia");

        capitales.forEach((pais, capital) -> {
            System.out.println("La capital de %s es %s", pais, capital);
        });
    }
}



