package academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio;

public class Servico {
    private String nomeDoServico;

    public String getNomeDoServico() {
        return nomeDoServico;
    }

    public double getValor() {
        return valor;
    }

    private double valor;

    public Servico(String nomeDoServico, double valor) {
        this.nomeDoServico = nomeDoServico;
        this.valor = valor;
    }
}
