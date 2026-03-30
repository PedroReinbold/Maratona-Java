package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main() {
        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-678");
        endereco2.setRua("Rua 6");
        endereco2.setCep("012345-000");
        Pessoa pessoa = new Pessoa("Pedro");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Lua");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(20000);
        System.out.println("----------");
        funcionario.imprime();
    }
}
