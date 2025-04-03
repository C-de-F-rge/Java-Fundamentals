# Modificador de Comportamiento Volatile en Java
Si una variable es accedida por múltiples hilos sin volatile, un hilo podría
leer un valor desactualizado debido a la caché de CPU.


```java
class Tarea implements Runnable {
    private boolean ejecutar = true; // Sin volatile
    
    public void run() {
        while (ejecutar) {
            // Bucle infinito si ejecutar no se actualiza correctamente
        }
        System.out.println("Hilo finalizado.");
    }
    
    public void detener() {
        ejecutar = false; // Este cambio podría no ser visible en otros hilos
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Tarea tarea = new Tarea();
        Thread hilo = new Thread(tarea);
        hilo.start();
        
        Thread.sleep(1000); // Espera 1 segundo
        tarea.detener(); // Detiene el hilo
        
        System.out.println("Se intentó detener el hilo...");
    }
}
```

***

```java
class Tarea implements Runnable {
    private volatile boolean ejecutar = true; // Se actualiza en todos los hilos
    
    public void run() {
        while (ejecutar) { }
        System.out.println("Hilo finalizado.");
    }
    
    public void detener() {
        ejecutar = false; // Ahora sí se refleja en otros hilos
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Tarea tarea = new Tarea();
        Thread hilo = new Thread(tarea);
        hilo.start();
        
        Thread.sleep(1000);
        tarea.detener(); // Detiene el hilo
        
        System.out.println("Hilo detenido correctamente.");
    }
}
```
