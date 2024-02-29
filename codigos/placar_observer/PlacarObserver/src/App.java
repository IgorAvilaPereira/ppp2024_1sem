
import java.time.LocalDateTime;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo();
        jogo.setTimeDaCasa("Sao Paulo");
        jogo.setTimeVisitante("Rio Grande");
        jogo.setHorarioInicioJogo(LocalDateTime.now());
        Usuario igor = new Usuario("Igor");
        Usuario doris = new Usuario("Doris");
        jogo.subscribe(igor);
        jogo.subscribe(doris);
        jogo.subscribe(new Jornalista("Gustavo Manhago"));
        // jogo.subscribe(new PlacarJogo());
        jogo.subscribe(new PlacarJogoPoupUp());

        jogo.changedState(true);
        jogo.changedState(true);
        jogo.changedState(true);
        jogo.changedState(true);

        jogo.unscribe(doris);

        System.out.println("=====================");

        jogo.changedState(false);


    }
}
