package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    static {
        System.out.println("Dentro do bloco inicializacao estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");

    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+"recebi o salario de "+this.salario);
    }

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
