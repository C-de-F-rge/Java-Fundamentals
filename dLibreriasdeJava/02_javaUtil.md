# Java Util
**JDK:** 1.0

Esta Libreria proporciona clases utilitarias como por ejemplo los
**HashMap, ArrayList, Date, ETC.** a continución veremos un ejemplo
de aplicación:

```java
import java.util.*;

public class JavaUtilExample{
    public void main(String[] args){

        /*
                COLLECTIONS 
        */

        //📌ArrayList: Lista dinámica
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("es");
        lista.add("Increible");
        System.out.println("Lista: " + lista);

        //📌HashMap: Clave - Valor
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        System.out.println("Mapa: " + mapa);

        //📌HashSet: Conjunto sin Duplicados
        HashSet<String> conjunto = new HashSet<>(lista);
        conjunto.add("Java"); // Duplicado, no se agregará
        System.out.println("Conjunto: " + conjunto);

        // 📌Collections: Métodos de utilidad para listas
        Collections.shuffle(lista); // Mezcla los elementos
        System.out.println("Lista mezclada: " + lista);

        // 📌Comparator: Ordenar lista
        lista.sort(Comparator.naturalOrder());
        System.out.println("Lista ordenada: " + lista);

        /*
                OTRAS UTILIDADES 
        */

        // 📌Date y Calendar: Fechas
        Date fechaActual = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_MONTH, 5); // Sumar 5 días
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Fecha en 5 días: " + calendario.getTime());

        // 📌Random: Generación de números aleatorios
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Entre 0 y 99
        System.out.println("Número aleatorio: " + numeroAleatorio);

        // 📌Scanner: Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

         // 📌Timer: Ejecutar tarea después de un tiempo
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("¡Tiempo cumplido!");
                timer.cancel();
            }
        }, 3000); // Se ejecuta después de 3 segundos

        // 📌Optional: Evitar NullPointerException
        Optional<String> opcional = Optional.ofNullable(null);
        System.out.println("Optional tiene valor?: " + opcional.isPresent());

        scanner.close();
    }
}
```