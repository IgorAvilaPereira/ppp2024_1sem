package apresentacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * {@code PessoaBuilder} collects parameters and invokes the static factory method:
 * {@code new apresentacao.Pessoa(..)}.
 * Call the {@link #build()} method to get a result of type {@code apresentacao.Pessoa}.
 * <p><em>{@code PessoaBuilder} is not thread-safe and generally should not be stored in a field or collection,
 * but instead used immediately to create instances.</em>
 */
@Generated(from = "apresentacao.Pessoa", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class PessoaBuilder {
  private static final long INIT_BIT_NOME = 0x1L;
  private static final long INIT_BIT_SOBRENOME = 0x2L;
  private static final long INIT_BIT_DATA_NASCIMENTO = 0x4L;
  private static final long INIT_BIT_ENDERECO = 0x8L;
  private static final long INIT_BIT_TELEFONE = 0x10L;
  private static final long INIT_BIT_IS_VEGANO = 0x20L;
  private static final long INIT_BIT_SEXO = 0x40L;
  private static final long INIT_BIT_FATOR_R_H = 0x80L;
  private static final long INIT_BIT_TIPO_SANGUE = 0x100L;
  private long initBits = 0x1ffL;

  private String nome;
  private String sobrenome;
  private LocalDate dataNascimento;
  private String endereco;
  private String telefone;
  private boolean isVegano;
  private char sexo;
  private char fatorRH;
  private String tipoSangue;

  /**
   * Creates a {@code PessoaBuilder} factory builder.
   * <pre>
   * new PessoaBuilder()
   *    .nome(String) // required {@code nome}
   *    .sobrenome(String) // required {@code sobrenome}
   *    .dataNascimento(java.time.LocalDate) // required {@code dataNascimento}
   *    .endereco(String) // required {@code endereco}
   *    .telefone(String) // required {@code telefone}
   *    .isVegano(boolean) // required {@code isVegano}
   *    .sexo(char) // required {@code sexo}
   *    .fatorRH(char) // required {@code fatorRH}
   *    .tipoSangue(String) // required {@code tipoSangue}
   *    .build();
   * </pre>
   */
  public PessoaBuilder() {
  }

  /**
   * Initializes the value for the {@code nome} attribute.
   * @param nome The value for nome 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder nome(String nome) {
    this.nome = Objects.requireNonNull(nome, "nome");
    initBits &= ~INIT_BIT_NOME;
    return this;
  }

  /**
   * Initializes the value for the {@code sobrenome} attribute.
   * @param sobrenome The value for sobrenome 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder sobrenome(String sobrenome) {
    this.sobrenome = Objects.requireNonNull(sobrenome, "sobrenome");
    initBits &= ~INIT_BIT_SOBRENOME;
    return this;
  }

  /**
   * Initializes the value for the {@code dataNascimento} attribute.
   * @param dataNascimento The value for dataNascimento 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = Objects.requireNonNull(dataNascimento, "dataNascimento");
    initBits &= ~INIT_BIT_DATA_NASCIMENTO;
    return this;
  }

  /**
   * Initializes the value for the {@code endereco} attribute.
   * @param endereco The value for endereco 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder endereco(String endereco) {
    this.endereco = Objects.requireNonNull(endereco, "endereco");
    initBits &= ~INIT_BIT_ENDERECO;
    return this;
  }

  /**
   * Initializes the value for the {@code telefone} attribute.
   * @param telefone The value for telefone 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder telefone(String telefone) {
    this.telefone = Objects.requireNonNull(telefone, "telefone");
    initBits &= ~INIT_BIT_TELEFONE;
    return this;
  }

  /**
   * Initializes the value for the {@code isVegano} attribute.
   * @param isVegano The value for isVegano 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder isVegano(boolean isVegano) {
    this.isVegano = isVegano;
    initBits &= ~INIT_BIT_IS_VEGANO;
    return this;
  }

  /**
   * Initializes the value for the {@code sexo} attribute.
   * @param sexo The value for sexo 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder sexo(char sexo) {
    this.sexo = sexo;
    initBits &= ~INIT_BIT_SEXO;
    return this;
  }

  /**
   * Initializes the value for the {@code fatorRH} attribute.
   * @param fatorRH The value for fatorRH 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder fatorRH(char fatorRH) {
    this.fatorRH = fatorRH;
    initBits &= ~INIT_BIT_FATOR_R_H;
    return this;
  }

  /**
   * Initializes the value for the {@code tipoSangue} attribute.
   * @param tipoSangue The value for tipoSangue 
   * @return {@code this} builder for use in a chained invocation
   */
  public final PessoaBuilder tipoSangue(String tipoSangue) {
    this.tipoSangue = Objects.requireNonNull(tipoSangue, "tipoSangue");
    initBits &= ~INIT_BIT_TIPO_SANGUE;
    return this;
  }

  /**
   * Invokes {@code new apresentacao.Pessoa(..)} using the collected parameters and returns the result of the invocation
   * @return A result of type {@code apresentacao.Pessoa}
   * @throws java.lang.IllegalStateException if any required attributes are missing
   */
  public Pessoa build() {
    checkRequiredAttributes();
    return new Pessoa(nome, sobrenome, dataNascimento, endereco, telefone, isVegano, sexo, fatorRH, tipoSangue);
  }

  private boolean nomeIsSet() {
    return (initBits & INIT_BIT_NOME) == 0;
  }

  private boolean sobrenomeIsSet() {
    return (initBits & INIT_BIT_SOBRENOME) == 0;
  }

  private boolean dataNascimentoIsSet() {
    return (initBits & INIT_BIT_DATA_NASCIMENTO) == 0;
  }

  private boolean enderecoIsSet() {
    return (initBits & INIT_BIT_ENDERECO) == 0;
  }

  private boolean telefoneIsSet() {
    return (initBits & INIT_BIT_TELEFONE) == 0;
  }

  private boolean isVeganoIsSet() {
    return (initBits & INIT_BIT_IS_VEGANO) == 0;
  }

  private boolean sexoIsSet() {
    return (initBits & INIT_BIT_SEXO) == 0;
  }

  private boolean fatorRHIsSet() {
    return (initBits & INIT_BIT_FATOR_R_H) == 0;
  }

  private boolean tipoSangueIsSet() {
    return (initBits & INIT_BIT_TIPO_SANGUE) == 0;
  }

  private void checkRequiredAttributes() {
    if (initBits != 0) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<>();
    if (!nomeIsSet()) attributes.add("nome");
    if (!sobrenomeIsSet()) attributes.add("sobrenome");
    if (!dataNascimentoIsSet()) attributes.add("dataNascimento");
    if (!enderecoIsSet()) attributes.add("endereco");
    if (!telefoneIsSet()) attributes.add("telefone");
    if (!isVeganoIsSet()) attributes.add("isVegano");
    if (!sexoIsSet()) attributes.add("sexo");
    if (!fatorRHIsSet()) attributes.add("fatorRH");
    if (!tipoSangueIsSet()) attributes.add("tipoSangue");
    return "Cannot build Pessoa, some of required attributes are not set " + attributes;
  }
}
