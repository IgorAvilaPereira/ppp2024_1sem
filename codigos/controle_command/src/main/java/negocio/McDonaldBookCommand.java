package negocio;

import equipamentos.McDonaldBook;

public class McDonaldBookCommand implements Command {

    private McDonaldBook mcDonaldBook;

    public McDonaldBookCommand(McDonaldBook mDonaldBook){
        this.mcDonaldBook = mDonaldBook;
    }


    @Override
    public void execute() {
        this.mcDonaldBook.ligar();
        this.mcDonaldBook.ligarModoDesempenho();
    }

    @Override
    public void undo() {
        this.mcDonaldBook.powerOff();
    }

}
