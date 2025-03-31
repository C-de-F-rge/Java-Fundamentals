# For en Java
El **for** es una estructura de control repetitiva que se usa
cuando conocemos de antemano cuántas veces queremos repetir el código.

**Sintaxis**
```java
for (inicialización; condición; actualización) {
    // Código que se ejecutará en cada iteración
}
```

## ✅ Ejemplo básico de for

```java
public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
```

**Salida**
```sh
Número: 1  
Número: 2  
Número: 3  
Número: 4  
Número: 5  
```

## ✅ Ejemplo de 10 en 10

```java
public class ForStepExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i += 10) {
            System.out.println("Número: " + i);
        }
    }
}
```

**Salida**
```sh
Número: 0  
Número: 10  
Número: 20  
Número: 30  
Número: 40  
Número: 50  
```