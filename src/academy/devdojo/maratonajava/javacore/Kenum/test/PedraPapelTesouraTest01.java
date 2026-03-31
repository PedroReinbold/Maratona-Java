package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Escolha;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Jogador;

public class PedraPapelTesouraTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pedro", Escolha.TESOURA);
        Jogador jogador2 = new Jogador("Hamine", Escolha.PEDRA);

        jogador1.jogarContra(jogador2);

    }
}
