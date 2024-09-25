package Ejercicios;

public class NumeroAmstrong {

    // Método que determina si un número es un número Armstrong
    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int original = numero;
        int cantidadDigitos = String.valueOf(numero).length(); // Contar la cantidad de dígitos

        // Calcular la suma de los dígitos elevados a la potencia de la cantidad de dígitos
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            suma += Math.pow(digito, cantidadDigitos); // Elevar a la potencia y sumar
            numero /= 10; // Eliminar el último dígito
        }

        // Comparar la suma con el número original
        return suma == original;
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Número a verificar
        int numero = 153;

        // Llamada al método para determinar si es un número Armstrong
        if (esNumeroArmstrong(numero)) {
            System.out.println("El número " + numero + " es un número Armstrong.");
        } else {
            System.out.println("El número " + numero + " no es un número Armstrong.");
        }
    }
}
