package apresentacao;

import negocio.Compra;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        System.out.println(compra.getEtapaAtual().getClass().getSimpleName());
        compra.novaEtapa();
        System.out.println(compra.getEtapaAtual().getClass().getSimpleName());
        compra.novaEtapa();
        System.out.println(compra.getEtapaAtual().getClass().getSimpleName());
        compra.deuRuim();
        compra.novaEtapa();
        System.out.println(compra.getEtapaAtual().getClass().getSimpleName());
        compra.deuRuim();
        System.out.println(compra.getEtapaAtual().getClass().getSimpleName());

       


    }
}