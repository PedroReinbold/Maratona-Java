package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = "Pedro";
    public int idade = 27;
    public double[] salarios = {3500, 2500, 10000};


    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }

    }

    public void mediaSalario() {
        double somasalario = 0;
        for (int i = 0; i < salarios.length; i++) {
            somasalario += salarios[i];
        }
        double mediaSalario = (somasalario / salarios.length);
        System.out.println("\nMedia Salarial: " + mediaSalario);
    }
}


