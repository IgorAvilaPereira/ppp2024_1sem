package prototype_botao;

public class Botao {
    private String texto;
    private String x;
    private String y;
    private String url;
    private String cor;

    private Botao(){       
    }

    public static Botao cloneDoIgor(){
        Botao novoBotao = new Botao();
        novoBotao.texto = "-";
        novoBotao.x = "10px";
        novoBotao.y = "10px";
        novoBotao.url = "http://localhost:4567/";
        novoBotao.cor = "blue";
        return novoBotao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "<button style='background-color:"+this.cor+"; width:"+this.x+"; height:"+this.y+"'>"+this.texto+"</button>";
    }

    

    

    
    
}
