# Colecciones Sincronizadas y No Sincronizadas

| **Características** | **Sincronizadas** | **No Sincronizadas** |
|---------------|----------------------|---------------------|
| `¿son seguras` <br> `en Multihilo?` | ✅Si | ❌No |
| `Rendimiento` | 🐢 Más lento por control de hilos | 🚀 Más rápido, sin control de hilos |
| `Modificación` <br> `Simultanea` | 🔒 Controlada (solo un hilo a la vez) | ⚠️ Puede causar errores |
| `Ejemplos` | `Vector`, `Stack`, `HashTable` | `ArrayList`, `HashMap`, `HashSet`,<br>`Deque` |
| `Alternativas` <br> `Modernas`| Usar <br> `Collections.synchronizedXXX()` | Usar `ConcurrentHashMap`,<br>`CopyOnWriteArrayList`<br> si senecesita seguridad. |