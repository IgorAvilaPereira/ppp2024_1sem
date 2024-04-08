package negocio;

public class IndoParaRegiao implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return new PedidoEntregue();
    }

}
