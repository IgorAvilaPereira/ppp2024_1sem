package negocio;

import equipamentos.ProjetorEpson;
import equipamentos.TelaProjecao;

public class ModoCinemaCommand implements Command {
    private ProjetorEpson projetorEpson;
    private TelaProjecao telaProjecao;

    public ModoCinemaCommand(ProjetorEpson projetorEpson, TelaProjecao telaProjecao){
        this.telaProjecao = telaProjecao;
        this.projetorEpson = projetorEpson;
    }

    @Override
    public void execute() {
        this.telaProjecao.descerTela();
        this.projetorEpson.on();
        this.projetorEpson.enableHDMI();
    }

    @Override
    public void undo() {
        this.projetorEpson.off();
        this.telaProjecao.subindoTela();
    }

}
