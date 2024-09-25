package Ejercicios;

public class SumaNumerosNaturales {

    // Método que calcula la suma de los primeros N números naturales usando la fórmula
    public static int sumaPrimerosN(int N) {
        return (N * (N + 1)) / 2; // Usando la fórmula
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Valor de N
        int N = 50;

        // Llamada al método para calcular la suma
        int suma = sumaPrimerosN(N);

        // Imprimir el resultado en la consola
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}

