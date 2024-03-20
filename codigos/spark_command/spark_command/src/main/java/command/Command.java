package command;


import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;

public abstract class Command {
    protected String html;
    protected Map<String, Object> map;


    public Command(String html){
        this.html = html;
        this.map = new HashMap<>();
    }

    

    public String getHtml() {
        return html;
    }



    public void setHtml(String html) {
        this.html = html;
    }

    public abstract Map<String, Object> execute(Request req, Response resp);


}
