package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PessoaProxy implements Model {
    private Pessoa pessoa;

    public PessoaProxy(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            this.registraLog("acesso:"+username);
            this.pessoa = new Pessoa();
        } else {
            this.registraLog("tentativa incorreta de acesso!"+username);
            throw new IllegalArgumentException("senha errada!, n passa nada");
        }
    }

    @SuppressWarnings("unused")
    private void lerLog() {
        try {
            File myObj = new File("meu_log.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private void registraLog(String mensagem) {
        try (FileWriter fw = new FileWriter("meu_log.txt", true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter log = new PrintWriter(bw);
            log.println(mensagem);
            log.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void meSalvo() {
        System.out.println("Salvando o objeto....");
        this.registraLog("Salvando o objeto....");
        this.pessoa.meSalvo();
    }

    @Override
    public void meDeleto() {
        System.out.println("Deletando o objeto....");
        this.registraLog("Deletando o objeto....");
        this.pessoa.meDeleto();
    }

    @Override
    public void meCarrego(int id) {
        System.out.println("Carregando o objeto....");
        this.registraLog("Carregando o objeto....");
        this.pessoa.meCarrego(id);

    }

    @Override
    public int getId() {
        return this.pessoa.getId();
    }

    @Override
    public String getNome() {
        if (this.pessoa.getNome() == null) {
            System.out.println("chamando o carrega de verdade!");
            this.pessoa.meCarrego(pessoa.getId());
            return this.pessoa.getNome();
        } else {
            return this.pessoa.getNome();
        }
    }

    @Override
    public void setId(int id) {
        this.pessoa.setId(id);
    }

    @Override
    public void setNome(String nome) {
        this.pessoa.setNome(nome);
    }

    @Override
    public String paraJson() {
        this.registraLog("Transformando objeto para json");
        return this.pessoa.paraJson();
    }


}
