package negocio;

public class PedidoRecebido implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return new PagamentoAprovado();
    }

}
