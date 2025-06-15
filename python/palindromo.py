# Solicitamos al usuario que ingrese un número
numero = input("Ingresa un número: ")

# Invertimos el número y lo comparamos con el original
if numero == numero[::-1]:
    print(numero, "es un palíndromo.")
else:
    print(numero, "no es un palíndromo.")