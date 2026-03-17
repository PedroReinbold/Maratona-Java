package academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio;

public class Corrente {
    private String modelo;
    private double kmRodados;

    public void adicionarQuilometragem(double distancia) {
        kmRodados += distancia;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public Corrente(String modelo) {
        this.modelo = modelo;
        this.kmRodados = 0.0;
    }
}
