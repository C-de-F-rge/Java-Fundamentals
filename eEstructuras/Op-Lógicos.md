# Operadores Logicos En Java

Los operadores lógicos se utilizan para combinar condiciones y evaluar 
expresiones booleanas. Aquí tienes una lista de los operadores lógicos 
en Java junto con sus nombres y descripciones:

# Nota: 
No confundir el Operador de Asignación **=** con el operador de comparación
el cual es **==**

**Ejemplo de Aplicación**
```java
int numero = 19; //Asigna un valor
int numero2 = 20;

boolean bool = (numero == numero2); //Compara si ambos valores son iguales.
System.out.println(bool); //Devuelve False
```

---

# 1. AND Lógico (_&&_)
Evalúa si ambas condiciones son verdaderas. Si la primera condición es 
falsa, no evalúa la segunda condición (evaluación cortocircuitada).

**Ejemplo de Aplicación**

```java
if (bool1 == true && bool2 == true){
    System.out.println("Ambos son Verdaderos")
} else{
    System.out.println("Parece que alguno o ambos es false")
}
```

# 1.2 AND a Nivel de Bits (_&_)
Evalúa ambas condiciones sin importar si la primera es falsa (no cortocircuitada).

**Ejemplo de Aplicación**

```java
if (bool1 == true & bool2 == true){
    System.out.println("Ambos son Verdaderos")
} else{
    System.out.println("Parece que el primero fue falso; si no, fue el segundo")
}
```

---

# 2. OR Lógico (_||_)
Evalúa si al menos una de las condiciones es verdadera. Si la primera condición 
es verdadera, no evalúa la segunda condición (evaluación cortocircuitada).

**Ejemplo de Aplicación**

```java
if (bool1 == true || bool2 == true){
    System.out.println("Parece que el primero; si no, el segundo es verdadero")
} else{
    System.out.println("Ninguno es verdadero")
}
```

# 2.2 OR a Nivel de Bits (_|_)
Evalúa ambas condiciones sin importar si la primera es verdadera (no cortocircuitada).

**Ejemplo de Aplicación**

```java
if (bool1 == true | bool2 == true){
    System.out.println("Parece que alguno o ambos son verdaderos")
} else{
    System.out.println("Ninguno es verdadero")
}
```

---

# 3. NOT Lógico (_!_)
Invierte el valor de una condición booleana.

**Ejemplo de Aplicación**

```java
if (bool1 !== true){//Si bool1 no es verdader o si es falso
    System.out.println("bool1 no es verdader")
} else{
    System.out.println("bool1 es verdadero")
}

//Además tambien se puede usar con otros tipos de condiciones:

if (num1 !== 0){//Si num1 es diferente a cero
    System.out.println("num1 es diferente a cero")
} else{
    System.out.println("oh no, parece que num1 es cero")
}
```

---

# 4. XOR (_^_)
Evalúa si exactamente una de las condiciones es verdadera, pero no ambas.

**Ejemplo de Aplicación**

```java
boolean a = true;
boolean b = false;

// Usando || (OR Lógico)
if (a || b) {
    System.out.println("Al menos una de las condiciones es verdadera.");
}

// Usando ^ (XOR Lógico)
if (a ^ b) {
    System.out.println("Exactamente una de las condiciones es verdadera.");
}
```