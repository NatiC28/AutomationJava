package Ejercicios;

public class Factorial {

    // Metodo que calcula el factorial de un número
    public static long calcularFactorial(int n) {
        long resultado = 1; // El factorial de 0 y 1 es 1
        for (int i = 2; i <= n; i++) {
            resultado *= i; // Multiplicar cada número hasta n
        }
        return resultado; // Retornar el resultado
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a calcular el factorial
        int numero = 6;

        // Llamada al método para calcular el factorial
        long factorial = calcularFactorial(numero);

        // Imprimir el resultado en la consola
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
