package academy.devdojo.maratonajava.RubberDuckIA.associacao.test;

import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Bicicleta;
import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Corrente;
import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Servico;

import java.util.Arrays;

public class BikeCareTest {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Oggi", "Velloce Disk 2021");
        Corrente correnteShimano = new Corrente("Shimano 105");
        Servico servico1 = new Servico("Lavagem", 50);
        Servico servico2 = new Servico("Troca de pastilha", 120);
        bicicleta.setCorrenteEquipada(correnteShimano);
        bicicleta.pedalar(50.5);
        bicicleta.pedalar(20);
        bicicleta.adicionarServico(servico1);
        bicicleta.adicionarServico(servico2);
        bicicleta.imprime();
    }
}
