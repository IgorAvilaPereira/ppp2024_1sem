package apresentacao;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
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




}
