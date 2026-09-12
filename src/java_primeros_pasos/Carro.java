package POO;

public class Carro {

    public String marca;
    public String modelo;
    public String color;
    public String tipoCombustible;
    public int velocidadeMaxima;
    public int velocidadeMinima;
    public int rin;
    public String cor;
    public String placa;
    public String transmicion;

    public Carro(String marca, String modelo, String color, String tipoCombustible, int velocidadeMaxima, int velocidadeMinima, int rin, String cor, String placa, String transmicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;
        this.rin = rin;
        this.cor = cor;
        this.placa = placa;
        this.transmicion = transmicion;
    }
}
