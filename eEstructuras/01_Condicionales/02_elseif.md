# If-else en Java
El **if-else** es una estructura de control que nos permite ejecutar
un bloque de código si una condición es true, y otro bloque si la
condición es false.

## Estructura Básica

```java
if (condición) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}
```

**Ejemplo de Aplicación**

```java
public class IfElseExample {
    public static void main(String[] args) {
        int edad = 16;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
```

---

## Buenas Prácticas

❌ Código ineficiente (varios if separados):
```java
if (nota >= 90) {
    System.out.println("Sobresaliente");
}
if (nota >= 80 && nota < 90) {
    System.out.println("Notable");
}
if (nota >= 70 && nota < 80) {
    System.out.println("Aprobado");
}
```

✅ Código correcto (else if evita evaluaciones innecesarias):
```java
if (nota >= 90) {
    System.out.println("Sobresaliente");
} else if (nota >= 80) {
    System.out.println("Notable");
} else if (nota >= 70) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}
```

---

❌ Código con demasiadas anidaciones:
```java
if (usuario != null) {
    if (usuario.estaActivo()) {
        if (usuario.getEdad() > 18) {
            System.out.println("El usuario puede acceder.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }
    } else {
        System.out.println("El usuario no está activo.");
    }
}
```

✅ Código más limpio con operadores lógicos:
```java
if (usuario == null) {
    System.out.println("Usuario inválido.");
} else if (!usuario.estaActivo()) {
    System.out.println("El usuario no está activo.");
} else if (usuario.getEdad() > 18) {
    System.out.println("El usuario puede acceder.");
} else {
    System.out.println("El usuario es menor de edad.");
}
```