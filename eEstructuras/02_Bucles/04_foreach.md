# Foreach en Java
El **foreach** es una variante del for que se usa para recorrer colecciones
(arrays, listas, etc.) de manera más sencilla y limpia.

**Sintaxis**
```java
for (TipoElemento variable : colección) {
    // Código que se ejecuta en cada iteración
}
```

## Ejemplo: Recorrer un Array con foreach

```java
public class ForEachArrayExample{
    public void main(String[] args){
        String[] nombres = {"Ana","Pedro","Alejandro","Jbalvin"};

        for (String nombre : nombres){
            System.out.println("Nombre: " ´+ nombre);
        }
    }
}
```
**Salida**
```
Nombre: Ana  
Nombre: Pedro  
Nombre: Juan  
Nombre: María  
```