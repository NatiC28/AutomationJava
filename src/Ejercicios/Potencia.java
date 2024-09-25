package Ejercicios;

public class Potencia {

    // Método que calcula a elevado a la potencia
    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente); // Usar Math.pow para calcular la potencia
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Base y potencia
        double a = 2;
        int potencia = 8;

        // Llamada al método para calcular la potencia
        double resultado = calcularPotencia(a, potencia);

        // Imprimir el resultado en la consola
        System.out.printf("%.2f elevado a la potencia %d es: %.2f%n", a, potencia, resultado);
    }
}
