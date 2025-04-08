# Los Set en Java

Un `Set` es un tipo de colección en Java que no permite valores `Duplicados` y no garantiza un orden particular salvo en implementaciones específicas.

## Métodos Comunes en List

### Add(O object)
Agregar un elemento al final de la Lista.
```java
lista.add("Nombre");
lista.add("Nombre"); // ❌ Error no permite valores DuplicadosS
```


### Remove(O object)
Elimina un elemento.
```java
lista.add("ADA");
lista.remove(1); //❌ Error: los Set no manejan índices.
lista.remove("ADA"); //✅ Elimina ADA de la lista.
```

### Contains(O object)
Devuelve true o false dependiendo si el objeto se encuentra o no.
```java
boolean bool = lista.contains("nombre"); 
System.out.println(bool);//✅ True: Nombre está en la lista.
```

### Size()
Devuelve el número de elementos de la lista.
```java
int total = lista.size(); 
```

### isEmpty()
Devuelve `True` si la lista está vacía y `False` no lo está.
```java
boolean bool = lista.isEmpty(); 
System.out.println(bool);//✅ False: la lista no está vacía.
```

### Clear()
Elimina todos los elementos de la lista
```java
lista.clear(); //✅ Limpia toda la Lista.
```

### Ejemplo con Iterator() para `HashSet`
```java
Iterator<String> it = lista.iterator();
while(it.hasNext()) { // ¿Hay siguiente elemento?
    String elemento = it.next(); // Avanza al siguiente
    System.out.println(elemento);// Orden impredecible (ej: C, A, B)
    it.remove(); // Elimina el elemento actual del Set de forma segura
}
```

### Ejemplo con Iterator() para `LinkedHashSet`
```java
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()) {
    String elemento = iterator.next();
    System.out.println(elemento); // Orden de inserción: A, B, C
}
```

### forEach(Consumer <? super E> action)
Devuelve `True` si la lista está vacía y `False` no lo está.
```java
lista.forEach(elemento -> System.out.println(elemento));
```

#### Ejemplo con objetos más complejos
```java
public class Persona {
    private String name;
    private Long id;

    // Constructor normal
    public Persona(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    // Getters & Setters...

    // Sobrescribir equals y hashCode para que HashSet funcione correctamente para evitar objetos repetidos (pues dos valores iguales con diferente id los toma como desiguales y los guarda) por otro lado genera un identificador único para hallar el objeto guardado.
    @Override
    public boolean equals(Object o) {//Evita que se repitan objetos
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!name.equals(persona.name)) return false;
        return id.equals(persona.id);
    }

    @Override
    public int hashCode() {// Genera un valor único de lo cación para el objeto.
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}

//  CLASE MAIN  

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set<Persona> listaPersonas = new HashSet<>();
        
        // Personas reales (instancias independientes)
        listaPersonas.add(new Persona("Ana", 1L));
        listaPersonas.add(new Persona("Carlos", 2L));
        listaPersonas.add(new Persona("Luisa", 3L));

        // Imprimir nombres con lambda
        listaPersonas.forEach(p -> System.out.println(p.getName()));
    }
}
```

---

## Hashset 
`HashSet` no garantiza ningun orden especídico en la Iteración. Los objetos se guardan en un orden basado en código Hash.

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Añadir elementos al HashSet
        hashSet.add("Ana");
        hashSet.add("Carlos");
        hashSet.add("Luisa");
        hashSet.add("Ana"); // Duplicado, no se añadirá

        // Imprimir elementos
        System.out.println("HashSet:");
        hashSet.forEach(System.out::println);

        // Verificar si un elemento está presente
        System.out.println("¿Contiene 'Carlos'? " + hashSet.contains("Carlos"));

        // Eliminar un elemento
        hashSet.remove("Luisa");
        System.out.println("Después de eliminar 'Luisa':");
        hashSet.forEach(System.out::println);
    }
}
```

## LinkedHashSet 
Mantiene un orden de Inserción, los elementos se iteran en el orden en que fueron insertados.

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Añadir elementos al HashSet
        hashSet.add("Ana");
        hashSet.add("Carlos");
        hashSet.add("Luisa");
        hashSet.add("Ana"); // Duplicado, no se añadirá

        // Imprimir elementos
        System.out.println("HashSet:");
        hashSet.forEach(System.out::println);

        // Verificar si un elemento está presente
        System.out.println("¿Contiene 'Carlos'? " + hashSet.contains("Carlos"));

        // Eliminar un elemento
        hashSet.remove("Luisa");
        System.out.println("Después de eliminar 'Luisa':");
        hashSet.forEach(System.out::println);
    }
}
```


```java
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        // Añadir elementos al TreeSet
        treeSet.add("Ana");
        treeSet.add("Carlos");
        treeSet.add("Luisa");
        treeSet.add("Ana"); // Duplicado, no se añadirá

        // Imprimir elementos
        System.out.println("TreeSet:");
        treeSet.forEach(System.out::println);

        // Verificar si un elemento está presente
        System.out.println("¿Contiene 'Carlos'? " + treeSet.contains("Carlos"));

        // Eliminar un elemento
        treeSet.remove("Luisa");
        System.out.println("Después de eliminar 'Luisa':");
        treeSet.forEach(System.out::println);
    }
}
```
