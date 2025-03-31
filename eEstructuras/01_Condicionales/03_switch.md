#  Switch en Java

El **switch** es una estructura de control que se usa cuando tenemos múltiples
casos posibles para una variable y queremos comparar su valor de manera más
eficiente que con varios **if-else if-else**.

**Sintaxis**
```java
switch (variable) {
    case valor1:
        // Código si variable == valor1
        break;
    case valor2:
        // Código si variable == valor2
        break;
    case valor3:
        // Código si variable == valor3
        break;
    default:
        // Código si ningún caso coincide
}
```

## ✅ Ejemplo de switch

```java
public class SwitchExample {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día inválido");
        }
    }
}
```
---

## Agrupar Casos
Sí, en switch puedes tener varios case que compartan el mismo código.
Esto es útil cuando varios valores deben producir el mismo resultado.

**Ejemplo**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int dia = 6;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un día laboral.");
                break;
            case 6:
            case 7:
                System.out.println("Es fin de semana.");
                break;
            default:
                System.out.println("Número de día inválido.");
        }
    }
}
```