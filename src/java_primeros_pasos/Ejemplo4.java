package java_primeros_pasos;

public class Ejemplo4 {

    // input: [1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5]
    // output: 1

    public static int numeroMenor(int[] numero) {
        int menor = numero[0];

        for (int i = 1; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        int[] numero = {1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5};
        int resultado = numeroMenor(numero);
        System.out.println("Output: " + resultado); // Imprime 1
    }
}