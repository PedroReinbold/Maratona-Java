package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
//        calculadora.somaArray(numeros);
//        calculadora.somaVarArgs(numeros);
        calculadora.multiplicaArray(numeros);
    }
}
