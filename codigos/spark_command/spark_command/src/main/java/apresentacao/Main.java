package apresentacao;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import command.*;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
    public static void main(String[] args) {
        Map<String, Command> rotas = new HashMap();
        rotas.put("listar", new ListarCommand("index.html"));
        rotas.put("tela_adicionar", new TelaAdicionarCommand("tela_adicionar.html"));
        rotas.put("deletar", new DeletarCommand("deletar.html"));

     
        get("/:command/*", (req, res) -> {
            String command = req.params(":command");
            Command commandObjeto = rotas.get(command);
            return new ModelAndView(commandObjeto.execute(req, res), commandObjeto.getHtml());
        }, new MustacheTemplateEngine());



    }
}