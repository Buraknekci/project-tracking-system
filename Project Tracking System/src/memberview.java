import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class memberview {

    private JFrame frame;
    private JLabel welcomeLabel;




    public void run() {
        try {
            memberview window = new memberview();
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public memberview() {
        initialize();

    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setBackground(SystemColor.activeCaption);
        frame.getContentPane().setForeground(SystemColor.activeCaption);
        frame.setBounds(100, 100, 675, 475);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel welcomeLabel = new JLabel("Logged in as: Developer/Programmer");
        welcomeLabel.setFont(new Font("Burak", Font.BOLD, 14));
        welcomeLabel.setBounds(193, 11, 258, 20);
        frame.getContentPane().add(welcomeLabel);

        JButton accounthoursButton = new JButton("Account hours");
        accounthoursButton.addActionListener(e -> {

            timeaccounting newaccount = new timeaccounting();
            newaccount.run();
        });
        accounthoursButton.setBounds(46, 99, 137, 23);
        frame.getContentPane().add(accounthoursButton);


    }
}