package Ejercicios;

public class IntercambiarValores {

    // Método que intercambia los valores de a y b sin usar variable auxiliar
    public static void intercambiar(int a, int b) {
        // Intercambio sin variable auxiliar
        a = a + b; // Sumar los valores
        b = a - b; // Restar el nuevo valor de b
        a = a - b; // Restar el nuevo valor de a

        // Imprimir los resultados
        System.out.println("Valor de a después del intercambio: " + a);
        System.out.println("Valor de b después del intercambio: " + b);
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int a = 5; // Valor inicial de a
        int b = 10; // Valor inicial de b

        // Imprimir los valores antes del intercambio
        System.out.println("Valores iniciales:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Llamada al metodo para intercambiar los valores
           intercambiar(a, b);
    }
}
