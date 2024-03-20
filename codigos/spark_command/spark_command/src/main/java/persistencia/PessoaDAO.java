package persistencia;

import java.util.ArrayList;

import negocio.Pessoa;

public class PessoaDAO {
    // conexao

    public ArrayList<Pessoa> listar() {
        ArrayList<Pessoa> vetPessoa = new ArrayList();
        vetPessoa.add(new Pessoa("Igor"));
        vetPessoa.add(new Pessoa("Marcio"));
        return vetPessoa;
    }

}
