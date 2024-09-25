package Ejercicios;

import java.text.DecimalFormat;

public class Promedio {

    // Metodo que calcula el promedio de tres números
    public static double calcularPromedio(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Números a promediar
        int numero1 = 4;
        int numero2 = 9;
        int numero3 = 13;

        // Llamada al metodo para calcular el promedio
        double promedio = calcularPromedio(numero1, numero2, numero3);

        // Redondear el promedio a 2 decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String promedioFormateado = df.format(promedio);

        // Imprimir el resultado en la consola
        System.out.println("El promedio de " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + promedioFormateado);
    }
}

