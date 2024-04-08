package negocio;

public class PedidoEntregue implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return this;
    }

}
