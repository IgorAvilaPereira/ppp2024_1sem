package apresentacao;


import negocio.*;

public class Main2 {
    public static void main(String[] args) {
        RegistryDocumento registry = RegistryDocumento.getInstance();
        System.out.println("hashcode:"+registry);

        Documento meuDocumentoTXT = registry.criaDocumento("txt");
        meuDocumentoTXT.setCaminho("/novo_caminho/");

        // System.out.println(meuDocumentoTXT);


        Documento pdfBase = new Documento();
        pdfBase.setCaminho("/home/iapereira/meus_pdfs/");
        pdfBase.setNome("sem_nome.pdf");
        pdfBase.setTipo("pdf");
        registry.adicionaModeloDocumento(pdfBase);


        Documento slidesPrototypePdf = registry.criaDocumento("pdf");
        slidesPrototypePdf.setNome("slides.pdf");

        System.out.println(slidesPrototypePdf.hashCode());
        System.out.println(pdfBase.hashCode());

        System.out.println(pdfBase);
        System.out.println(slidesPrototypePdf);

        RegistryDocumento x = RegistryDocumento.getInstance();
        System.out.println("hashcode:"+x);

        Documento meuODT = RegistryDocumento.getInstance().criaDocumento("odt");
        System.out.println(meuODT);


    }
    
}
