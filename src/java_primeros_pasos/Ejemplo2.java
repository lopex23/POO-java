package java_primeros_pasos;

public class Ejemplo2 {

    // input: [1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5]
    // output: 45

    public static int segundoNumeroMayor(int[] numero) {
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > mayor) {

                segundoMayor = mayor;

                mayor = numero[i];
            } else if (numero[i] > segundoMayor && numero[i] != mayor) {

                segundoMayor = numero[i];
            }
        }

        return segundoMayor;
    }

    public static void main(String[] args) {
        int[] numero = {1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5};
        int resultado = segundoNumeroMayor(numero);
        System.out.println("Output: " + resultado);
    }
}


