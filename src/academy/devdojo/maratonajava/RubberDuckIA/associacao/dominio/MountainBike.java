package academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio;

public class MountainBike extends Bicicleta {
    private String tipoSuspensao;

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public MountainBike(String marca, String modelo, String tipoSuspensao) {
        super(marca, modelo);
        this.tipoSuspensao = tipoSuspensao.toLowerCase();
    }

    public void calibrarSuspensao(int psi) {
        System.out.println("Suspensao a " + getTipoSuspensao() + " calibrada para " + psi + " PSI.");
    }

}


