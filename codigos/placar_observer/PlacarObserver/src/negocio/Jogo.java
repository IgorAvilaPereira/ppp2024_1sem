package negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Jogo implements Subject {
    private String timeDaCasa;
    private String timeVisitante;
    private int nroDeGolsTimeDaCasa;
    private int nroDeGolsTimeVisitante;
    private LocalDateTime horarioInicioJogo;
    private LocalDateTime horarioFimJogo;

    private ArrayList<Observer> vetObserver;

    public Jogo(){
        this.vetObserver = new ArrayList<>();
    }

    
    
    public String getTimeDaCasa() {
        return timeDaCasa;
    }



    public void setTimeDaCasa(String timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }



    public String getTimeVisitante() {
        return timeVisitante;
    }



    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }



    public int getNroDeGolsTimeDaCasa() {
        return nroDeGolsTimeDaCasa;
    }



    public void setNroDeGolsTimeDaCasa(int nroDeGolsTimeDaCasa) {
        this.nroDeGolsTimeDaCasa = nroDeGolsTimeDaCasa;
    }



    public int getNroDeGolsTimeVisitante() {
        return nroDeGolsTimeVisitante;
    }



    public void setNroDeGolsTimeVisitante(int nroDeGolsTimeVisitante) {
        this.nroDeGolsTimeVisitante = nroDeGolsTimeVisitante;
    }



    public LocalDateTime getHorarioInicioJogo() {
        return horarioInicioJogo;
    }



    public void setHorarioInicioJogo(LocalDateTime horarioInicioJogo) {
        this.horarioInicioJogo = horarioInicioJogo;
    }



    public LocalDateTime getHorarioFimJogo() {
        return horarioFimJogo;
    }



    public void setHorarioFimJogo(LocalDateTime horarioFimJogo) {
        this.horarioFimJogo = horarioFimJogo;
    }



    public ArrayList<Observer> getVetObserver() {
        return vetObserver;
    }



    public void setVetObserver(ArrayList<Observer> vetObserver) {
        this.vetObserver = vetObserver;
    }



    @Override
    public void subscribe(Observer observer) {
        this.vetObserver.add(observer);
    }
    @Override
    public void unscribe(Observer observer) {
        this.vetObserver.remove(observer);
    }
    @Override
    public void unscribe(int i) {
        this.vetObserver.remove(i);
    }
  

    @Override
    public void changedState(boolean gol) {
        if (gol){
            this.nroDeGolsTimeDaCasa++;
        } else {
            this.nroDeGolsTimeVisitante++;
        }
        this.notify("Placar atual:"+this.nroDeGolsTimeDaCasa+"-"+this.nroDeGolsTimeVisitante);
    }


    @Override
    public void notify(String mensagem) {
        for (int i = 0; i < this.vetObserver.size(); i++) {
            this.vetObserver.get(i).update(mensagem);
        }
    } 


    
}
