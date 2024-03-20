package apresentacao;

import equipamentos.McDonaldBook;
import equipamentos.ProjetorEpson;
import equipamentos.TelaProjecao;
import equipamentos.TvSamsung;
import negocio.TvSamsungCommand;
import negocio.Controle;
import negocio.McDonaldBookCommand;
import negocio.ModoCinemaCommand;

public class Main {
    public static void main(String[] args) {

        TvSamsung tvSamsung = new TvSamsung();
        McDonaldBook mcDonaldBook = new McDonaldBook();
        ProjetorEpson projetorEpson = new ProjetorEpson();
        TelaProjecao telaProjecao = new TelaProjecao();

        ModoCinemaCommand modoCinemaCommand = new ModoCinemaCommand(projetorEpson, telaProjecao);
        TvSamsungCommand tvSamsungCommand = new TvSamsungCommand(tvSamsung);
        McDonaldBookCommand mcDonaldBookCommand = new McDonaldBookCommand(mcDonaldBook);



        Controle controle = new Controle();
        controle.setSlot(0, tvSamsungCommand);
        controle.setSlot(1, mcDonaldBookCommand);
        controle.setSlot(3, modoCinemaCommand);

        controle.buttonOnPressed(3);
        // controle.buttonOnPressed(0);
        // controle.buttonOnPressed(1);
        // controle.buttonOffPressed(0);


    }
}