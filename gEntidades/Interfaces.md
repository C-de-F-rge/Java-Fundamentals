# Interfaces en Java

Las Interfaces en Java son una especie de comportamientos, que
las clases pueden implementar, de tal manera que estos comportamientos
no son alterables, pero la clase si es expandible.

## Ejemplo de Aplicación
Supongamos que tenemos la interfaz **PonerHuevos** de la cual podemos
implementar los métodos _ponerHuevo_ y _empollarHuebo_

```java
public interface PonerHuevos {
    void ponerHuevo(String color);
    void empollarHuevo(int cantidad);
}
```

Al momneto de Implementarla en nuestras clases se sobree scriben los
métodos por lo cual utilizamos la anotación **@Override**; las clases tienen mismos
métodos pero diferentes resultados y en algunos casos puede que incluso distintos
procemientos.

```java

// Definimos la clase Gallina (Una manera de poner y empollar huevos)
public class Gallina implements PonerHuevos {

    @Override
    public void ponerHuevo(String color) {
        System.out.println("La gallina pone un huevo de color " + color);
    }

    @Override
    public void empollarHuevo(int cantidad) {
        System.out.println("La gallina está empollando " + cantidad + " huevos.");
    }
}

// Definimos la clase Pato (Otra manera de poner y empollar huevos)
public class Pato implements PonerHuevos {


    @Override
    public void ponerHuevo(String color) {
        if (color.equalsIgnoreCase("DORADO")){
            System.out.println("Oh, UN HUEVO DE GANZA!!");
            return; //Retorna un caso Unico diferente a la gallina
        }
        System.out.println("El pato pone un huevo de color " + color);
    }

    @Override
    public void empollarHuevo(int cantidad) {
        int nuevacantidad = cantidad + 1;   //Suma uno a la cantidad actual a diferencia de la gallina
        System.out.println("El pato está empollando " + nuevacantidad + " huevos.");
    }
}
```

Clase Main para ejecutar y enviar los parametros para nuestro código.
```java
// Clase Main para probar nuestro código
public class Main {
    public static void main(String[] args) {
        // Creamos objetos de Gallina y Pato
        PonerHuevos gallina = new Gallina();
        PonerHuevos pato = new Pato();

        // Llamamos a los métodos
        gallina.ponerHuevo("blanco");
        gallina.empollarHuevo(5);

        pato.ponerHuevo("dorado");
        pato.empollarHuevo(3);
    }
}
```

**Salida**
```sh
La gallina pone un huevo de color blanco.
La gallina está empollando 5 huevos.
Oh, UN HUEVO DE GANZA!!
El pato está empollando 4 huevos.
```
