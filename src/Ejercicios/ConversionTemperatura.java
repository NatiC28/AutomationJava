package Ejercicios;

public class ConversionTemperatura {

    // Metodo que convierte Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Fórmula de conversión
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Temperatura en Celsius
        double celsius = 25;

        // Llamada al método para convertir a Fahrenheit
        double fahrenheit = celsiusAFahrenheit(celsius);

        // Imprimir el resultado en la consola
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
}

