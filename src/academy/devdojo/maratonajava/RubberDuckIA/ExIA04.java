package academy.devdojo.maratonajava.RubberDuckIA;

public class ExIA04 {
    static void main(String[] args) {

        double[][] treinosDuplos = {{40.5,15.0},{80.0,0.0},{0.0,30.5}};

        for (int dia = 0; dia < treinosDuplos.length; dia++){
            for (int periodo = 0; periodo < treinosDuplos[dia].length; periodo++){
                String nomeTurno = periodo == 0 ? "Manhã" : "Tarde";
                String statusTreino = treinosDuplos[dia][periodo] == 0.0 ? "Descanso" : (treinosDuplos[dia][periodo]+" km");
                System.out.println("Dia "+(dia+1)+", "+nomeTurno+": "+statusTreino);
            }
        }

    }
}
