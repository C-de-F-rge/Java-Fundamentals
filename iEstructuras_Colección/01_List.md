# Tipos de List en Java

La interfaz `List<E>` define una colección ordenada por ídices que puede contener elementos duplicados. Entre las implementaciones más usadas encontramos:

## Métodos Comunes en List

### Add(E element)
Agregar un elemento al final de la Lista.
```java
lista.add("nuevo elemento");
```

### Add(int index, E element)
Agregar un elemento en una posición específica.
```java
lista.add(1, "Elemento");
```

### Get(int index)
Trae un elemento en una posición indicada.
```java
String elemento = lista.get(1); //Devuelve "Joe Doe"
```

### Set(int index, E new-element)
Remplaza el elemento en la posición especificada por el nuevo elemento.
```java
lista.set(0, "Elemento Cambiado"); 
```

### Remove(int index) & Remove(E element)
Elimina la posición indicada o la primera aparición del elemento.
```java
lista.remove(1);
lista.remove("Elemento");
```

### indexOf(Object o) & lastIndexOf(Object o)
Devuelven la primera o última posición en la que aparece el objeto.
```java
int pos1 = lista.indexOf("Elemento");
int pos2 = lista.lastIndexOf("Joe Doe")
```

### Size()
Devuelve el número de elementos de la lista.
```java
int total = lista.size(); 
```

### isEmpty()
Devuelve `True` si la lista está vacía y `False` no lo está.
```java
boolean vacia = lista.isEmpty(); 
```

### SubList(int fromIndex, int toIndex)

| Características | Iterator | ListIterator |
|------------|------------------------|-----------------------|
| **Dirección** | Solo hacia adelante <br> `(->)` | Adelante `(->)` y <br> atrás `(<-)` |
| **Modificar <br> elementos** | se puede eliminar <br> `remove()` | puede `eliminar`, `añadir`, <br> y `modifiar` |
| **Obtener <br> Posición**  | No | Sí `(Índice actual)` |
| **Colecciones <br> Soportadas | Cualquier Colección | Solo Listas `(ArrayList, LikedList)` |

#### Ejemplo con Iterator()
```java
Iterator<String> it = lista.iterator();
while(it.hasNext()) { // ¿Hay siguiente elemento?
    String elemento = it.next(); // Avanza al siguiente
    System.out.println(elemento);
    it.remove(); // Elimina el elemento actual
}
```

#### Ejemplo con listIterator()
```java
ListIterator<String> listIt = lista.listIterator();
// Hacia adelante
while(listIt.hasNext()) {
    String elemento = listIt.next();
    System.out.println(elemento);
    listIt.set("Modificado: " + elemento); // Modifica el elemento
}

// Hacia atrás
while(listIt.hasPrevious()) {
    String elemento = listIt.previous();
    System.out.println(elemento);
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
}

//  CLASE MAIN  

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        
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

## ArrayList:

- Basada en un Array dinámico.
- Buena para busquedas rápidas por índice, pero las Inserciones/Eliminaciones en posiciones intermedias pueden llegar a ser costosas.

```java
import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList{
    public static void main (String[] args){
        //Crear ArrayList:
        List<String> frutas = new ArrayList<>();

        //Agregar Elementos:
        frutas.add("Manzana");
        frutas.add("Banáno");
        frutas.add("Sandía");

        //Insertar una Posición Específica:
        frutas.add(1,"Durazno");

        //Acceder a un Elemento
        System.out.println("Elemento en la posición 2: " + frutas.get(2));

        //Utilizar foreach para acceder a los elementos
        frutas.forEach(System.out::println);

        //ForEach con lambda
        frutas.forEach(f -> System.out.println("Nombre de la fruta " + f))

        // Buscar un elemento
        int pos = lista.indexOf("Banána");
        System.out.println("Posición de 'Banana': " + pos);
        
    }
}
```
## LinkedList

- Inserciones y elminaciones eficientes si ya se tiene la posición.
- Acceso aleatorio más lento, pero es útil para operaciones de cola o pila.

```java
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Crear un LinkedList
        List<String> lista = new LinkedList<>();
        
        // Agregar elementos
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        
        // Agregar elemento al inicio
        ((LinkedList<String>)lista).addFirst("Amarillo");
        
        // Acceder y modificar un elemento
        lista.set(1, "Naranja");
        
        // Recorrer la lista con Iterator
        System.out.println("Recorriendo LinkedList:");
        for(String color : lista) {
            System.out.println(color);
        }
        
        // Eliminar un elemento
        lista.remove("Azul");
        System.out.println("Después de eliminar 'Azul': " + lista);
    }
}
```