package GUI;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiInterface {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField OurTextField = new JTextField();
        JButton OurButton = new JButton();

        JTextField OurTextField2 = new JTextField();
        JButton OurButton2 = new JButton();

        f.setLayout(new GridLayout());

        f.add(OurTextField);
        f.add(OurButton);

        f.add(OurTextField2);
        f.add(OurButton2);

        OurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(OurTextField.getText());
            }
        });
        OurButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(OurTextField2.getText());
            }
        });
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}