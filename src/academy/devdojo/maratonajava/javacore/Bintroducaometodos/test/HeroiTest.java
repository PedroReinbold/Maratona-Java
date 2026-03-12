package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Heroi;

public class HeroiTest {
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi();
        Heroi heroi2 = new Heroi();

        heroi1.setNome("Axe");
        heroi1.setRaca("Orc");
        heroi1.setNivelEstrelas(1);

        heroi2.setNome("Puc");
        heroi2.setRaca("Elf");
        heroi2.setNivelEstrelas(2);

        heroi1.imprimirStatus();
        heroi2.imprimirStatus();

        heroi1.atacar(heroi2);


    }
}
