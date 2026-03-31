package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {



    private String nome;
    private TipoCliente tipoCliente;
    private tipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, tipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
