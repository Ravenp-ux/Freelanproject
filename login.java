import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField user;
    private JPasswordField password;
    private JButton login;
    private JPanel fann;

    public login() {
        setContentPane(fann);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,300);
        setVisible(true);
        setTitle("ADMIN LOGIN");

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String l = user.getText();
                String pa = new String(password.getPassword());

            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new dashbord().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

}
