# Break en Java
Se usa para salir de un **for**, **while** o **do-while** antes
de que la condición sea false.

## ✅ Ejemplo con for (detener en el número 5)
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se encontró el 5, saliendo del bucle...");
                break; // Detiene el bucle aquí
            }
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
Se encontró el 5, saliendo del bucle...
```

## 🚨Ejemplo de break con etiquetas (para salir de 2 bucles)
```java
public class BreakLabelExample {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Saliendo de ambos bucles...");
                    break outerLoop; // Sale de ambos bucles
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
```

**Salida**
```sh
i = 1, j = 1  
i = 1, j = 2  
i = 1, j = 3  
i = 2, j = 1  
Saliendo de ambos bucles...
```