package negocio;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> vetObserver;

    public ArrayList<Observer> getVetObserver() {
        return vetObserver;
    }


    public void setVetObserver(ArrayList<Observer> vetObserver) {
        this.vetObserver = vetObserver;
    }



    public void subscribe(Observer observer) {
        this.vetObserver.add(observer);
    }

    public void unscribe(Observer observer) {
        this.vetObserver.remove(observer);
    }

    public void unscribe(int i) {
        this.vetObserver.remove(i);
    }
  

    protected void notifyChangedState(String mensagem) {
        for (int i = 0; i < this.vetObserver.size(); i++) {
            this.vetObserver.get(i).update(mensagem);
            // se eu quisesse mandar toda a instancia de jogo
            // para isso a interface de observer deveria acompanhar esta
            // modificacao, ou seja, o método update deveria ter a seguinte
            // assinatura void update (Jogo jogo) ou void update (Subject subject)
            // this.vetObserver.get(i).update(this);
        }
    } 

 
    // rolou um gol-> de quem!
    public abstract void changedState(boolean gol);
    
}
