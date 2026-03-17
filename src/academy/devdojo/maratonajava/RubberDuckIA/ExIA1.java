package academy.devdojo.maratonajava.RubberDuckIA;

public class ExIA1 {
    static void main(String[] args) {

        String nome = "Pedro Reinbold";
        String treino = "Tiro";
        double distancia = 21.2;
        double duracao = 1.5;
        boolean treinoIndoor = true;
        double velocidadeMedia = distancia / duracao;
        double distanciaSemanal = 150.3;
        distanciaSemanal += distancia;
        boolean isTreinoPesado = distancia > 50 && velocidadeMedia >= 30;
        boolean isTreinoRecuperacao = distancia < 20 || velocidadeMedia < 20;
        String ambiente = treinoIndoor ? "Rolo de Treinamento" : "Ar livre";
        int tipoTerreno = 2;
        String descricaoTerreno = "";

        String relatorio = "O atleta " + nome + " realizou o treino " + treino + ". Foram " + distancia + " km em " + duracao + "horas. Velocidade media: " + velocidadeMedia + "km/h. Treino : " + ambiente;
        System.out.println(relatorio);

        if (isTreinoPesado) {
            System.out.println("Alerta: Treino Intenso! Lembre-se de caprichar na hidratação e carboidratos.");
        } else if (isTreinoRecuperacao) {
            System.out.println("Ótimo giro! Recuperação ativa concluída com sucesso.");
        } else {
            System.out.println("Treino base finalizado. Constância é a chave!");
        }
        switch (tipoTerreno) {
            case 1:
                descricaoTerreno = "Plano (Foco em cadencia)";
                break;
            case 2:
                descricaoTerreno = "Montanha (Foco em Força)";
                break;
            case 3:
                descricaoTerreno = "Misto (Foco em Transição)";
                break;
            default:
                descricaoTerreno = "Terreno não identificado";
                break;

        }
        String relatorio2 = "A quilometragem percorrida essa semana foi de " + distanciaSemanal + " Treino pesado = " + isTreinoPesado + " Treino recuperaçao = " + isTreinoRecuperacao + " Tipo de terreno: " + descricaoTerreno;
        System.out.println(relatorio2);

        double [] temposDosTiros = new double[5];

        temposDosTiros[0] = 5.0;
        temposDosTiros[1] = 4.5;
        temposDosTiros[2] = 4;
        temposDosTiros[3] = 5.2;
        temposDosTiros[4] = 3.2;

        double tempoTotal = 0;

        for (int tiros = 0 ; tiros < temposDosTiros.length ; tiros++) {
            System.out.println("O tiro "+(tiros+1)+" durou "+temposDosTiros[tiros]+" minutos.");
            tempoTotal += temposDosTiros[tiros];

        }
        System.out.println("Tempo total: "+tempoTotal+" minutos.");
    }
}
