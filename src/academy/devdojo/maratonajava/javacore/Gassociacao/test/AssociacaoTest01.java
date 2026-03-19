package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main() {

        Local local = new Local("Shopping Patio Batel");
        Aluno aluno = new Aluno("Pedro", 27);
        Professor professor = new Professor("Jojo", "IA");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("IA no aprendizado", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
