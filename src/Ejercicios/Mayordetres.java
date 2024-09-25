package Ejercicios;

public class Mayordetres {
    // Metodo que determina el mayor de tres números
    public static int encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1; // Suponemos que num1 es el mayor

        // Comparamos con num2
        if (num2 > mayor) {
            mayor = num2;
        }

        // Comparamos con num3
        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor; // Retornamos el número mayor
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Números a verificar
        int numero1 = 5;
        int numero2 = 12;
        int numero3 = 9;

        // Llamada al metodo para encontrar el mayor
        int mayor = encontrarMayor(numero1, numero2, numero3);

        // Imprimir el resultado en la consola
        System.out.println("El número mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);
    }
}
