package modelo;

public interface Model {
    public int getId();
    public void setId(int id);
    public String getNome();
    public void setNome(String nome);
    public void meCarrego(int id);
    public void meSalvo();
    public void meDeleto();
    public String paraJson();

}
