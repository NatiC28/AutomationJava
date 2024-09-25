package Ejercicios;

public class InvertirDigitos {

    // Método que invierte los dígitos de un número
    public static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero != 0) {
            // Obtener el último dígito
            int digito = numero % 10;
            // Agregarlo al número invertido
            invertido = invertido * 10 + digito;
            // Eliminar el último dígito del número original
            numero /= 10;
        }

        return invertido; // Retornar el número invertido
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a invertir
        int numero = 54321;

        // Llamada al método para invertir los dígitos
        int resultado = invertirNumero(numero);

        // Imprimir el resultado en la consola
        System.out.println("El número invertido de " + numero + " es: " + resultado);
    }
}