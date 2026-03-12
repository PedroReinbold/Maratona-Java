package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else{
            System.out.println("Nao autorizado");
        }
    }
}
