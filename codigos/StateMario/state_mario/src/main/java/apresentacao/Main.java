package apresentacao;

import negocio.Mario;

public class Main {
    public static void main(String[] args) {
        Mario marioBros = new Mario();
        System.out.println(marioBros.getEstadoAtual());
        marioBros.pegarCogumelo();
        System.out.println(marioBros.getEstadoAtual());
        marioBros.levarDano();
        marioBros.levarDano();
        System.out.println(marioBros.getEstadoAtual());
        marioBros.pegarCogumelo();
        System.out.println(marioBros.getEstadoAtual());

        marioBros = new Mario();
        System.out.println(marioBros.getEstadoAtual());
    }
}