package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main() {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Selecao Brasileira");

        jogador1.imprime();

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
