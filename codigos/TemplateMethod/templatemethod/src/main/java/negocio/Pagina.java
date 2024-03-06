package negocio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Pagina {

    private String title;

    public Pagina(String title){
        this.title = title;
    }

    // templateMethod => final
    public final void gerarPagina() throws IOException{
        String html = "<html> <head> <title> "+this.title+" </title> </head> <body>";
        html += renderizarCabecalho(); // fixo
        html += renderizarMenu(); // fixo
        html += renderizarConteudo(); // variável
        html += renderizarRodape(); // fixo
        // return html + "</body> </html>";
          
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.title.toLowerCase()+".html"));
        writer.write(html + "</body> </html>");
        writer.close();
    }

    private String renderizarRodape() {
        return "<hr> <footer>Instituto Federal de Educação, Ciência e Tecnologia do Rio Grande do Sul  " +
        "Campus Rio Grande<br>"+
        "Rua Eng. Alfredo Huch, 475 | Bairro Centro | Rio Grande/RS<br>"+
        "CEP: 96201-460<br>"+        
        "Telefone: (53) 3233-8681 | E-mail: comunicacao@riogrande.ifrs.edu.br</footer>";
    }

    protected abstract String renderizarConteudo();

    private String renderizarMenu() {
        return "<aside style='float: left'> <ul> <li> <a href='home.html'> Home </a> </li> <li> <a href='professores.html'> Professores </a> </li> <li> <a href='egressos.html'> Egressos </a> </li> </ul> </aside>";
    }

    protected String renderizarCabecalho() {
        return "<header> <h1> IFRS, Melhor Site TADS -> Prof. Igor Pereira </h1> </header>";
    }
    
}
