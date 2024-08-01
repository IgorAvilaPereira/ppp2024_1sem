package negocio;

import java.util.UUID;

// singleton (ansioso) + synchronized (ponto único de acesso - no caso de multi threads)
public class Encurtador {
    private static final Encurtador INSTANCE = new Encurtador();

    private String urlOriginal;
    private String urlEncurtada;

   private Encurtador(){}

   public String encurtaURL(String urlOriginal){
        this.urlOriginal = urlOriginal;
        this.urlEncurtada = "http://"+UUID.randomUUID().toString().substring(0, 5);
        return this.urlEncurtada;
   }

   public static synchronized Encurtador getInstance(){
    return Encurtador.INSTANCE;
   }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

   


    
}
