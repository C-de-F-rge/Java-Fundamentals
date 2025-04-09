# Operaciones de los Streams

## 1. Operaciones Intermedias 

Estas no ejecutan nada por sí solas, solo preparan la "tubería" de operaciones. Devuelven un nuevo Stream.

| **Método** | **Descripción** |
|--------------|-------------------------|
| [Filter(Predicate)](/kStreams/Operaciones/01_Filter.md) | `Filtra` elementos según la condición. |
| [Map(Function)](/kStreams/Operaciones/02_Map.md) | `Transforma` cada elemento. |
| [FlatMap(Function)](/kStreams/Operaciones/03_FlatMap.md) | `Aplana` estructuras anidadas de `streams`. |
| [Distrinct()](/kStreams/Operaciones/04_Distinct.md) | `Elimina` elementos duplicados. |
| [Sorted()](/kStreams/Operaciones/05_Sorted.md) | `Ordena` de forma `natural`. |
| [Sorted(Comparator)](/kStreams/Operaciones/05_Sorted.md) | `Ordena` con un comparador personalizado. |
| [Limit(n)](/kStreams/Operaciones/06_Limit.md) | `Limíta` el número de elementos. |
| [Skip(n)](/kStreams/Operaciones/07_Skip.md) | `Omite` los primeros `n` elementos. |
| [Peek(Consumer)](/kStreams/Operaciones/08_Peek.md) | `Ejecuta` una acción sin `modificar` los datos (útil para depurar). |

---

## 2. Operaciones Terminales

Estas ejecutan el stream. Después de una operación terminal, el Stream ya no se puede usar.

| **Método** | **Descripción** |
|--------------|-------------------------|
| [ForEach(Consumer)](/kStreams/Operaciones/09_ForEach.md) | `Ejecuta` una acción por cada elemento. |
| [Collect(Collector)](/kStreams/Operaciones/10_Collect.md) | `Recoje` los datos de una collección (`List`, `Set`, `Map`, etc.) |
| [ToArray()](/kStreams/Operaciones/11_ToArray.md) | `Convierte` un stream en un Arreglo. |
| [Reduce(BinaryOperator)](/kStreams/Operaciones/12_Reduce.md) | `Reduce` los elementos por su valor(`sumar`, `concatenar`, etc.) |
| [Count()](/kStreams/Operaciones/13_Count.md) | `Devuelve` cuantos elementos hay. |
| [AnyMatch(Predicate)](/kStreams/Operaciones/14_AnyMatch.md) | ¿Algún elemento cumple la condición? |
| [AllMatch(Predicate)](/kStreams/Operaciones/15_AllMatch.md) | ¿Todos cumplen la condición? |
| [NoneMatch(Predicate)](/kStreams/Operaciones/16_NoneMatch.md) | ¿Ninguno cumple la condición? |
| [FindFirst()](/kStreams/Operaciones/17_FindFirst.md) | `Devuelve` el primer elemento (si hay). |
| [FindAny()](/kStreams/Operaciones/18_FindAny.md) | `Devuelve` cualquier elemento (Especialmente Útil para paralelos). |
| [Min(Comparator)](/kStreams/Operaciones/19_Min.md) | `Encuentra` el mínimo. |
| [Max(Comparator)](/kStreams/Operaciones/20_Max.md) | `Encuentra` el máximo. |

---

### 3. Operaciones Útiles para Listas Grandes (Strams Paralelos)
Esto divide el trabajo en varios hilos automáticamente, útil para listas grandes.

```java
list.parallelStream()
```

---

## Manejo de Operaciones

```java
List<String> nombres = List.of("Yoi", "Pedro", "Ana", "Tyler");

List<String> resultado = nombres.stream()
    .filter(n -> n.length() > 3) // intermedia
    .map(String::toUpperCase)   // intermedia
    .sorted()                   // intermedia
    .collect(Collectors.toList()); // terminal

System.out.println(resultado);
```

