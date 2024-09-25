package Ejercicios;

public class Divisibilidad {

    // Método que determina si un número es divisible por 2, 3 o 5
    public static void verificarDivisibilidad(int numero) {
        boolean divisiblePor2 = (numero % 2 == 0);
        boolean divisiblePor3 = (numero % 3 == 0);
        boolean divisiblePor5 = (numero % 5 == 0);

        // Imprimir los resultados
        if (divisiblePor2) {
            System.out.println("El número " + numero + " es divisible por 2.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 2.");
        }

        if (divisiblePor3) {
            System.out.println("El número " + numero + " es divisible por 3.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 3.");
        }

        if (divisiblePor5) {
            System.out.println("El número " + numero + " es divisible por 5.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 5.");
        }
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = 45; // Número a verificar

        // Llamada al método para verificar la divisibilidad
        verificarDivisibilidad(numero);
    }
}

