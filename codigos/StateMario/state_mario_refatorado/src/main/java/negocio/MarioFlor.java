package negocio;

public class MarioFlor extends MarioState  {


    public MarioFlor(Mario mario){
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
        this.mario.setEstadoAtual(this);
    }

    @Override
    public void levarDano() {
        this.mario.setEstadoAtual(new MarioPequeno(mario));
    }

   

}
