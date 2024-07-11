package apresentacao;
import javax.swing.*;

import modelo.Model;
import modelo.PessoaProxy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
  static JTextField text_field_0;
  public static void main(String[] args) {
    JFrame frame = new JFrame("Window builder!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    
    text_field_0 = new JTextField(15);
    text_field_0.setPreferredSize(new Dimension(156, 23));
    constraints.gridx = -1;
    constraints.gridy = 8;
    constraints.gridwidth = 6;
    constraints.gridheight = 6;
    panel.add(text_field_0, constraints);
    
    JButton button_0 = new JButton("Button");
    button_0.setPreferredSize(new Dimension(53, 27));
    button_0.addActionListener(new ActionListener() { 

      public void actionPerformed(ActionEvent e) { 
        adicionaPessoa();
      }

      private void adicionaPessoa() {
        Model p = new PessoaProxy("admin", "123");
        p.setNome(text_field_0.getText());
        p.meSalvo();
        System.out.println(p.getNome());
      } 
    } );
    
    constraints.gridx = -1;
    constraints.gridy = 9;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_0, constraints);
    
    frame.add(panel);
    frame.setVisible(true);
  }
}
