package modelo;

import com.google.gson.Gson;

import persistencia.PessoaDAO;

public class Pessoa implements Model {
    private int id;
    private String nome;  
    private static PessoaDAO pessoaDAO;    
       
    public Pessoa(){
        this.pessoaDAO = new PessoaDAO();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void meSalvo() {        
        this.pessoaDAO.salvar(this);
    }
    @Override
    public void meDeleto() {
       this.pessoaDAO.deletar(this.id);

    }
    @Override
    public void meCarrego(int id) {
        System.out.println("Me carregando de verdade!");
        this.id = id;
        this.pessoaDAO.carregarPorId(this);
    }

    @Override
    public String paraJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }    
    
}
