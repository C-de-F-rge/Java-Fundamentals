## Throws en Java
Cuando un método puede generar una excepción pero no la maneja,
usamos throws para obligar a quien lo llame a manejar la excepción.

## ✅ Ejemplo con throws
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
        }
    }

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);
        System.out.println(scanner.nextLine());
    }
}
```

**Salida**
```sh
Error: El archivo no se encontró.
```