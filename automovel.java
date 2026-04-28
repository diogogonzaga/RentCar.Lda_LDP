public class automovel {
private String marca;
    private String modelo;
    private String cor;
    private int cilindrada;
    private int ano;
    private String matricula;
    private double valorDia;
    
public automovel(String marca, String modelo, String cor, int cilindrada, int ano, String matricula, double valorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.cilindrada = cilindrada;
        this.ano = ano;
        this.matricula = matricula;
        this.valorDia = valorDia;
    }

public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getCilindrada() { return cilindrada; }
    public int getAno() { return ano; }
    public String getMatricula() { return matricula; }
    public double getValorDia() { return valorDia; }
}
