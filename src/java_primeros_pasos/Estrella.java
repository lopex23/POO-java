package POO;

public class Estrella {

    public String nombre;
    public String constelacion;
    public String tipoEspectral;
    public String color;
    public double masa;
    public double radio;
    public double temperatura;
    public double distancia;
    public double edad;
    public boolean esSupernova;

    public Estrella(String nombre, String constelacion, String tipoEspectral, String color, double masa, double radio, double temperatura, double distancia, double edad, boolean esSupernova) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.tipoEspectral = tipoEspectral;
        this.color = color;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.distancia = distancia;
        this.edad = edad;
        this.esSupernova = esSupernova;
    }
}
