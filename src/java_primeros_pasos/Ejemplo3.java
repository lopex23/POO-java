package java_primeros_pasos;

import java.util.Arrays;

public class Ejemplo3 {

    // input: [1, 89, 25, 12, 4, 8, 45, 9, 1, 2, 3, 5]
    // output: [89, 1]

    public static int[] obtenerMayorYMenor(int[] numero) {
        int mayor = numero[0];
        int menor = numero[0];

        for (int i = 1; i < numero.length; i++) {
            if (numero[i] > mayor) {
                mayor = numero[i];
            }
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }

        return new int[]{mayor, menor};
    }

    public static void main(String[] args) {
        int[] numero = {1, 89, 25, 12, 4, 8, 45, 9, 1, 2, 3, 5};
        int[] resultado = obtenerMayorYMenor(numero);

        System.out.println("Output: " + resultado[0] + " y " + resultado[1]);

        System.out.println("Arreglo: " + Arrays.toString(resultado));
    }
}