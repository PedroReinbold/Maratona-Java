package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.tipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, tipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Hamine", TipoCliente.PESSOA_JURIDICA, tipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(tipoPagamento.DEBITO.calcularDesconto(100));
    }
}
