package negocio;

public class MarioGrande extends MarioState {


    public MarioGrande(Mario mario) {
        super(mario);
    }

    @Override
    public void pegarCogumelo() {
        this.mario.setEstadoAtual(this);
    }

    @Override
    public void pegarPena() {
        this.mario.setEstadoAtual(new MarioPena(this.mario));
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
