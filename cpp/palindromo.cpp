#include <iostream>
using namespace std;

// Función que verifica si un número es palíndromo
bool esPalindromo(int numero) {
    int original = numero;
    int invertido = 0;

    // Invertimos el número
    while (numero > 0) {
        int digito = numero % 10;
        invertido = invertido * 10 + digito;
        numero /= 10;
    }

    // Comparamos el número original con el invertido
    return original == invertido;
}

int main() {
    int numero;

    // Solicitar al usuario que ingrese un número
    cout << "Ingrese un numero: ";
    cin >> numero;

    // Verificar si es palíndromo y mostrar el resultado
    if (esPalindromo(numero)) {
        cout << "Es un numero palindromo." << endl;
    } else {
        cout << "No es un numero palindromo." << endl;
    }

    return 0; 
}
