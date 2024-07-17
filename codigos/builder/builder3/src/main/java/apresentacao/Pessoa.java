package apresentacao;

import java.time.LocalDate;

import org.immutables.builder.Builder;

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

  
    @Builder.Constructor
    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String endereco, String telefone,
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

    




}
