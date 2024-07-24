package negocio;

import java.util.HashMap;
import java.util.Map;

// Neste exemplo o Registry foi implementado como SINGLETON, ou seja, uma única instância desta classe
public class RegistryDocumento {
    private static RegistryDocumento INSTANCE = new RegistryDocumento();
    private Map<String, Documento> vetTipoDocumento;

    private RegistryDocumento() {
        this.vetTipoDocumento = new HashMap<>();

        Documento txtBase = new Documento();
        txtBase.setCaminho("/home/iapereira/");
        txtBase.setTipo(".txt");
        this.vetTipoDocumento.put("txt", txtBase);

        Documento odtBase = new Documento();
        odtBase.setCaminho("/home/iapereira/");
        odtBase.setTipo(".odt");
        odtBase.setIndicacao(txtBase);
        this.vetTipoDocumento.put("odt", odtBase);
    }

    public Documento criaDocumento(String tipo) {
        try {
            // 1) com a interface cloneable e o método clone => java
            return this.vetTipoDocumento.get(tipo).clone();

            // 2) com o construtor recebendo uma instancia como protótipo
            // return new Documento(this.vetTipoDocumento.get(tipo));

            // 3) chamando método estático
            // return Documento.cloneByIgor(this.vetTipoDocumento.get(tipo));

        } catch (Exception e) {
            System.out.println("Tipo inexistente!");
        }
        return null;
    }

    public void adicionaModeloDocumento(Documento documento) {
        this.vetTipoDocumento.put(documento.getTipo(), documento);
    }

    public static synchronized RegistryDocumento getInstance() {
        return RegistryDocumento.INSTANCE;
    }

}
