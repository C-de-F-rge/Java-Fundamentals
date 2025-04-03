# transient en Java

El modificador transient se usa para indicar que un campo no debe ser serializado.

- 🔹 Evita que ciertos atributos de un objeto se guarden en archivos o se envíen por red.
- 🔹 Útil para datos sensibles o temporales (como contraseñas o información calculada).
- 🔹 Solo se usa en variables de instancia (no en métodos, clases o variables locales).

#### serealizar: 
Serializar en Java significa convertir un objeto en bytes para poder almacenarlo, 
enviarlo por la red o guardarlo en una base de datos. Luego, se puede deserializar 
para reconstruir el objeto original.

## Ejemplo:

```java
import java.io.*;

class Usuarios implements Serializable {
    private static final long serialversionUID = 1L;

    String nombre;
    transient String contraseña; //NO SERIALIZABLE

    public Usuarion (Stirng nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
}
```
### Nota:
Este campo es importante pare indicar que nosotros controlamos la versión de la
clase, es decir que si la editamos y la deserializamos no marque error al ver que
la clase ha cambiado.

```java
private static final long serialVersionUID = 1L;
```

---

```java
public class Main {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Yoi", "12345");
        
        // Serializar (guardar)
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.ser"));
        out.writeObject(usuario);
        out.close();
        
        // Deserializar (leer)
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.ser"));
        Usuario usuarioCargado = (Usuario) in.readObject();
        in.close();
        
        System.out.println("Nombre: " + usuarioCargado.nombre); // Se guarda
        System.out.println("Contraseña: " + usuarioCargado.contraseña); // Será null
    }
}
```
### Salida:
```makefile
Nombre: Yoi
Contraseña: null
```