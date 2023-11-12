import javax.swing.*;
import java.awt.*;

public class newproject {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                newproject window = new newproject();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


    public newproject() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
    }

}