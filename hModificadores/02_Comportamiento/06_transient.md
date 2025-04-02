# transient en Java

El modificador transient se usa para indicar que un campo no debe ser serializado.

- 🔹 Evita que ciertos atributos de un objeto se guarden en archivos o se envíen por red.
- 🔹 Útil para datos sensibles o temporales (como contraseñas o información calculada).
- 🔹 Solo se usa en variables de instancia (no en métodos, clases o variables locales).

#### serealizar: 
Serializar en Java significa convertir un objeto en bytes para poder almacenarlo, 
enviarlo por la red o guardarlo en una base de datos. Luego, se puede deserializar 
para reconstruir el objeto original.

