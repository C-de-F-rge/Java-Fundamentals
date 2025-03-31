# Java Nio
**version:** _JDL 1.4_

Esta libreria **Java New Input/Output** contiene clases para la entrada y salida 
no bloqueante como por ejemplo **Path, Files, ByteFutter, etc.**

## 1. Leer un archivo con **java.nio.file.Files**
si solo quieres leer el contenido de un archivo de manera rapida utiliza
_Files.readAllLines()_.

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("archivo.txt");

        try {
            List<String> lineas = Files.readAllLines(ruta);
            lineas.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

---

## 2. Escribir en un archivo con **java.nio.file.Files**
Si quieres escribir texto rápidamente en un archivo, usa _Files.write()_.

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;

public class EscribirArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("salida.txt");
        String contenido = "Hola, esto es NIO!\nOtra línea más.";

        try {
            Files.write(ruta, Arrays.asList(contenido));
            System.out.println("✅ Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al escribir el archivo: " + e.getMessage());
        }
    }
}
```

---

## 3. Leer un archivo usando **FileChannel y ByteBuffer**
Para lectura más eficiente, usamos _FileChannel y ByteBuffer_.

```java
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;

public class LeerConChannel {
    public static void main(String[] args) {
        Path ruta = Path.of("archivo.txt");

        try (FileChannel canal = FileChannel.open(ruta, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) Files.size(ruta));
            canal.read(buffer);
            buffer.flip(); // Prepara el buffer para leer

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get()); // Convertir byte a char
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

---

##  4. Escribir un archivo usando **FileChannel y ByteBuffer**
Aquí escribimos datos en un archivo de forma eficiente con _ByteBuffer_.

```java
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class EscribirConChannel {
    public static void main(String[] args) {
        Path ruta = Path.of("salida_nio.txt");

        try (FileChannel canal = FileChannel.open(ruta, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.wrap("Hola desde NIO!".getBytes());
            canal.write(buffer);
            System.out.println("✅ Datos escritos correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al escribir el archivo: " + e.getMessage());
        }
    }
}
```

---

## 5. Copiar archivos con **Files.copy()**
Para copiar un archivo, usa Files.copy().

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class CopiarArchivo {
    public static void main(String[] args) {
        Path origen = Path.of("archivo.txt");
        Path destino = Path.of("copia.txt");

        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Archivo copiado correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al copiar el archivo: " + e.getMessage());
        }
    }
}
```

---

## 6. Mover o renombrar archivos
Podemos mover o renombrar archivos fácilmente con Files.move().

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class MoverArchivo {
    public static void main(String[] args) {
        Path origen = Path.of("archivo.txt");
        Path destino = Path.of("nueva_carpeta/archivo_movido.txt");

        try {
            Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Archivo movido correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al mover el archivo: " + e.getMessage());
        }
    }
}
```

---

## 7. Monitorizar cambios en una carpeta **WatchService**
Si quieres detectar cambios en una carpeta en tiempo real, usa _WatchService_.

```java
import java.nio.file.*;
import java.io.IOException;

public class MonitorearCarpeta {
    public static void main(String[] args) {
        Path carpeta = Paths.get("mi_carpeta");

        try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
            carpeta.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
                                      StandardWatchEventKinds.ENTRY_DELETE,
                                      StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("📂 Monitoreando cambios en " + carpeta);

            while (true) {
                WatchKey key = watcher.take(); // Espera eventos
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("📌 Evento detectado: " + event.kind() + " en " + event.context());
                }
                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
```