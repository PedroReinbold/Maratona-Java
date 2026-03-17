package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main() {
        Professor professor1 = new Professor ("DevDojo");
        Professor professor2 = new Professor ("Pedro");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Maratona Java", professores);

        escola.imprime();
    }
}
