package command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import negocio.Pessoa;
import persistencia.PessoaDAO;
import spark.Request;
import spark.Response;

public class ListarCommand extends Command {
    private PessoaDAO pessoaDAO;

    public ListarCommand(String html){
        super(html);
        this.pessoaDAO = new PessoaDAO();
    }

    @Override
    public Map<String, Object> execute(Request req, Response resp) {
        ArrayList<Pessoa> vetPessoa = this.pessoaDAO.listar();
        map.put("vetPessoa", vetPessoa);
        return map;
    
    }

}
