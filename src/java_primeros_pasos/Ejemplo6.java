package java_primeros_pasos;

public class Ejemplo6 {

    // input: "Pepito juega futbol"
    // output: 3

    public static int contarPalabras(String texto) {
        return texto.split(" ").length;
    }

    public static void main(String[] args) {
        String texto = "Pepito juega futbol";
        int resultado = contarPalabras(texto);
        System.out.println("Output: " + resultado);
    }
}