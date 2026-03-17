package academy.devdojo.maratonajava.RubberDuckIA.associacao.dominio;

public class Bicicleta {
    private String marca;
    private String modelo;
    private Corrente correnteEquipada;
    private Servico[] historicoServicos;

    public Servico[] getHistoricoServicos() {
        return historicoServicos;
    }

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.historicoServicos = new Servico[5];
    }

    public void adicionarServico(Servico servicoRealizado) {
        for (int i = 0; i < historicoServicos.length; i++) {
            if (historicoServicos[i] == null) {
                historicoServicos[i] = servicoRealizado;
                return;
            }
        }
    }

    public void imprime() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo());
        if (correnteEquipada != null) {
            System.out.println("Corrente Equipada: " + correnteEquipada.getModelo() + "\nQuilometragem da corrente: " + correnteEquipada.getKmRodados());
        } else {
            System.out.println("Atençao: Bicicleta sem corrente cadastrada.");
        }
        System.out.println("\nHistorico de Servicos: ");
        for (int i = 0; i < historicoServicos.length; i++) {
            if (historicoServicos[i] != null) {
                System.out.println(historicoServicos[i].getNomeDoServico()+" Valor: R$"+historicoServicos[i].getValor());
            }


        }
    }

    public void pedalar(double distancia) {
        if (this.correnteEquipada == null) {
            System.out.println("Erro: Nao é possivel pedalar sem corrente!");
            return;
        } else {
            correnteEquipada.adicionarQuilometragem(distancia);
        }

    }

    public void setCorrenteEquipada(Corrente correnteEquipada) {
        this.correnteEquipada = correnteEquipada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Corrente getCorrenteEquipada() {
        return correnteEquipada;
    }


}
