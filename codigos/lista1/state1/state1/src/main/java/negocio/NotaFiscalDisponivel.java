package negocio;

public class NotaFiscalDisponivel implements Etapa {

    @Override
    public Etapa novaEtapa() {
        return new IndoParaRegiao();
    }

}
