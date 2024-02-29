package negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Jogo extends Subject {
    private String timeDaCasa;
    private String timeVisitante;
    private int nroDeGolsTimeDaCasa;
    private int nroDeGolsTimeVisitante;
    private LocalDateTime horarioInicioJogo;
    private LocalDateTime horarioFimJogo;

 

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



   
    @Override
    public void changedState(boolean gol) {
        if (gol){
            this.nroDeGolsTimeDaCasa++;
        } else {
            this.nroDeGolsTimeVisitante++;
        }
        this.notifyChangedState("Placar atual:"+this.nroDeGolsTimeDaCasa+"-"+this.nroDeGolsTimeVisitante);
    }


   


    
}
