package Ejercicios;

public class TablaMultiplicar {

    // Método que imprime la tabla de multiplicar de un número
    public static void generarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Generar la tabla de multiplicar del número
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcular el resultado
            System.out.println(numero + " x " + i + " = " + resultado); // Imprimir el resultado
        }
    }

    // Metodo principal (main) para ejecutar el programa
    public static void main(String[] args) {
        int numero = 7; // Número para el cual se generará la tabla

        // Llamada al metodo para generar la tabla de multiplicar
        generarTablaMultiplicar(numero);
    }
}
