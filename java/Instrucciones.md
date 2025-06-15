# Instrucciones - Programa en Java

## Descripción del problema
Crear una función en Java que determine si un número entero es un palíndromo (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda).

## Explicación del código
1. Se solicita un número al usuario.
2. Se calcula el reverso del número usando un ciclo `while` y operaciones matemáticas.
3. La siguiente linea de codigo: numero % 10: Extrae el último dígito del número.
4. La siguienete linea de codigo: reverso = reverso * 10 + digito: Agrega ese dígito al reverso.
5. La siguienete linea de codigo: numero /= 10: Quita el último dígito del número (divide entre 10 y descarta decimales).
6. Se compara el número original con el reverso.
7. Si son iguales, se muestra que es un palíndromo; de lo contrario, no lo es.

## Cómo compilar y ejecutar en VS Code
1. Tener instalado el JDK (Java Development Kit).
2. Tener configurado `javac` y `java` en el PATH del sistema.
3. Abre una terminal en VS Code.
4. Se instala la extencion de terminal de java
5. Ejecuta el programa con el siguiente comando: 
CMD
java palindromo.java

