package Ejercicios;

public class Suma {// Método que recibe dos números y devuelve la suma
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Declaración de dos números a sumar
        int numero1 = 10;
        int numero2 = 20;

        // Llamada al método sumar y almacenamiento del resultado
        int resultado = sumar(numero1, numero2);

        // Imprimir el resultado en la consola
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}
