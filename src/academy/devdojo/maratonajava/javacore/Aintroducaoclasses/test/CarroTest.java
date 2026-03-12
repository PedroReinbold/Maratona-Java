package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Chevette";
        carro.modelo = "SL";
        carro.ano = 1992;

        carro2.nome = "911";
        carro2.modelo = "Carrera S";
        carro2.ano = 2024;

        System.out.println("Carro 1 \n ----------------------");
        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano + "\n");
        System.out.println("Carro 2 \n ----------------------");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
