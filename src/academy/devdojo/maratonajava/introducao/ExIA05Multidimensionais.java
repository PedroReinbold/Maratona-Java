package academy.devdojo.maratonajava.introducao;

public class ExIA05Multidimensionais {
    static void main(String[] args) {

        int[][] tabuleiro = {{2,0,3},{1,2,0}};

        for (int linha = 0; linha < tabuleiro.length; linha++){
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
                String posicao = linha == 0 ? "Linha de Frente" : "Retaguarda";
                String statusPeca = tabuleiro[linha][coluna] == 0 ? "Espaço Vazio" : (tabuleiro[linha][coluna]+" Estrelas");

                System.out.println(posicao+" - Slot "+(coluna+1)+": "+statusPeca);
            }
        }

    }
}
