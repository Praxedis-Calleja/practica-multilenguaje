import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
         // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
// Llamamos a la función esPalindromo y mostramos el resultado
        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
        }
    }

    // Función que determina si un número es palíndromo
    public static boolean esPalindromo(int numero) {
        int original = numero;
        int reverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        // Comparamos el número original con el reverso
        return original == reverso;
    }
}
