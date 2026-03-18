package academy.devdojo.maratonajava.RubberDuckIA.associacao.test;

import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Bicicleta;
import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Corrente;
import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.MountainBike;
import academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio.Servico;

import java.util.Arrays;

public class BikeCareTest {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("Oggi", "Velloce Disk 2021");
        MountainBike bicicleta2 = new MountainBike("Trek","Marlin","Mola");
        Corrente correnteShimano = new Corrente("Shimano 105");
        Corrente correnteShimano2 = new Corrente("Shimano MTB");
        Servico servico1 = new Servico("Lavagem", 50);
        Servico servico2 = new Servico("Troca de pastilha", 120);
        bicicleta1.setCorrenteEquipada(correnteShimano);
        bicicleta1.pedalar(50.5);
        bicicleta1.pedalar(20);
        bicicleta1.adicionarServico(servico1);
        bicicleta1.adicionarServico(servico2);
        bicicleta1.imprime();
        bicicleta2.setCorrenteEquipada(correnteShimano2);
        bicicleta2.pedalar(30);
        bicicleta2.calibrarSuspensao(65);
        bicicleta2.imprime();
    }
}
