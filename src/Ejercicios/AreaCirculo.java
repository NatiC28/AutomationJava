package Ejercicios;

public class AreaCirculo {

    // Método que calcula el área de un círculo
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2); // Fórmula: π * r^2
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Radio del círculo
        double radio = 7;

        // Llamada al método para calcular el área
        double area = calcularArea(radio);

        // Imprimir el resultado en la consola
        System.out.printf("El área del círculo con radio %.2f es: %.2f%n", radio, area);
    }
}
