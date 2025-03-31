# Do-While en Java
El **do-while** es una estructura de control repetitiva similar a while,
con la diferencia clave de que siempre ejecuta el código al menos una vez,
sin importar si la condición es **true** o **false**.

**Estructura**
```java
do {
    // Código que se ejecuta al menos una vez
} while (condición);
```

## ✅ Ejemplo de do-while

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("Número: " + contador);
            contador++; // Incremento
        } while (contador <= 5);
    }
}
```

**Salido**
```sh
Número: 1  
Número: 2  
Número: 3  
Número: 4  
Número: 5  
```

