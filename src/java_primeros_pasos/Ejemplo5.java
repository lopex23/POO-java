package java_primeros_pasos;

public class Ejemplo5 {

    // input: "Pepito juega futbol"
    // output: 17

    public static int contarCaracteres(String texto) {
        return texto.replace(" ", "").length();
    }

    public static void main(String[] args) {
        String texto = "Pepito juega futbol";
        int resultado = contarCaracteres(texto);
        System.out.println("Output: " + resultado);
    }
}