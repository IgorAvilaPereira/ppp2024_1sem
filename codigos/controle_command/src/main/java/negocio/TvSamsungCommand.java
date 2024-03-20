package negocio;

import equipamentos.TvSamsung;

public class TvSamsungCommand implements Command {
    private TvSamsung tvSamsung;

    public TvSamsungCommand(TvSamsung tvSamsung){
        this.tvSamsung = tvSamsung;
    }

    @Override
    public void execute() {
        this.tvSamsung.ligar();
    }

    @Override
    public void undo() {
        this.tvSamsung.desligar();
    }

}
