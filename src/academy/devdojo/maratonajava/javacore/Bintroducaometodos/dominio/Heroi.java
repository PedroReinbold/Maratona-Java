package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Heroi {

    private String nome;
    private int nivelEstrelas;
    private String raca;

    public void imprimirStatus() {
        System.out.println("Nome Heroi = " + nome + " Raça: " + raca + " Estrelas: " + nivelEstrelas);
    }

    public void atacar(Heroi alvo) {
        System.out.println("O heroi: " + nome + " está atacando o alvo: " + alvo.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public int getNivelEstrelas() {
        return this.nivelEstrelas;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNivelEstrelas(int nivelEstrelas) {
        if (nivelEstrelas == 1 || nivelEstrelas == 2 || nivelEstrelas == 3) {
            this.nivelEstrelas = nivelEstrelas;
        }else {
            System.out.println("Erro");
        }
    }
}