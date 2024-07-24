package negocio;

public class Documento implements Cloneable {
    private String nome;
    private String tipo;
    private String caminho;

    // cuidado com relacionamentos com outros objetos ou auto-relacionamentos => o clone da interface cloneable 
    // não realizar a clonagem corretamente => ou provocar loops.
    private Documento indicacao;

    public Documento() {
    }

    // 1)
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 2) alternativa sem usar a interface cloneable e o método clone
    public Documento(Documento d) {
        this.caminho = d.caminho;
        this.indicacao = d.indicacao;
        this.nome = d.nome;
        this.tipo = d.tipo;
    }

    // 3)
    private Documento(String caminho, Documento indicacao, String nome, String tipo) {
        this.caminho = caminho;
        this.indicacao = indicacao;
        this.nome = nome;
        this.tipo = tipo;
    }

    public static Documento cloneByIgor(Documento d) {
        return new Documento(d.caminho, d.indicacao, d.nome, d.tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Documento getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(Documento indicacao) {
        this.indicacao = indicacao;
    }

    @Override
    public String toString() {
        return "Documento [nome=" + nome + ", tipo=" + tipo + ", caminho=" + caminho + ", indicacao=" + indicacao + "]";
    }

}