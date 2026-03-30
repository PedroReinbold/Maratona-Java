package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0 - Bloco de inicializacao estatico da super classe e executado quando JVM carregar a superclasse
    // 1 - Bloco de inicializacao estatico da sub classe e executado quando JVM carregar a subclasse
    // 2 - Alocado espaco em memoria para o objeto da superclasse
    // 3 - Cada atributo da superclasse e criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicializacao da superclasse e executado
    // 5 - Construtor da superclasse e executado
    // 6 - Alocado espaco em memoria para o objeto da subclasse
    // 7 - Cada atributo da subclasse e criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicializacao da subclasse e executado
    // 9 - Construtor da subclasse e executado


    static void main() {
        Funcionario funcionario = new Funcionario("Pedro");
    }
}
