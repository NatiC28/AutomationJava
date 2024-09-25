package Ejercicios;

public class ConversionBinaria {

    // Método que convierte un número decimal a binario
    public static String decimalABinario(int numero) {
        StringBuilder binario = new StringBuilder(); // Usamos StringBuilder para construir el binario

        // Convertir el número a binario
        while (numero > 0) {
            int residuo = numero % 2; // Obtener el residuo
            binario.insert(0, residuo); // Insertar el residuo al principio
            numero /= 2; // Dividir el número por 2
        }

        return binario.toString(); // Retornar el resultado en forma de cadena
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a convertir
        int numero = 45;

        // Llamada al método para convertir a binario
        String binario = decimalABinario(numero);

        // Imprimir el resultado en la consola
        System.out.println("El número " + numero + " en binario es: " + binario);
    }
}
