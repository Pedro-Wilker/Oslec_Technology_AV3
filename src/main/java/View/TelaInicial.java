package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial {
    private JButton button_entrar;
    private static JPanel viewmain;
    private JButton button_entrar1;

    public TelaInicial() {
        button_entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Ok");
            }
        });
        button_entrar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Ok 1");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("View main");
        frame.setContentPane(new TelaInicial().viewmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
