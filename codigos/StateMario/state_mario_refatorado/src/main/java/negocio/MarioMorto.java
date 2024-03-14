package negocio;

public class MarioMorto extends MarioState {


    public MarioMorto(Mario mario) {
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

}
