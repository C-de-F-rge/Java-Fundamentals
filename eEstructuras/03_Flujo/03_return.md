# Return en Java
return se usa para terminar la ejecución de un método y devolver un valor opcional.

## ✅ Ejemplo con return en un método
```java
public class ReturnExample {
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    public static int suma(int a, int b) {
        return a + b; // Devuelve la suma y termina el método
    }
}
```

**Salida**
```sh
Resultado: 8
```

## ✅ Ejemplo con return en void
```java
public class ReturnVoidExample {
    public static void main(String[] args) {
        verificarNumero(0);
        verificarNumero(10);
    }

    public static void verificarNumero(int num) {
        if (num == 0) {
            System.out.println("Número inválido.");
            return; // Sale del método
        }
        System.out.println("Número válido: " + num);
    }
}
```

**Salida**
```sh
Número inválido.  
Número válido: 10  
```
