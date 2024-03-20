package negocio;

public interface Command {

    public void execute();
    // opcional
    public void undo(); 

}
