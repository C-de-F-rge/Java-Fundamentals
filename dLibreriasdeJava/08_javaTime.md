# Java Time
**Versión:** _JDK 8_

El paquete **java.time** se introdujo en **Java 8** como una mejor alternativa a las antiguas clases **Date**, **Calendar** y **SimpleDateFormat**. Es más fácil de usar, más preciso y menos propenso a errores.

## 1. Obtener la fecha y hora actual (**LocalDate, LocalTime, LocalDateTime**)
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class FechaHoraActual {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime fechaHora = LocalDateTime.now();

        System.out.println("📅 Fecha actual: " + fecha);
        System.out.println("⏰ Hora actual: " + hora);
        System.out.println("📆 Fecha y Hora actual: " + fechaHora);
    }
}
```

---

## 2. Crear una fecha/hora específica
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class FechaEspecifica {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2025, 3, 29);
        LocalTime hora = LocalTime.of(14, 30, 0);
        LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

        System.out.println("📅 Fecha específica: " + fecha);
        System.out.println("⏰ Hora específica: " + hora);
        System.out.println("📆 Fecha y Hora específica: " + fechaHora);
    }
}
```

---

##  3. Sumar y restar tiempo (**plus() y minus()**)
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class SumarRestarTiempo {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now().plusDays(5);
        LocalTime hora = LocalTime.now().minusHours(2);
        LocalDateTime fechaHora = LocalDateTime.now().plusWeeks(2).minusMinutes(30);

        System.out.println("📅 Fecha en 5 días: " + fecha);
        System.out.println("⏰ Hora hace 2 horas: " + hora);
        System.out.println("📆 Fecha y Hora en 2 semanas y -30 min: " + fechaHora);
    }
}
```

---

## 4. Comparar fechas y horas (**isBefore(), isAfter(), isEqual()**)
```java
import java.time.LocalDate;
import java.time.LocalTime;

public class CompararFechas {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2025, 3, 29);
        LocalDate fecha2 = LocalDate.of(2025, 4, 10);

        System.out.println("¿Fecha1 es antes de Fecha2? " + fecha1.isBefore(fecha2));
        System.out.println("¿Fecha1 es después de Fecha2? " + fecha1.isAfter(fecha2));
        System.out.println("¿Son iguales? " + fecha1.isEqual(fecha2));
    }
}
```

---

## 5. Convertir String a fecha/hora (**parse()**)
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ParsearString {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.parse("2025-03-29");
        LocalTime hora = LocalTime.parse("14:30:00");
        LocalDateTime fechaHora = LocalDateTime.parse("2025-03-29T14:30:00");

        System.out.println("📅 Fecha desde String: " + fecha);
        System.out.println("⏰ Hora desde String: " + hora);
        System.out.println("📆 Fecha y Hora desde String: " + fechaHora);
    }
}
```

---

## 6. Formatear fechas (**DateTimeFormatter**)
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatearFecha {
    public static void main(String[] args) {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String fechaFormateada = fechaHora.format(formato);
        System.out.println("📆 Fecha formateada: " + fechaFormateada);
    }
}
```

---

## 7. Zonas horarias (**ZonedDateTime**)
```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonaHoraria {
    public static void main(String[] args) {
        ZonedDateTime fechaHoraNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime fechaHoraTokio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("🗽 Hora en Nueva York: " + fechaHoraNY);
        System.out.println("🗾 Hora en Tokio: " + fechaHoraTokio);
    }
}
```

---

##  8. Diferencia entre fechas y horas (**Duration, Period**)
```java
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DiferenciaFechas {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2025, 3, 1);
        LocalDate fecha2 = LocalDate.of(2025, 3, 29);
        Period diferencia = Period.between(fecha1, fecha2);

        System.out.println("📅 Diferencia: " + diferencia.getDays() + " días");

        LocalDateTime hora1 = LocalDateTime.of(2025, 3, 29, 12, 0);
        LocalDateTime hora2 = LocalDateTime.of(2025, 3, 29, 14, 30);
        Duration duracion = Duration.between(hora1, hora2);

        System.out.println("⏳ Duración en minutos: " + duracion.toMinutes() + " minutos");
    }
}
```