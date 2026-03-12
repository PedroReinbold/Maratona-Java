package academy.devdojo.maratonajava.introducao;

public class Ex04For {
    static void main(String[] args) {
        //Imprima todos os numeros pares de 0 a 1000000
        for(int par = 0; par<=100;par++){
            if(par % 2 == 0){
                System.out.println(par);
                if(par == 88){
                    break;
                }
            }
        }
    }
}
