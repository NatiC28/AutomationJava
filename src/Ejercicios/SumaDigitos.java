package Ejercicios;

public class SumaDigitos {

    // Método que suma los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;

        // Sumar los dígitos del número
        while (numero != 0) {
            suma += numero % 10; // Obtener el último dígito y agregarlo a la suma
            numero /= 10; // Eliminar el último dígito
        }

        return suma; // Retornar la suma total
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a procesar
        int numero = 5678;

        // Llamada al método para sumar los dígitos
        int resultado = sumarDigitos(numero);

        // Imprimir el resultado en la consola
        System.out.println("La suma de los dígitos del número " + numero + " es: " + resultado);
    }
}