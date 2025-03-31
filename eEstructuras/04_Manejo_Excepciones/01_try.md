# Try y Catch en Java
Bloque donde colocamos el código que podría generar una **excepción**.
Cuando ocurre una **excepción** dentro del **try**, el flujo del programa salta al **catch**.

## ✅ Ejemplo con división por cero (ArithmeticException)
```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // 🚨 Error: División por cero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        System.out.println("Programa continúa...");
    }
}
```

**Salida**
```sh
Error: No se puede dividir por cero.  
Programa continúa...
```

