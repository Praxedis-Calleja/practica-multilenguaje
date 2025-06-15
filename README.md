# Palíndromos en 4 lenguajes de programación

# 1. Introducción general

Este proyecto tiene como objetivo implementar un programa que verifique si un número entero es **palíndromo** utilizando cuatro lenguajes de programación diferentes:  
- **C++**
- **Java**
- **Python**
- **Prolog**

Un número se considera **palíndromo** si se lee igual de izquierda a derecha que de derecha a izquierda.  
Por ejemplo:
- `121` → palíndromo  
- `123` → o es palíndromo  
- `1221` → palíndromo  

Este proyecto permite comparar la lógica, la sintaxis y la ejecución de un mismo problema resuelto en múltiples lenguajes, fomentando el aprendizaje práctico y el análisis del paradigma de cada uno.

# 2. Pasos generales para usar Visual Studio Code con los 4 lenguajes

**C++**

1. **Instalar MinGW** (o cualquier compilador C++)  
   [https://github.com/Vuniverse0/mingwInstaller/releases](https://github.com/Vuniverse0/mingwInstaller/releases)

2. Agregar la carpeta `bin` del compilador a las variables de entorno del sistema (`PATH`).

3. Instalar **Visual Studio Code** y la extensión **C/C++ (by Microsoft)**.

4. Guardar el código en un archivo `.cpp`.

5. En la terminal de VS Code, compilar con:

   ```bash
   g++ archivo.cpp -o program

6. Ejecutar el programa
./programa

**Java**
1. Instalar el JDK (Java Development Kit) desde:
`https://www.oracle.com/java/technologies/javase-downloads.html`

2. Instalar la extensión "Extension Pack for Java" en VS Code.

3. Guardar el código en un archivo `.java` con el mismo nombre que la clase.

4. En la terminal de VS Code:
Ejecutar:
java Archivo

**Python**
1. Instalar Python desde:
`https://www.python.org/downloads/`

2. Instalar la extensión Python (by Microsoft) en VS Code.

3. Guardar el archivo con extensión `.py`.

4. Ejecutar el programa en la terminal con: `python archivo.py`

**Prolog**
1. Instalar SWI-Prolog desde:
`https://www.swi-prolog.org/Download.html`

2. Instalar la extensión Prolog (by arduino) en VS Code.

3. Guardar el archivo con extensión `.pl`.

4. En la terminal integrada de VS Code:
 - Iniciar Prolog: `swipl`
 - Cargar el archivo: ['archivo.pl'].
 - Ejecutar la consulta: `?- es_palindromo(121)`.
