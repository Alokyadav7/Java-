package GUI;
import javax.swing.WindowConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField  ourTextField = new JTextField();
        JButton  ourButton = new JButton();

        f.setLayout(new GridLayout());
        f.add(ourTextField);
        f.add(ourButton);

        ourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(ourTextField.getText());
            }
        });
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
