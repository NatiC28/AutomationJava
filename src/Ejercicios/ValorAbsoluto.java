package Ejercicios;

public class ValorAbsoluto {

    // Método que calcula el valor absoluto de un número
    public static int calcularValorAbsoluto(int numero) {
        return (numero < 0) ? -numero : numero; // Retorna el número positivo
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = -15; // Número a calcular el valor absoluto

        // Llamada al método para calcular el valor absoluto
        int valorAbsoluto = calcularValorAbsoluto(numero);

        // Imprimir el resultado en la consola
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}