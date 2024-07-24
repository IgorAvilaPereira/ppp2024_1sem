package apresentacao;

import negocio.Documento;

public class Main {
    public static void main(String[] args) {
        Documento txtBase = new Documento();
        txtBase.setCaminho("/home/iapereira/");
        txtBase.setTipo(".txt");

        Documento meuDocumentoTXT = txtBase.clone();
        meuDocumentoTXT.setNome("meu_arquivo.txt");

        System.out.println(txtBase);
        System.out.println(meuDocumentoTXT);

        System.out.println(meuDocumentoTXT.hashCode());
        System.out.println(txtBase.hashCode());
    }
}