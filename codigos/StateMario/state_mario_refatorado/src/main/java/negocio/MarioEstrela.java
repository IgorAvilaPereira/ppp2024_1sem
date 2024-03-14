package negocio;

public class MarioEstrela extends MarioState {

    public MarioEstrela(Mario mario){
        super(mario);
    }

    @Override
    public void pegarCogumelo() {
        this.mario.setEstadoAtual(this);
    }

    @Override
    public void pegarPena() {
        this.mario.setEstadoAtual(this);
    }

    @Override
    public void pegarFlor() {
        this.mario.setEstadoAtual(this);
        
    }

    @Override
    public void levarDano() {
        this.mario.setEstadoAtual(this);
    }

    @Override
    public void pegarEstrela() {
        this.mario.setEstadoAtual(this);
    }

}
