package Ejercicios;

public class RaizCuadrada {

    // Metodo para calcular la raíz cuadrada de un número
    public static int calcularRaizCuadrada(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        if (numero == 0 || numero == 1) {
            return numero; // La raíz cuadrada de 0 y 1 es el mismo número
        }

        int inicio = 1;
        int fin = numero;
        int resultado = 0;

        // Metodo de bisección para encontrar la raíz cuadrada
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int cuadrado = medio * medio;

            // Verificar si encontramos la raíz cuadrada
            if (cuadrado == numero) {
                return medio; // Encontramos la raíz cuadrada exacta
            } else if (cuadrado < numero) {
                resultado = medio; // Almacenar el último valor que fue menor
                inicio = medio + 1; // Buscar en la parte superior
            } else {
                fin = medio - 1; // Buscar en la parte inferior
            }
        }

        return resultado; // Retornar la última aproximación entera
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = 49; // Número a calcular la raíz cuadrada

        // Llamada al método para calcular
        int raizCuadrada = calcularRaizCuadrada(numero);
        System.out.println("la raiz cuadrada de "+ numero + " es: " + raizCuadrada);
    }
}