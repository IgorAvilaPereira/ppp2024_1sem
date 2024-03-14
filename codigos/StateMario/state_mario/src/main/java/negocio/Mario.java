package negocio;

public class Mario {
    private int nroVidas;
    private int nroEstrelas;

    private static final String PEQUENO = "PEQUENO";
    private static final String GRANDE = "GRANDE";
    private static final String FLOR = "FLOR";
    private static final String PENA = "PENA";
    private static final String MORTO = "MORTO";

    private String estadoAtual;

    public Mario() {
        this.estadoAtual = PEQUENO;

    }

    public void pegarCogumelo() {
        if (this.estadoAtual.equals(PEQUENO)) {
            this.estadoAtual = GRANDE;
        }
        // if (this.estadoAtual.equals(MORTO)) {
        //     System.out.println("ja morri");
        // }
    }

    public void pegarFlor() {
        if (this.estadoAtual.equals(PEQUENO) || this.estadoAtual.equals(PENA) || this.estadoAtual.equals(GRANDE)) {
            this.estadoAtual = FLOR;
        }

        // if (this.estadoAtual.equals(MORTO)) {
        //     System.out.println("ja morri");
        // }

    }

    public void pegarPena(){
        if (this.estadoAtual.equals(PEQUENO) || this.estadoAtual.equals(PENA) || this.estadoAtual.equals(GRANDE)) {
            this.estadoAtual = PENA;
        }

        // if (this.estadoAtual.equals(MORTO)) {
        //     System.out.println("ja morri");
        // }
    }

    public void levarDano(){
        if (this.estadoAtual.equals(PEQUENO)){
            this.estadoAtual = MORTO;
        }
        if (this.estadoAtual.equals(FLOR) || this.estadoAtual.equals(PENA) || this.estadoAtual.equals(GRANDE)) {
            this.estadoAtual = PEQUENO;
        }

        // if (this.estadoAtual.equals(MORTO)) {
        //     System.out.println("ja morri");
        // }
    }

    public int getNroVidas() {
        return nroVidas;
    }

    public void setNroVidas(int nroVidas) {
        this.nroVidas = nroVidas;
    }

    public int getNroEstrelas() {
        return nroEstrelas;
    }

    public void setNroEstrelas(int nroEstrelas) {
        this.nroEstrelas = nroEstrelas;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    

}
