# Instrucciones - Lenguaje Prolog

## Descripción del problema

Desarrollar un programa en Prolog que determine si un número entero ingresado por el usuario es un **número palíndromo**.  
Un número se considera palíndromo cuando se lee igual de izquierda a derecha que de derecha a izquierda.

## Explicación del código

### Predicado `numero_a_lista(N, Lista)`
1. Convierte el número `N` a una lista de caracteres (por ejemplo, `121` → `['1','2','1']`).
2. Luego convierte cada carácter en número (`'1'` → `1`), dando como resultado una lista de dígitos (`[1,2,1]`).

### Predicado `es_palindromo(N)`
1. Llama a `numero_a_lista/2` para obtener la lista de dígitos.
2. Usa `reverse/2` para invertir la lista.
3. Compara si la lista original es igual a su reverso. Si lo es, el número es palíndromo.


## Cómo compilar y ejecutar en VS Code
1. Instalar SWI-Prolog
2. Instalar la extensión de Prolog para VS Code
3. En la terminal, inicia el intérprete de Prolog escribiendo: `swipl` 
4. Estar dentro de la carpeta donde se encuentra el archivo palindromo.pl
4. En caso de realizar la consulta  usar la siguiente sintaxis: `consult('palindromo.pl').` 

## Ejemplo consulta
?- es_palindromo(121).
true

?- es_palindromo(123).
false