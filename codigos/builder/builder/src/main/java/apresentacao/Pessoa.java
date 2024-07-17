package apresentacao;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;
    private boolean isVegano;
    private char sexo;
    private char fatorRH;
    private String tipoSangue;

    private Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String endereco, String telefone,
            boolean isVegano, char sexo, char fatorRH, String tipoSangue) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.isVegano = isVegano;
        this.sexo = sexo;
        this.fatorRH = fatorRH;
        this.tipoSangue = tipoSangue;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean isVegano) {
        this.isVegano = isVegano;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getFatorRH() {
        return fatorRH;
    }

    public void setFatorRH(char fatorRH) {
        this.fatorRH = fatorRH;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
                + ", endereco=" + endereco + ", telefone=" + telefone + ", isVegano=" + isVegano + ", sexo=" + sexo
                + ", fatorRH=" + fatorRH + ", tipoSangue=" + tipoSangue + "]";
    }



    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private LocalDate dataNascimento;
        private String endereco;
        private String telefone;
        private boolean isVegano;
        private char sexo;
        private char fatorRH;
        private String tipoSangue;

        public PessoaBuilder() {

        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this.nome, this.sobrenome, this.dataNascimento, this.endereco, this.telefone,
                    this.isVegano, this.sexo, this.fatorRH, this.tipoSangue);
        }
    }

    public static PessoaBuilder PessoaBuilder() {
        return new PessoaBuilder();
    }

}
