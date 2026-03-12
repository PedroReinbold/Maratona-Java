package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais {
    static void main(String[] args) {
        int idade = 45;
        String categoria;

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";

        }
        System.out.println(categoria);
    }
}
