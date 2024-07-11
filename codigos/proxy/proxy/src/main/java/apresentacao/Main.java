package apresentacao;

import modelo.Model;
import modelo.PessoaProxy;

public class Main {
    public static void main(String[] args) {
        Model p = new PessoaProxy("vinny", "mexeacadeira");
        p.meCarrego(3);
        System.out.println(p.getNome());
        System.out.println(p.paraJson());
    }
}