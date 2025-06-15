# Instrucciones - Lenguaje C++

## Descripción del problema

Desarrollar un programa en C++ que determine si un número entero ingresado por el usuario es un **número palíndromo**.  
Un número se considera palíndromo cuando se lee igual de izquierda a derecha que de derecha a izquierda.

**Ejemplos:**
- `121` → palíndromo ✅
- `123` → no es palíndromo ❌
- `1221` → palíndromo ✅

## Explicación del código
Función esPalindromo(int numero)
1. Guarda el número original.
2. Usa un bucle while para invertir el número:
   - Toma el último dígito (numero % 10).
   - Lo agrega al final del número invertido.
   - Elimina ese dígito del número original (numero /= 10).
3. Compara si el número invertido es igual al original.

Función main()
1. Pide al usuario un número.
2. Llama a la función esPalindromo() con ese número.
3. Muestra si es palíndromo o no según el resultado.

## Cómo compilar y ejecutar en VS Code
1. Tener **instalado un compilador C++**, como `g++`.  
   Recomendación para Windows: [MinGW Installer (descarga directa)](https://github.com/Vuniverse0/mingwInstaller/releases/download/1.2.1/mingwInstaller.exe)  
   Este instalador es **online**, por lo que requiere conexión a internet.
2. Agregar la carpeta `bin` del compilador a las **variables de entorno** del sistema (`PATH`).

3. Tener **Visual Studio Code (VS Code)** instalado.
4. Instalar la extensión oficial de **C/C++** de Microsoft desde la tienda de extensiones de VS Code.

5. Tener **Visual Studio Code (VS Code)** instalado.
6. Instalar la extensión oficial de **C/C++** de Microsoft desde la tienda de extensiones de VS Code.
7. Escribe en la terminal esto para compilar y generar un ejecutable llamado palindromo.exe: `g++ palindromo.cpp -o palindromo`
8. Ejecuta el programa en la terminal: `./palindromo`
Nota: En caso de que se abra una ventana al ejecutar el archivo.cpp solo introduce el dato, y ejecuta automaticamente la terminal se vuelve a introducir el dato ejecutando correctamente el programa.




