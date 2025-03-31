## Java Io
**Versión:** _JDK 1.0_

Esta Libreria proporciona clases para la entrada y salida de datos como por
ejemplo: **File, InputStream, OutputStream, etc**; a continuación veremos
algunos ejemplos de aplicación.

---

## 1. File - _Manejo de Archivos_
Se utiliza para _crear, eliminar y verificar_ archivos y directorios

```java
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File archivo = new File("ejemplo.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
```

---

## 2. FileWriter y BufferedWriter - _Escribir en un Archivo_
_FileWriter_ Permite escribir en un archivo y _BufferedWriter_ lo hace más eficiente

```java
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ejemplo.txt", true))) {
            writer.write("Hola, este es un mensaje en el archivo.\n");
            writer.newLine();
            System.out.println("Texto escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
```

---

# 3. FileReader y BufferedReader - _Leer Un Archivo_
funciona al igual que el anterior pero para lectura de un archivo.

```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("ejemplo.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
```

---


# 4. FileImputStram y FileOutputStream - _Manejo de Bytes_
Para leer y escribir archivos en formato binario.

```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        String texto = "Esto es un mensaje en bytes.";

        //Escribir
        try (FileOutputStream fos = new FileOutputStream("archivo_binario.txt")) {
            fos.write(texto.getBytes());
            System.out.println("Archivo binario creado.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //leer
        try (FileInputStream fis = new FileInputStream("archivo_binario.txt")) {
            int caracter;
            while ((caracter = fis.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

# 5. ObjectInputStream y ObjectOutputStream - _Serialización_
Permite guardar y cargar _Objetos Completos_ en archivos.

```java
import java.io.*;

class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        Persona persona = new Persona("Yoi", 25);

        // Guardar objeto en archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(persona);
            System.out.println("Objeto guardado.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer objeto desde archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```
---



