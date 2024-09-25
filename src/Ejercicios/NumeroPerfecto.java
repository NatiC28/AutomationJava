package Ejercicios;

public class NumeroPerfecto {

    // Método que determina si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        // Calcular la suma de los divisores propios
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) { // Si i es un divisor
                sumaDivisores += i; // Sumar el divisor
            }
        }

        // Comparar la suma de los divisores con el número
        return sumaDivisores == numero;
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a verificar
        int numero = 28;

        // Llamada al método para determinar si es un número perfecto
        if (esNumeroPerfecto(numero)) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }
    }
}

