package Ejercicios;

public class Fibonacci {

    // Método que genera los primeros N números de Fibonacci
    public static void generarFibonacci(int N) {
        int num1 = 0, num2 = 1;

        System.out.print("Los primeros " + N + " números de Fibonacci son: ");

        // Genera los primeros N números de Fibonacci
        for (int i = 1; i <= N; i++) {
            System.out.print(num1 + " ");

            // Calcular el siguiente número de Fibonacci
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Valor de N
        int N = 10;

        // Llamada al método para generar la secuencia de Fibonacci
        generarFibonacci(N);
    }
}

