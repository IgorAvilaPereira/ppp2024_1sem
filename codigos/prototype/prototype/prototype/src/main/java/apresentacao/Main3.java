package apresentacao;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import negocio.Documento;
import negocio.RegistryDocumento;

public class Main3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Documento> sistemaDeArquivos = new ArrayList<>();

        String directoryPath = "/home/iapereira/";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (!file.getName().startsWith(".")) {
                    if (file.getName().endsWith("txt")) {
                        Documento documento = RegistryDocumento.getInstance().criaDocumento("txt");
                        documento.setCaminho(directoryPath);
                        documento.setNome(file.getName());
                        sistemaDeArquivos.add(documento);
                    }
                    if (file.getName().endsWith("sql")) {
                        Documento dSQL = null;
                        dSQL = RegistryDocumento.getInstance().criaDocumento("sql");
                        if (dSQL == null){
                            dSQL = new Documento();
                            dSQL.setNome(file.getName());
                            dSQL.setTipo("sql");
                            dSQL.setCaminho(directoryPath);
                            RegistryDocumento.getInstance().adicionaModeloDocumento(dSQL);
                        } else {
                            dSQL.setNome(file.getName());
                            dSQL.setTipo("sql");
                            dSQL.setCaminho(directoryPath);
                        }                       
                        sistemaDeArquivos.add(dSQL);
                        
                    }
 
                }

            }
        }

        sistemaDeArquivos.forEach(d -> System.out.println(d));
    }

}
