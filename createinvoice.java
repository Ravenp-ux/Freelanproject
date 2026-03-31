import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createinvoice  extends JFrame{
    private JButton invoice;
    private JComboBox status;
    private JTextField name;
    private JTextField project;
    private JTextField date;
    private JTextField amount;
    private JTextField balance;
    private JPanel pan;
    private JLabel total;

    public createinvoice() {
        setContentPane(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);
        setVisible(true);
        status.addItem("");
        status.addItem("PENDING");
        status.addItem("PAID");
        status.addItem("UNPAID");
        invoice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
                String nm = name.getText();
                String proj = project.getText();
                String dt = date.getText();
                String amm = amount.getText();
                String bal = balance.getText();
                JOptionPane.showMessageDialog(createinvoice.this, "NAME: " + nm + "\n" + "PROJECT_DISCRIPTION: "+ proj + "\n" + 
                                              "DATE: " + dt + "\n" + "AMMOUNT: " + amm + "\n" + "BALANCE: " + bal + "\n\n" +
                                              total.getText())  ;
                dispose();


            }
        });
    }
    public void add(){
        try{
            Double am = Double.parseDouble(amount.getText());
            Double ba = Double.parseDouble(balance.getText());
            Double ha =(am*0.12) ;
            Double hi = ha + ba;
            total.setText(String.valueOf(hi));
        }catch (NumberFormatException e) {
            total.setText("Invalid Amount");

        }
        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new createinvoice().setVisible(true);
            }
        });
    }
}
