# Modificador de Comportamiento Synchronized en Java

El modificador **synchronized** se usa para controlar el acceso a métodos o
bloques de código en entornos multihilo (threads).

## 📌 1. synchronized en métodos
```java
class Contador{
    private int cuenta = 0;

    //🔹 Este método solo puede ser ejecutado por un hilo a la vez
    public synchronized void incrementar(){
        cuenta++;
    }

    public int getCuenta(){
        return cuenta;
    }
}

public class Main{
    public static void main(String[] args){
        Contador contador = new Contador();

        // 🔽 Dos hilos incrementando el contador al mismo tiempo
        Thread hilo1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                contador.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        try{
            hilo1.join();
            hilo2.join();
        }catch(InterruptedException e){
            e.printSteckTrace();
        }

        // ✅ El resultado siempre será 2000 gracias a `synchronized`
        System.out.println("Cuenta final: " + contador.getCuenta());

    }
}
```
---

## 📌 2. synchronized en bloques de código
En lugar de sincronizar todo el método, puedes sincronizar solo una
parte del código usando un bloque synchronized.

```java
class Banco{
    private int saldo = 100;
    
    public void retirarDinero(){
        synchronized (this){
            if(saldo >= cantidad){
                saldo -= cantidad;
                System.out.println("Retiro exitoso: " + cantidad);
            }else{
                System.out.println("Fondos Insuficiente");
            }
        }
    }

    public int getSaldo(){
        return saldo;
    }
}
```

## 📌 3. synchronized en métodos estáticos
También puedes usar synchronized en métodos static. En este caso,
la sincronización se aplica a nivel de clase y no de instancia.

```java
class Utilidad {
    private static int contador = 0;

    public static synchronized void incrementar() {
        contador++;
    }
}
```