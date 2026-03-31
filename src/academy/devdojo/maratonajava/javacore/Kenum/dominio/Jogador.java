package academy.devdojo.maratonajava.javacore.Kenum.dominio;

import academy.devdojo.maratonajava.javacore.Kenum.test.PedraPapelTesouraTest01;

public class Jogador {
    protected String nome;
    protected Escolha escolha;

    public Escolha getEscolha() {
        return escolha;
    }

    public void setEscolha(Escolha escolha) {
        this.escolha = escolha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Escolha escolha) {
        this.nome = nome;
        this.escolha = escolha;
    }

    public void jogarContra(Jogador adversario) {
        System.out.println(this.nome + " escolheu " + this.escolha);
        System.out.println(adversario.getNome() + " escolheu " + adversario.getEscolha());

        // Regra 1: Empate
        if (this.escolha == adversario.getEscolha()) {
            System.out.println("O jogo empatou!");
        }
        // Regra 2: Quando EU (this) ganho?
        else if (this.escolha == Escolha.PEDRA && adversario.getEscolha() == Escolha.TESOURA) {
            System.out.println("Vitória de " + this.nome + "!");
        }
        else if ( this.escolha == Escolha.PAPEL && adversario.getEscolha() == Escolha.PEDRA ) {
            System.out.println("Vitória de " + this.nome + "!");
        }
        else if (this.escolha == Escolha.TESOURA && adversario.getEscolha() == Escolha.PAPEL) {
            System.out.println("Vitória de " + this.nome + "!");
        }
        // Regra 3: Se não empatou, e eu não ganhei, só sobrou uma opção lógica...
        else {
            System.out.println("Vitória de " + adversario.getNome() + "!");
        }
    }

}

