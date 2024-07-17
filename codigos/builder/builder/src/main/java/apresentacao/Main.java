package apresentacao;

public class Main {
    public static void main(String[] args) {

        // com o construtor privado, só há um jeito de instanciar pessoas => com o Builder.
        // Pessoa igor = new Pessoa("igor", "pereira", LocalDate.of(1987,01,20), "alfredo huch", "5399966600", false, 'M', '-', "A");

        Pessoa i = Pessoa.PessoaBuilder().nome("igor").sobrenome("pereira").build();
        System.out.println(i);
    }
}