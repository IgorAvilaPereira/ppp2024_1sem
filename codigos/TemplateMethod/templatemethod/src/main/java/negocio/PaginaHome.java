package negocio;

public class PaginaHome extends Pagina {

    public PaginaHome(String title) {
        super(title);
    }

    @Override
    protected String renderizarConteudo() {
        return "<main> Bem-vindo(a) ao website do Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas (TADS) do Instituto Federal de Educação, Ciência e Tecnologia do Rio Grande do Sul (IFRS) Campus Rio Grande. </main>";
    }
    
}
