# Introducción a las Estructuras de Colección 

| __Tipo__ | __Interfaz Base__ | __Clase Principal__ | __Descripción__ |
|--------------|------------|----------------|--------------------------|
| [**List**](/iEstructuras_Colección/01_List.md) | List<E> | `ArrayList`,`LinkedList`,<br>`Vector`,`Stack` | Colecciones `ordenadas` que permiten elementos `duplicados`. |
| [**Set**](/iEstructuras_Colección/02_Set.md) | Set<E> | `HashSet`, `LinkedHashSet`,<br>`TreeSet` | Collecciones `no duplicadas` pueden ser `desordenadas` o con `orden natural`. |
| [**Map**](/iEstructuras_Colección/03_Map.md) | Map<K,V> | `HashMap`, `treeMap`,<br>`LinkedHashMap`, `HashTable` | Estructura `Clave - Valor`. No permite claves duplicadas. |
| [**Queue**](/iEstructuras_Colección/04_Queue.md) | Queue<E> | `PriorityQueue`, `LinkedList`,<br>`ArrayDeque` | Estrucutra de tipo `FIFO` (First-in, First-out). |
| [**Deque**](/iEstructuras_Colección/05_Deque.md) | Deque<E> | `ArrayDeque`, `LinkedList` | Permite insertar y eliminar elementos en `ambos extremos`. |
| [**Stack**](/iEstructuras_Colección/06_Stack.md) | (Hereda de<br>`Vector`) | `Stack` | Estructura de tipo `LIFO` (Last-in, First-out). | 
| [**Navegación**](/iEstructuras_Colección/07_Navegación.md) | NavigableSet,<br>NavigableMap | `TreeSet`, `TreeMap` | Versiones `ordenadas` que permiten navegación por `rangos`. |
| [**Sincronizadas**](/iEstructuras_Colección/08_Sincronizadas.md) | ConcurrentMap,<br>BlockingQueue, etc. | `ConcurrentHashMap`,<br>`CopyOnWriteArrayList`,<br>`LinkedBlockingQueue` | Colecciones seguras para hilos (`Concurrency`). |
| [**Inmutables**(java 9+)](/iEstructuras_Colección/09_Inmutables.md) | ---- | `List.of(...)`,`Set.of(...)`,<br>`Map.of(...)` | Colecciones inmutables `no modificables` despues de crear. |
| [**Streams**(java 8+)](/jStreams/00_Introduccion.md) | ---- | `Stream<T>` | Procesamiento funcional de colecciones. No es una es una estructura de datos, pero se `usa con colecciones`. |
