package academy.devdojo.maratonajava.introducao;

public class ExIA02 {
    static void main(String[] args) {
        double[] distanciasDaSemana = {15.5, 22.0, 0.0, 45.2, 30.0, 110.5};
        double maiorDistancia = distanciasDaSemana[0];

        for (int dia = 0; dia < distanciasDaSemana.length; dia++) {
            if (distanciasDaSemana[dia] > maiorDistancia) {
                maiorDistancia = distanciasDaSemana[dia];
            }

        }
        System.out.println("A maior distancia da semana foi: " + maiorDistancia + "KM.");
    }
}
