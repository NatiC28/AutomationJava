package Ejercicios;

public class CuadradoPerfecto {

    // Método que verifica si un número es un cuadrado perfecto
    public static boolean esCuadradoPerfecto(int numero) {
        int raiz = (int) Math.sqrt(numero); // Calcular la raíz cuadrada entera del número
        return (raiz * raiz == numero); // Verificar si el cuadrado de la raíz es igual al número original
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = 64; // Número a verificar

        // Llamada al método para verificar si es cuadrado perfecto
        if (esCuadradoPerfecto(numero)) {
            System.out.println("El número " + numero + " es un cuadrado perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un cuadrado perfecto.");
        }
    }
}

