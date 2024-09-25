package Ejercicios;

public class ContarDigitos {

    // Método que cuenta los dígitos de un número
    public static int contarDigitos(int numero) {
        // Asegurarse de que el número sea positivo
        numero = Math.abs(numero);

        // Contar los dígitos
        if (numero == 0) {
            return 1; // El número 0 tiene 1 dígito
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10; // Dividir el número por 10 para eliminar el último dígito
            contador++; // Aumentar el contador
        }

        return contador; // Retornar el conteo de dígitos
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = 987654; // Número a verificar

        // Llamada al método para contar los dígitos
        int cantidadDigitos = contarDigitos(numero);

        // Imprimir el resultado en la consola
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }
}
