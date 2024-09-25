package Ejercicios;

public class Producto {
    // Metodo que recibe dos números y devuelve el producto
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Declaración de dos números a multiplicar
        int numero1 = 5;
        int numero2 = 8;

        // Llamada al metodo multiplicar y almacenamiento del resultado
        int resultado = multiplicar(numero1, numero2);

        // Imprimir el resultado en la consola
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}
