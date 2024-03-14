package negocio;

public abstract class MarioState {
    protected Mario mario;

    public MarioState(Mario mario){
        this.mario = mario;
    }

    public abstract void pegarCogumelo();
    public abstract void pegarPena();
    public abstract void pegarFlor();
    public abstract void levarDano();


    public void pegarEstrela() {
        MarioState aux = this.mario.getEstadoAtual();
        System.out.println("Peguei a estrela...");
        this.mario.setEstadoAtual(new MarioEstrela(mario));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Acabou a estrela....");
        this.mario.setEstadoAtual(aux);
    }

}
