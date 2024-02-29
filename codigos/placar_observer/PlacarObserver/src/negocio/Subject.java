package negocio;

public interface Subject {
    void subscribe(Observer observer);
    void unscribe(Observer observer);
    void unscribe(int i);
    void notify(String mensagem);  
 
    // rolou um gol-> de quem!
    void changedState(boolean gol);
    
}
