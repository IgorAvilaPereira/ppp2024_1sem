package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import negocio.Mario;

public class Tela {
    public JFrame frame;
    public JButton button;
    public JButton buttonPegarCogumelo;
    public Box box;
    public Mario mario;
    public JButton buttonLevarDano;
    public JButton buttonPegarFlor;
    public JButton buttonPegarPena;
    public JButton buttonPegarEstrela;

    public Tela() {
        this.mario = new Mario();
        this.frame = new JFrame();
        this.button = new JButton();
        this.buttonPegarCogumelo = new JButton("PegarCogumelo");
        this.buttonPegarPena = new JButton("PegarPena");
        this.buttonPegarFlor = new JButton("PegarFlor");
        this.buttonLevarDano = new JButton("LevarDano");
        this.buttonPegarEstrela = new JButton("PegarEstrela");

        this.box = Box.createVerticalBox();
        this.box.add(button);
        this.box.add(buttonPegarCogumelo);
        this.box.add(buttonPegarPena);
        this.box.add(buttonPegarFlor);
        this.box.add(buttonLevarDano);
        this.box.add(buttonPegarEstrela);

        this.buttonPegarCogumelo.addActionListener(new AcaoPegarCogumelo(this));
        this.buttonPegarFlor.addActionListener(new AcaoPegarFlor(this));
        this.buttonPegarPena.addActionListener(new AcaoPegarPena(this));
        this.buttonLevarDano.addActionListener(new AcaoLevarDano(this));
        this.buttonPegarEstrela.addActionListener(new AcaoPegarEstrela(this));

        this.frame.add(box);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationByPlatform(true);
        this.frame.setSize(500, 300);
        this.frame.setVisible(true);

        this.trocaImagem(this.mario.getEstadoAtualString() + ".jpg");

    }

    public void trocaImagem(String url) {
        this.button.setIcon(new ImageIcon(url));
    }

    public class AcaoPegarCogumelo implements ActionListener {
        private Tela Tela;

        public AcaoPegarCogumelo(Tela Tela) {
            this.Tela = Tela;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            this.Tela.mario.pegarCogumelo();
            this.Tela.trocaImagem(this.Tela.mario.getEstadoAtualString() + ".jpg");

        }
    }

    public class AcaoPegarFlor implements ActionListener {
        private Tela Tela;

        public AcaoPegarFlor(Tela Tela) {
            this.Tela = Tela;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            this.Tela.mario.pegarFlor();
            this.Tela.trocaImagem(this.Tela.mario.getEstadoAtualString() + ".jpg");

        }
    }

    public class AcaoPegarPena implements ActionListener {
        private Tela Tela;

        public AcaoPegarPena(Tela Tela) {
            this.Tela = Tela;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            this.Tela.mario.pegarPena();
            this.Tela.trocaImagem(this.Tela.mario.getEstadoAtualString() + ".jpg");

        }
    }

    public class AcaoLevarDano implements ActionListener {
        private Tela Tela;

        public AcaoLevarDano(Tela Tela) {
            this.Tela = Tela;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            this.Tela.mario.levarDano();
            this.Tela.trocaImagem(this.Tela.mario.getEstadoAtualString() + ".jpg");

        }
    }

    public class AcaoPegarEstrela implements ActionListener {
        private Tela Tela;

        public AcaoPegarEstrela(Tela Tela) {
            this.Tela = Tela;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            this.Tela.trocaImagem("MarioEstrela.jpg");
            this.Tela.mario.pegarEstrela();
            // this.Tela.trocaImagem(Tela.mario.getEstadoAtualString()+".jpg");           
        }
    }

    public static void main(String[] args) {
        // Mario marioBros = new Mario();
        new Tela();

        // Tela.trocaImagem(marioBros.getEstadoAtualString()+".jpg");
        // marioBros.pegarCogumelo();
        // Tela.trocaImagem(marioBros.getEstadoAtualString()+".jpg");
        // marioBros.levarDano();
        // marioBros.levarDano();
        // Tela.trocaImagem(marioBros.getEstadoAtualString()+".jpg");

        // Mario marioBros = new Mario();
        // System.out.println(marioBros.getEstadoAtualString());

        // marioBros.pegarEstrela();
        // System.out.println(marioBros.getEstadoAtualString());
        // marioBros.pegarCogumelo();
        // System.out.println(marioBros.getEstadoAtualString());
        // marioBros.pegarEstrela();
        // System.out.println(marioBros.getEstadoAtualString());

    }

}