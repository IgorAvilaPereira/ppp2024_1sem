package prototype_botao;

public class Main {
    public static void main(String[] args) {


        Botao x = Botao.cloneDoIgor();
        x.setTexto("Adicionar");
        x.setCor("red");
        x.setX("100px");
        x.setY("100px");
        System.out.println(x);

        Botao p = Botao.cloneDoIgor();
        System.out.println(p);
        

    }
}