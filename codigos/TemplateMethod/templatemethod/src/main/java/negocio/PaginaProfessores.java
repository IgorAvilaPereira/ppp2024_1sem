package negocio;

public class PaginaProfessores extends Pagina {

    public PaginaProfessores(String title) {
        super(title);
    }

    protected String renderizarCabecalho() {
        return "<header> <h1> Pagina dos Professores eh com Cabecalho diferente! </h1> </header>";
        // return "";
    }

    @Override
    protected String renderizarConteudo() {
        return "Cibele<br> Igor <br> Marcio <br> Briao <br><br> ";
    }

}
