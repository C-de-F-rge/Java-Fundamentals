# Count en los Streams

Cuenta la cantidad de elementos que tiene el stram

## 🧪 Ejemplo básico
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler");

long total = nombres.stream().count();

System.out.println("Total de nombres: " + total); // 3
```

## 🧪 Ejemplo con filtro
```java
List<String> nombres = List.of("Yoi", "Pedro", "Tyler", "Yamato");

long empiezanConY = nombres.stream()
    .filter(nombre -> nombre.startsWith("Y"))
    .count();

System.out.println("Nombres que empiezan con Y: " + empiezaConY); // 2
```

