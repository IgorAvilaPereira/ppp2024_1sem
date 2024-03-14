package negocio;

public class MarioPequeno extends MarioState {

    public MarioPequeno(Mario mario) {
        super(mario);
    }

    @Override
    public void pegarCogumelo() {
        this.mario.setEstadoAtual(new MarioGrande(this.mario));
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
        this.mario.setEstadoAtual(new MarioMorto(this.mario));
    }

}
