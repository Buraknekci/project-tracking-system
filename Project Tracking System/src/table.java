import javax.swing.*;
import java.awt.*;


public class table extends JFrame {
    JTable table;

	public table() {


        setLayout(new FlowLayout());
        String[] columnNames = { "Project-ID", "Cost", "Time"};
        Object [][] data = {{"1", "1000", "58"}};

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500,50));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

    }

    public static void main (String args []) {

        table gui = new table();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600,200);
        gui.setVisible(true);
        gui.setTitle("table");

    }



}
