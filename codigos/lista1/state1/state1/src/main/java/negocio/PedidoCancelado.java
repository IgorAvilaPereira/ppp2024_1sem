package negocio;

public class PedidoCancelado implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return this;
    }

}
