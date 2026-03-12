package academy.devdojo.maratonajava.introducao;

public class Ex03Switch {
    static void main(String[] args) {
        byte dia = 1;
        String resultado = "";

        switch (dia){
            case 1,7:
                resultado = "Final de semana.";
                break;
            case 2,3,4,5,6:
                resultado = "Dia util";
                break;
            default:
                System.out.println("Opção Inválida.");
            break;

        }
        System.out.println(resultado);
    }
}
