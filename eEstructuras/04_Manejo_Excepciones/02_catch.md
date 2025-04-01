# Catch en Java
Cuando ocurre una excepción dentro del try, el flujo del programa salta al catch;
es importante revisar el apartado de [Excepciones en java](/fJava_Excepciones/JAVA_EXCEPTIONS.md).

## Catch Simple
```java
try {
    // Código que puede lanzar una excepción
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Manejo de la excepción
    System.out.println("Error: " + e.getMessage()); //Se
}
```
---

## Catch Anidados
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage() + " | Cause: " + e.getCause() + " | StackTrace: " + Arrays.toString(e.getStackTrace()));
}
```

---


| Método                  | Descripción                                                                                 | Ejemplo                                                                 |
|-------------------------|---------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| `getMessage()`           | Devuelve el mensaje detallado de la excepción.                                               | `e.getMessage()` -> `"División por cero"`                              |
| `printStackTrace()`      | Imprime la traza de la pila (stack trace) en la consola, útil para depuración.              | `e.printStackTrace()` -> Imprime la traza completa de la excepción.   |
| `toString()`             | Devuelve una cadena con el nombre de la clase de la excepción y el mensaje de error.         | `e.toString()` -> `"java.lang.ArithmeticException: / by zero"`        |
| `getCause()`             | Devuelve la causa original de la excepción (si existe).                                      | `e.getCause()` -> `null` si no hay causa.                             |
| `getStackTrace()`        | Devuelve un arreglo con los elementos de la traza de la pila.                               | `e.getStackTrace()` -> Muestra las líneas de la traza de la excepción. |
| `getLocalizedMessage()`  | Devuelve un mensaje más detallado, adecuado para la localización (similar a `getMessage()`). | `e.getLocalizedMessage()` -> `"División por cero"`                    |