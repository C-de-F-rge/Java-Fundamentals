# Strictfp en Java

El modificador strictfp (strict floating-point) asegura que los cálculos
con números de punto flotante (float y double) sean consistentes en todas las plataformas
y manejen mayor presición de resultados.

- 🔹 Evita diferencias en los resultados de cálculos de punto flotante.
- 🔹 Asegura que los valores sigan el estándar IEEE 754 en todas las arquitecturas.
- 🔹 Se puede usar en clases, interfaces y métodos (pero no en variables o bloques de código).

***

## 📌 1. Uso en clases
Si una clase es strictfp, todos sus métodos seguirán las reglas IEEE 754.

```java
strictfp class Calculadora{
    public double division(double a, double b){
        return a / b; 
    }
}
```
---
## 📌 2. Uso en métodos
También se puede aplicar strictfp a un método específico en lugar de toda la clase.

```java
class Calculadora{
    strictfp double potencia(double base, double exponente){
        return Math.pow(base,exponente);
    }
}
```
---
## 📌 3. Uso en interfaces
También puedes marcar interfaces como strictfp, lo que significa que todos los métodos
de las clases que implementen esta interfaz serán estrictos.

```java
strictfp interface Operación{
    double calcular(double a, double b);
}
```
---
## 📌 4. Diferencia con cálculos normales
Sin strictfp, algunas arquitecturas pueden usar mayor precisión de la esperada, lo que
causa diferencias pequeñas en los cálculos.
```java
class Normal{
    public double calcular(){
        return 10.0 / 3.0; // Puede dar un resultado ligeramente distinto en diferentes procesadores
    }
}

strictfp class Estricto(){
    public double calcular(){
        return 10.0 / 3.0; // Siempre sigue IEEE 754
    }
}