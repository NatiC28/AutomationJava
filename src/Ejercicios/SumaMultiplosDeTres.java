package Ejercicios;

public class SumaMultiplosDeTres {

    // Método que suma los múltiplos de 3 en un rango
    public static int sumarMultiplosDeTres(int inicio, int fin) {
        int suma = 0;

        // Sumar los múltiplos de 3 en el rango
        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0) { // Verificar si el número es múltiplo de 3
                suma += i; // Agregar a la suma
            }
        }

        return suma; // Retornar la suma total
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int inicio = 1; // Inicio del rango
        int fin = 50; // Fin del rango

        // Llamada al método para sumar los múltiplos de 3
        int resultado = sumarMultiplosDeTres(inicio, fin);

        // Imprimir el resultado en la consola
        System.out.println("La suma de los múltiplos de 3 del " + inicio + " al " + fin + " es: " + resultado);
    }
}

