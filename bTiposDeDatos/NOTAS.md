## ALGUNAS NOTAS IMPORTANTES A TENER EN CUENTA

primero que todo tengamos en cuenta que los tipos de datos se dividen en dos grupos
datos de tipo **primitivo** y datos de tipo **referencia**. Tengamos entonces en 
cuenta el siguiente caso:

```
String teto1 = "Hola";
string texto2 = "Mundo";

```
Donde **string** es un primitivo que almacena un dato de manera STACK, mientras que
**String** el cual es un objeto que hereda de la clase misma métodos como por ejemplo
**length(), charAt(int index), isEmpty(), isBlank()** por tanto lo que se guarde en este
tipo de objetos requiere un almacenamiento de tipo **heap**. 
NOTA:(Revisar la sección[Clases Envolventes](/cClasesEnvolventes/aCLASES_ENVOLVENTES.md))
