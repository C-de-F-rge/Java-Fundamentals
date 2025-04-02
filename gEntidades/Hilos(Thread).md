# Introducción a los Thread (Hilos) en Java

Los hilos (threads) en Java son la unidad más pequeña de procesamiento que puede ejecutarse de manera independiente dentro de un programa. Se utilizan para ejecutar múltiples tareas simultáneamente, lo que permite aprovechar mejor los recursos del sistema y mejorar el rendimiento de las aplicaciones.

***

## ¿Cómo se usan los hilos en Java?

### Creando un hilo extendiendo Thread

```java
class MiHilo extends Thread{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hilo: " + Thread.currentThread().getName() + "->" + i);
            try{
                Thread.sleep(1000); //Hace una pausa de 1 segundo.
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();

        hilo1.start(); //Inicia el primer Hilo.
        hilo2.start(); //Iniciar el Segundo Hilo.
    }
}
```

---

### Creando un hilo implementando Runnable (Más recomendado)

```java
class MiRunnable implements Runnable{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hilo: " + Thread.currentThread().getName() + "->" + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
} 

public class Main{
    public static void main(String[] args){
        Thread hilo1 = new Thread(new MiRunnable());
        Thread hilo2 = new Thread(new MiRunnable());

        hilo1.start();
        hilo2.start();
    }
}
```

---

## ¿En qué casos se usan los hilos?

### 📌 1. Ejecutar tareas en segundo plano
Ejemplo: Simular una descarga de archivo sin bloquear el programa.

```java
class DescargarArchivo implements Runnable{
    public void run(){
        System.out.println("Descarga Iniciada...");
        try{
            Thread.sleep(5000);//Simula descarga de 5 segundos.
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Descarga Completada.");
    }
}

public class Main{
    public static void main(String[] args){
        Thread hilo = new Thread(new DescargarArchivo());
        hilo.start();
        System.out.println("Puedes seguir usando el programa mientras se descarga el archivo...");
    }
}
```

---

### 📌2. Manejar múltiples clientes en un servidor

```java
public class ClientSession implements Runnable{
    private String nombre;

    public ClientSession(String nombre){
        this.nombre = nombre;
    }

    public void run(){
        System.out.println(nombre + "Está Conectado");
        try{
            Thread.sleep(10000); // Simula actividad del usuario por 9 segundos
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sesción Terminada...");
    }
}

public class Main{
    public static void main(String[] args){
        Thread hilo1 = new Thread(new ClientSession("Usuario 1"));
        Thread hilo2 = new Thread(new ClientSession("Usuario 2"));
        hilo1.start();
        hilo2.start();
    }
}
```

---

### 📌 3. Mejorar el rendimiento procesando datos en parale

```java
public class Suma implements Runnable{
    public int inicio, fin;
    public long resultado;

    public Suma(int inicio, int fin){
        this.inicio = inicio;
        this.inicio = fin;
    }

    public void run(){
        for(int i = inicio; i <= fin; i++){
            resultado += i;
        }
        System.out.println("\nInicio: " + inicio + "\nfinal: " + fin + "\nresultado: " +resultado);
    }
}

public class Main{
    Thread hilo1 = new Thread(new Suma(1,10));
    Thread hilo2 = new Thread(new Suma(50,100));
    hilo1.start();
    hilo2.start();
}
```




