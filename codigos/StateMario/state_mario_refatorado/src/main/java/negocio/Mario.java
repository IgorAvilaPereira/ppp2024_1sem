package negocio;

public class Mario {
    private int nroVidas;
    private int nroEstrelas;

    private MarioState estadoAtual;

    public Mario(){
        this.estadoAtual =  new MarioPequeno(this);
    }

    
    public void pegarCogumelo() {
        this.estadoAtual.pegarCogumelo();
    }

    public void pegarPena() {
        this.estadoAtual.pegarPena();

    }

  
    public void pegarFlor() {
        this.estadoAtual.pegarFlor();
    }

   
    public void levarDano() {
        this.estadoAtual.levarDano();
    }

    public void pegarEstrela(){
        this.estadoAtual.pegarEstrela();
    }

    public MarioState getEstadoAtual() {
        return estadoAtual;
    }

    public String getEstadoAtualString() {
        return estadoAtual.getClass().getSimpleName();
    }

    public void setEstadoAtual(MarioState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    
    

  

    

}
