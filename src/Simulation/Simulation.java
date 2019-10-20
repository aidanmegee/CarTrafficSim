package Simulation;

import javax.swing.*;

public class Simulation extends JFrame {

    JMenu cityEditing, simulation;
    JMenuItem ce1, ce2, ce3, ce4, s1, s2, s3, s4;

    public Simulation() {
        super("Traffic Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        s4 = new JMenuItem("Set Vehicle Spawn Rate");

        pack();
        setLocationRelativeTo(null);
    }

}
