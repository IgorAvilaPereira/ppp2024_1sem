package negocio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Jornalista implements Observer {
    private String nome;
    private String meioComunicacao;

    public Jornalista(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("O Jornalista" + this.nome
                + " recebeu a notificação da mudança de placar. Irá registrar em seu bloco de notas.");

        PrintWriter out;
        try {
            out = new PrintWriter(this.nome+".txt");
            out.println(mensagem);
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim. Nao consegui salvar!!");
            
        }
    }

}
