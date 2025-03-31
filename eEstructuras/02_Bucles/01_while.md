# While en Java
El **while** es una estructura de control repetitiva que ejecuta un
bloque de código mientras una condición sea true.

**Estructura**
```java
while (condición) {
    // Código que se repetirá mientras la condición sea verdadera
}
```

## ✅ Ejemplo básico de while
```java
public class WhileExample {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++; // Incremento para evitar un bucle infinito
        }
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