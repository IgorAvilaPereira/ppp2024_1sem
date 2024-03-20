package command;

import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;

public class DeletarCommand extends Command {

    public DeletarCommand(String html) {
        super(html);
    }

    @Override
    public Map<String, Object> execute(Request req, Response resp) {
        System.out.println("Teria que deletar:"+req.splat()[0]);
        map.put("mensagem", "deleta com sucesso:"+req.splat()[0]);
        return map;
    }

}
