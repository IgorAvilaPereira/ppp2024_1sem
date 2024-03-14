package apresentacao;

import negocio.Mario;
import negocio.MarioPequeno;

public class Main {
    public static void main(String[] args) {
        Mario marioBros = new Mario();
        // marioBros.setEstadoAtual(new MarioPequeno(marioBros));
        System.out.println(marioBros.getEstadoAtualString());
        marioBros.pegarCogumelo();
        System.out.println(marioBros.getEstadoAtualString());
        marioBros.levarDano();
        System.out.println(marioBros.getEstadoAtualString());
        marioBros.levarDano();
        System.out.println(marioBros.getEstadoAtualString());


    }
}