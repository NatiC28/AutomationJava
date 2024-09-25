package Ejercicios;

public class AreaTriangulo {

    // Metodo que calcula el área de un triángulo
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2; // Fórmula: (base * altura) / 2
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Base y altura del triángulo
        double base = 5;
        double altura = 8;

        // Llamada al método para calcular el área
        double area = calcularArea(base, altura);

        // Imprimir el resultado en la consola
        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);
    }
}
