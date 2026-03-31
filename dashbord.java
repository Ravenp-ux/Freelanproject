import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashbord extends JFrame {
    private JButton create;
    private JButton logout;
    private JPanel fan;

    public dashbord() {
        setContentPane(fan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "System Logout";
                int confirmation = JOptionPane.showConfirmDialog(null, message, "System logout",JOptionPane.YES_NO_OPTION );
                if (confirmation== JOptionPane.YES_NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Logout");
                    dispose();
                }

            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new createinvoice().setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new dashbord().setVisible(true);
            }
        });
    }
}
