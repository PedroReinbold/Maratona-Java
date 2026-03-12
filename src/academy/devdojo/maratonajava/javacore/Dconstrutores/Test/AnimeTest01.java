package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
       Anime anime = new Anime("Akudama Drive", "TV", 12, "Acao", "sas");
//        anime.init("Akudama Drive", "TV", 12);
//        anime.init("Akudama Drive", "TV", 12, "Acao");
       anime.imprime();
    }
}
