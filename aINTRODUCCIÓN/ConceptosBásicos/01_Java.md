## JAVA

Es un Lenguaje de Programación de ([Alto Nivel](/aINTRODUCCIÓN/ConceptosBásicos/00_Definiciones.md)) y ([Orientado a Objetos](/aINTRODUCCIÓN/ConceptosBásicos/00_Definiciones.md))
creado por ([**James Gosling**](https://en.wikipedia.org/wiki/James_Gosling)) en el año 1991.

---

# **Ejecución de Java**

**Codigo de Ejemplo**
```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```

---

# 1. Javac
El compilador de Java **(javac)** es el programa encargado de convertir el código fuente **(.java)** 
en bytecode **(.class).**

```sh
javac MiPrograma.java  # Compila el código a bytecode
java MiPrograma        # Ejecuta el programa en la JVM
```

# 2. Carga las Clases (_ClassLoader_)

```bash
java HolaMundo
```

# 3. Verifica el ByteCode (_Bytecode Verifier_)
La JVM revisa que el bytecode sea seguro y válido:
- Que no haya accesos ilegales a memoria.
- Que las variables sean usadas correctamente.

# 4. Ejecuta en la JVM (_Interpretación o JIT Copilation_)
Finalmente, la JVM ejecuta el programa:
- Puede interpretar el bytecode línea por línea.
- O usar JIT (Just-In-Time Compilation) para optimizar y convertirlo en código máquina nativo.

--- 

# 5. Resultado

```nginx
Hola Mundo
```
