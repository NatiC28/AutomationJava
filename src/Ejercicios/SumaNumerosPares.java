package Ejercicios;

public class SumaNumerosPares {

    // Método que suma los números pares en un rango
    public static int sumarPares(int a, int b) {
        int suma = 0;

        // Sumar los números pares en el rango
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) { // Verificar si el número es par
                suma += i; // Agregar a la suma
            }
        }

        return suma; // Retornar la suma total
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Definir el rango
        int a = 1;
        int b = 100;

        // Llamada al método para sumar los números pares
        int resultado = sumarPares(a, b);

        // Imprimir el resultado en la consola
        System.out.println("La suma de los números pares en el rango de " + a + " a " + b + " es: " + resultado);
    }
}
