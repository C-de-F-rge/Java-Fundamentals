# Continue en Java
Se usa cuando queremos omitir una iteración y continuar con la siguiente sin detener el bucle.

## ✅continue: Salta la iteración actual y sigue con la siguiente
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se omitió el número 5");
                continue; // Salta esta iteración y sigue con la siguiente
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
Se omitió el número 5  
Número: 6  
Número: 7  
Número: 8  
Número: 9  
Número: 10  
```

---

