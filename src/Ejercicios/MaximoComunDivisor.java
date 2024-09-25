package Ejercicios;

public class MaximoComunDivisor {

    // Método que calcula el máximo común divisor (MCD) de dos números
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b; // Almacenar b en una variable temporal
            b = a % b; // Calcular el resto
            a = temp; // Asignar el valor temporal a a
        }
        return a; // El MCD es el valor final de a
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int a = 48; // Primer número
        int b = 18; // Segundo número

        // Llamada al método para calcular el MCD
        int mcd = calcularMCD(a, b);

        // Imprimir el resultado en la consola
        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
    }
}
