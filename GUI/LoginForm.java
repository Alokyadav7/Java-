package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.accessibility.Accessible;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginForm {
    static int CurrentArray;
    static User[] UserArray = new User[100];
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200, 400);
        JTextField NameTextField = new JTextField();
        JTextField UserNameTextField = new JTextField();
        JTextField PasswordTextField = new JTextField();

        JLabel NameLabel = new JLabel("Name:-");
        JLabel UserNameLabel = new JLabel("UserName:-");
        JLabel PasswordLabel = new JLabel("Password:-");

        JButton SignUpButton = new JButton();
        SignUpButton.setText("Sign Up");

        JButton LoginInButton = new JButton();
        LoginInButton.setText("Login In");

        f.setLayout(new GridLayout(4, 2));

        f.add(NameLabel);
        f.add(NameTextField);

        f.add(UserNameLabel);
        f.add(UserNameTextField);

        f.add(PasswordLabel);
        f.add(PasswordTextField);

        f.add(LoginInButton);
        f.add(SignUpButton);

        LoginInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PasswordLabel.setVisible(false);

            }
        });

        SignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User UserToAdd = new User(NameTextField.getName(), UserNameTextField.getName(), PasswordTextField.getText());
                boolean UserExit = false;

                for (int i = 0; i < UserArray.length; i++) {
                    if (UserArray[i] != null) {
                        UserExit = true;
                    }
                }
                if (UserExit == false) {
                    UserArray[CurrentArray] = UserToAdd;
                    System.out.println("Added User With Name:" + UserToAdd.getName());
                }
            }
        });
        f.setVisible(true);
    }
}
