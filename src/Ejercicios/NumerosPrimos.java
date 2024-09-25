package Ejercicios;

public class NumerosPrimos {
    // Metodo que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número tiene divisores además de 1 y él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si se encuentra un divisor, no es primo
            }
        }
        return true; // Si no se encuentran divisores, es primo
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a verificar
        int numero = 29;

        // Llamada al método para verificar si es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
}
