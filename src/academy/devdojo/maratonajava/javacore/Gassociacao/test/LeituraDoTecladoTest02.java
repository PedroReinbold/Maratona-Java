package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class LeituraDoTecladoTest02 {
    public static void main() throws InterruptedException {

        String resposta;
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Quem é o homem mais lindo do mundo?");

        do {
            resposta = pergunta.nextLine().toUpperCase();
            if (!resposta.equals("PEDRO")) {
                System.out.println("Resposta errada! Tente novamente...");
            }
        } while (!resposta.equals("PEDRO"));


        System.out.println("\nParabéns, você acertou!");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("\nFinalizando o programa...");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
