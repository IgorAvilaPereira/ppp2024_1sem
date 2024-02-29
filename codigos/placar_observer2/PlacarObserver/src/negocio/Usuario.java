package negocio;

public class Usuario implements Observer {
    private String nome;
    private String telefone;

    public Usuario(String nome){
        this.nome = nome;
    }


    @Override
    public void update(String mensagem) {
        System.out.println(this.nome +": recebeu a notificação de um novo placar:"+mensagem);
    }
    
}
