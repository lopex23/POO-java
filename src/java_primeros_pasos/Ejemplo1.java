package java_primeros_pasos;

public class Ejemplo1 {

    // input: [1, 89,25,12,45,8,9,1,2,3,5]
    // output: 89

    public int[] numero;

    public static int numeroMayor(int[] numero) {

        int mayor = 0;


        for (int i = 0; i < numero.length; i++) {


            if (numero[i] > mayor) {
                mayor = numero[i];
            }
        }
        return mayor;
    }

    public static void main(String[] args) {

    int[] numero = {1,89,25,12,45,8,9,1,2,3,5};
    int resultado = numeroMayor(numero);
    System.out.println(resultado);

    }
}
