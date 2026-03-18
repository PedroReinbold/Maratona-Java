package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo.");
        char sexo = entrada.next().toUpperCase().charAt(0);

        System.out.println("Nome: "+ nome+ " Idade: "+ idade+ " Sexo: "+ sexo);
    }
}
