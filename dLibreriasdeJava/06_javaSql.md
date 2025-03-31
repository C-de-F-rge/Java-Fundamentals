# Java SQL
**Versión:** _JDK 1.1_

Esta Libreria contiene clases para interactuar con bases de datos 
relacionales, como **Connection, Statement, ResultSet, etc.** a
continuación veremos su aplicación.

## 1. Conectar a una base de datos MySQL

**Dependencia:**
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

**Conectar la BD:**
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
    }
}
```

---

## 2.  Crear una tabla en la base de datos

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "nombre VARCHAR(100), "
                + "email VARCHAR(100))";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement()) {
            
            stmt.executeUpdate(sql);
            System.out.println("✅ Tabla 'usuarios' creada correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al crear la tabla: " + e.getMessage());
        }
    }
}
```

---


## 3. Insertar datos en la base de datos

```java
import java.sql.*;

public class InsertarDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            
            pstmt.setString(1, "Juan Pérez");
            pstmt.setString(2, "juan@example.com");
            pstmt.executeUpdate();
            
            System.out.println("✅ Usuario insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar datos: " + e.getMessage());
        }
    }
}
```

---

## 4. Leer datos desde la base de datos

```java
import java.sql.*;

public class LeerDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        String sql = "SELECT * FROM usuarios";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");

                System.out.println("👤 ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al leer datos: " + e.getMessage());
        }
    }
}
```

---

## 5. Actualizar datos
```java
import java.sql.*;

public class ActualizarDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        String sql = "UPDATE usuarios SET email = ? WHERE nombre = ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {

            pstmt.setString(1, "nuevoemail@example.com");
            pstmt.setString(2, "Juan Pérez");
            int filasActualizadas = pstmt.executeUpdate();

            System.out.println("✅ " + filasActualizadas + " fila(s) actualizada(s).");
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar datos: " + e.getMessage());
        }
    }
}
```

---

## 6. Eliminar datos

```java
import java.sql.*;

public class EliminarDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "password";

        String sql = "DELETE FROM usuarios WHERE nombre = ?";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {

            pstmt.setString(1, "Juan Pérez");
            int filasEliminadas = pstmt.executeUpdate();

            System.out.println("✅ " + filasEliminadas + " fila(s) eliminada(s).");
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar datos: " + e.getMessage());
        }
    }
}
```

