package negocio;

import javax.swing.JOptionPane;

public class PlacarJogoPoupUp implements Observer {

    @Override
    public void update(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Placar PoupUp", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
