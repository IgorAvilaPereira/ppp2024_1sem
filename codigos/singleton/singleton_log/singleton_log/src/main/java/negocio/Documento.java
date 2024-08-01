package negocio;

public class Documento {
    private String nome;
    private String extensao;
    private String dono;
    private double tamanhoBytes;
    private String diretorio;


    public Documento(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getExtensao() {
        return extensao;
    }
    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getTamanhoBytes() {
        return tamanhoBytes;
    }
    public void setTamanhoBytes(double tamanhoBytes) {
        this.tamanhoBytes = tamanhoBytes;
    }
    public String getDiretorio() {
        return diretorio;
    }
    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    



}
