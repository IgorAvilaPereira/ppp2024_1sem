package command;

import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;

public class TelaAdicionarCommand extends Command {

    

    public TelaAdicionarCommand(String html) {
        super(html);
    }

    @Override
    public Map<String, Object> execute(Request req, Response resp) {
        return null;
    }

}
