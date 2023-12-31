import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pmview {
    private JFrame frame;


    public void run() {
        try {
            pmview window = new pmview();
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public pmview() {
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

        JLabel welcomeLabel = new JLabel("Logged in as: Projectmanager");
        welcomeLabel.setFont(new Font("Burak", Font.BOLD, 14));
        welcomeLabel.setBounds(214, 11, 258, 20);
        frame.getContentPane().add(welcomeLabel);

        JButton btnCreateNewProject = new JButton("Create new project");
        btnCreateNewProject.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                addproject newproject = new addproject();
                newproject.run();


            }
        });
        btnCreateNewProject.setBounds(36, 69, 173, 23);
        frame.getContentPane().add(btnCreateNewProject);

        JButton btnNewProjectmember = new JButton("Register new member");
        btnNewProjectmember.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                newmember addnew = new newmember();

                addnew.run();


            }
        });
        btnNewProjectmember.setBounds(36, 119, 173, 23);
        frame.getContentPane().add(btnNewProjectmember);

        JButton btnNewButton = new JButton("Project summary");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                projectsummary newSummary = new projectsummary();

                newSummary.run();
            }
        });
        btnNewButton.setBounds(36, 167, 173, 23);
        frame.getContentPane().add(btnNewButton);

        JButton accountButton = new JButton("Time accounting");
        accountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                timeaccounting newaccounting = new timeaccounting();
                newaccounting.run();
            }
        });
        accountButton.setBounds(36, 212, 173, 23);
        frame.getContentPane().add(accountButton);


    }
}
