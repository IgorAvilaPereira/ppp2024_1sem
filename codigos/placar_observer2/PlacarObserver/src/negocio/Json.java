package negocio;

public class Json implements Observer {

    @Override
    public void update(String mensagem) {
        System.out.println("{ \"mensagem\": '"+mensagem+"'}"); 

    }

}
