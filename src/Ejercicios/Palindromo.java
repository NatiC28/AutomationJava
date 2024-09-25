package Ejercicios;

public class Palindromo {

    // Método que determina si un número es un palíndromo
    public static boolean esPalindromo(int numero) {
        int original = numero; // Guardar el número original
        int invertido = 0;

        // Invertir el número
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            invertido = invertido * 10 + digito; // Construir el número invertido
            numero /= 10; // Eliminar el último dígito
        }

        // Comparar el número original con el invertido
        return original == invertido;
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a verificar
        int numero = 1221;

        // Llamada al método para determinar si es palíndromo
        if (esPalindromo(numero)) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }
    }
}
