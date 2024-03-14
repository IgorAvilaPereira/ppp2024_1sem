package negocio;

public class MarioPena extends MarioState {





    public MarioPena(Mario mario){
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
        this.mario.setEstadoAtual(new MarioFlor(this.mario));
    }

    @Override
    public void levarDano() {
        this.mario.setEstadoAtual(new MarioPequeno(this.mario));
    }

}
