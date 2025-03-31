# Java Net
**Versión:** _JDK 1.0_

Esta libreria proporciona clases para la programación de redes, como 
por ejemplo **URL, HttpURLConection, Socket, etc.** a continuación
veremos unos ejemplos:

---

## 1. InetAddress - _Obtener Información IP o Dominio_
Permite resolver nombres de dominio a IP Address

```java
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress direccion = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + direccion.getHostName());
            System.out.println("IP Address: " + direccion.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("No se pudo obtener la dirección.");
            e.printStackTrace();
        }
    }
}
```
Obtiene la IP de **Google**

---

## 2. URL y URLConection - _Leer datos de una pagina Web_
La clase **URL** permite conectarse a una URL y **URLConection** facilita la 
comunicación con el servidor.

```java
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection conexion = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));

            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer la URL.");
            e.printStackTrace();
        }
    }
}
```
Lee el contenido **HTML** de _https://www.example.com_

---

## 3. ServerSocket y Socket - _Comunicación CLiente | Servidor_
Las clases **ServerSocket y Socket** permiten crear servicores y clientes en Java.

**Servidor:**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        try (ServerSocket servidor = new ServerSocket(5000)) {
            System.out.println("Servidor esperando conexiones...");
            Socket socket = servidor.accept();
            System.out.println("Cliente conectado.");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

            String mensaje = entrada.readLine();
            System.out.println("Cliente dice: " + mensaje);

            salida.println("Hola desde el servidor");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Cliente:**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            salida.println("¡Hola, servidor!");
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
✅ El servidor escucha en el puerto 5000, el cliente se conecta y envía un mensaje.

---

## 4. DatagramSocket y DatagramPacket - _Comunicación UDP_
A diferencia se _Socket_ UDP no necesita una conexión persistente.

**Servidor UDP**
```java
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerExample {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[] buffer = new byte[1024];
            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);

            System.out.println("Servidor UDP esperando mensaje...");
            socket.receive(paquete);

            String mensaje = new String(paquete.getData(), 0, paquete.getLength());
            System.out.println("Mensaje recibido: " + mensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Cliente UDP**
```java
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientExample {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            String mensaje = "Hola, servidor UDP!";
            byte[] buffer = mensaje.getBytes();
            InetAddress direccion = InetAddress.getByName("localhost");

            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, direccion, 9876);
            socket.send(paquete);
            System.out.println("Mensaje enviado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
✅ El cliente envía un mensaje UDP al servidor en el puerto 9876.