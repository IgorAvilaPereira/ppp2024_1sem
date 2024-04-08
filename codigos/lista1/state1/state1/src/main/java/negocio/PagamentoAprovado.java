package negocio;

public class PagamentoAprovado implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return new NotaFiscalDisponivel();

    }

}
