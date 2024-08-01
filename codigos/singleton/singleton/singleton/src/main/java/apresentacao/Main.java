package apresentacao;

import java.io.IOException;
import java.sql.SQLException;

import negocio.Encurtador;
import persistencia.EncurtadorDAO;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, IOException {
        Encurtador e1 = Encurtador.getInstance();
        e1.encurtaURL("https://github.com/IgorAvilaPereira/ppp2024_1sem/wiki");
        new EncurtadorDAO().salvaUrl(e1);
        // Runtime.getRuntime().exec("brave-browser "+new EncurtadorDAO().obterUrlOriginal("http://eef78bd5-f2d0-4ba6-ac11-df24e8514df9"));

        // System.out.println(e1.encurtaURL("http://www.google.com"));
        // e1.encurtaURL("http://www.google.com");
        // new EncurtadorDAO().salvaUrl(e1);
    
        // Encurtador e2 = Encurtador.getInstance();
        // System.out.println(e2.encurtaURL("http://www.igoravilapereira.github.io"));
        // e2.encurtaURL("http://www.igoravilapereira.github.io");
        // new EncurtadorDAO().salvaUrl(e2);

        // System.out.println(e1.hashCode());
        // System.out.println(e2.hashCode());


    }
}