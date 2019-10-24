package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JPanel implements ActionListener {

    private JMenu cityEditing, simulation;
    private JMenuItem ce1, ce2, ce3, ce4, s1, s2, s3, s4;

    public mainFrame() {

        JFrame mainFrame = new JFrame("Traffic Simulator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        cityEditing = new JMenu("City Editing");
        simulation = new JMenu("Simulation");
        ce1 = new JMenuItem("Create a new City");
        ce2 = new JMenuItem("Edit a City");
        ce3 = new JMenuItem("Open a City");
        ce4 = new JMenuItem("Save a City");

        s1 = new JMenuItem("Set Update Rate");
        s2 = new JMenuItem("Run the Simulator");
        s3 = new JMenuItem("Stop the Simulator");
        s4 = new JMenuItem("Set Model.Vehicle Spawn Rate"); //popup dialogue boxes to set these spawn rates

        cityEditing.add(ce1);
        cityEditing.add(ce2);
        cityEditing.add(ce3);
        cityEditing.add(ce4);

        simulation.add(s1);
        simulation.add(s2);
        simulation.add(s3);
        simulation.add(s4);

        JPanel cityViewPanel = new JPanel();
        JPanel bottomPanelLeft = new JPanel();
        JPanel bottomPanelRight = new JPanel();
        JLabel bottomLabel1 = new JLabel();
        JLabel bottomLabel2 = new JLabel();
        bottomLabel1.setText("Mode: ");
        bottomLabel2.setText("Status: ");

        cityViewPanel.setLayout(new GridLayout(10, 10));
        bottomPanelLeft.setLayout(new BorderLayout());
        bottomLabel1.setLayout(new BorderLayout());
        bottomLabel2.setLayout(new BorderLayout());

        bottomPanelLeft.add(bottomLabel1, BorderLayout.WEST);
        bottomPanelRight.add(bottomLabel2, BorderLayout.EAST);
        menuBar.add(cityEditing);
        menuBar.add(simulation);
        mainFrame.add(bottomPanelLeft);
        mainFrame.add(bottomPanelRight);
        mainFrame.add(this);
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        revalidate();
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ce1.addActionListener(this);
        ce2.addActionListener(this);
        ce3.addActionListener(this);
        ce4.addActionListener(this);

        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
    }
}
