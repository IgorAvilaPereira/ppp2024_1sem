package apresentacao;

import negocio.Documento;
import negocio.FilaImpressao;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola1.pdf")));
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola2.pdf")));
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola3.pdf")));
        FilaImpressao.INSTANCE.getInstance().imprimir();
        FilaImpressao.INSTANCE.getInstance().imprimir();
        // FilaImpressao.INSTANCE.getInstance().imprimir();


        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola4.pdf")));
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola5.pdf")));
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola6.pdf")));
        System.out.println(FilaImpressao.INSTANCE.getInstance().enviarParaImpressao(new Documento("cola7.pdf")));

        System.out.println(FilaImpressao.INSTANCE.getInstance().hashCode());
        System.out.println(FilaImpressao.INSTANCE.getInstance().hashCode());

        // Runtime.getRuntime();
        Desktop.getDesktop();
        

    }
}