package negocio;

public class Compra {
    private Etapa etapaAtual;

    public Compra(){
        this.etapaAtual = new PedidoRecebido();
    }

    public void novaEtapa() {
        this.etapaAtual = this.etapaAtual.novaEtapa();
    }

    public Etapa getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(Etapa etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public void deuRuim() {
        this.etapaAtual = new PedidoCancelado();
    }

    

}
