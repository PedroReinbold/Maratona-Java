package academy.devdojo.maratonajava.introducao;

public class ExIA03 {
    static void main(String[] args) {

        double[][] distanciasAcampamento = new double[2][2];

        distanciasAcampamento[0][0] = 40.5;
        distanciasAcampamento[0][1] = 60.0;
        distanciasAcampamento[1][0] = 50.0;
        distanciasAcampamento[1][1] = 55.5;

        for (int atleta = 0; atleta < distanciasAcampamento.length; atleta++){
            for( int dia = 0; dia < distanciasAcampamento[atleta].length; dia++){
                String nomeDoDia = dia == 0 ? "Sabado" : "Domingo";
                System.out.println("Atleta "+(atleta+1)+", "+nomeDoDia+": "+distanciasAcampamento[atleta][dia]);

            }

        }


    }
}
