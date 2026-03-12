package academy.devdojo.maratonajava.introducao;

public class Ex02Taxas {
    static void main(String[] args) {
        double salario = 32712;
        double tax;

        if (salario >= 0 && salario < 34712) {
            tax = 9.7 / 100;
        } else if (salario >= 34713 && salario < 68507) {
            tax = 37.35 / 100;
        } else {
            tax = 49.50 / 100;
        }
        System.out.println("Voce deve pagar: " + tax * salario + " de imposto.");
    }
}
