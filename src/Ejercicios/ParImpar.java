package Ejercicios;

public class ParImpar {
    // Metodo que determina si un numero es par o impar
    public static void determinarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a verificar
        int numero = 15;

        // Llamada al metodo para determinar si es par o impar
        determinarParImpar(numero);
    }
}
