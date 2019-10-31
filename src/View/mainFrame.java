package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JPanel {

    private JMenu cityEditing, simulation;
    private JMenuItem ce1, ce2, ce3, ce4, s1, s2, s3, s4;
    private JLabel modeLabel, statusLabel, modeLabel1, statusLabel1;

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
        s4 = new JMenuItem("Set Vehicle Spawn Rate"); //popup dialogue boxes to set these spawn rates

        cityEditing.add(ce1);
        cityEditing.add(ce2);
        cityEditing.add(ce3);
        cityEditing.add(ce4);

        simulation.add(s1);
        simulation.add(s2);
        simulation.add(s3);
        simulation.add(s4);

        JPanel cityViewPanel = new JPanel(new GridLayout(10, 10));
        JPanel bottomPanel = new JPanel();
        modeLabel1 = new JLabel();
        statusLabel1 = new JLabel();
        modeLabel = new JLabel("Mode: ");
        statusLabel = new JLabel("Status: ");

        this.add(cityViewPanel);
        bottomPanel.add(modeLabel, BorderLayout.WEST);
        bottomPanel.add(modeLabel1, BorderLayout.WEST);
        bottomPanel.add(statusLabel, BorderLayout.EAST);
        bottomPanel.add(statusLabel1, BorderLayout.EAST);
        menuBar.add(cityEditing);
        menuBar.add(simulation);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        mainFrame.add(this);
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);

        mainFrame.setPreferredSize(new Dimension(600, 400));
        mainFrame.setBackground(Color.DARK_GRAY);

    }

    public void setCreateNewCity(ActionListener listener) {
        ce1.addActionListener(listener);
    }

    public void setEditCity(ActionListener listener) {
        ce2.addActionListener(listener);
    }

    public void setOpenCity(ActionListener listener) {
        ce3.addActionListener(listener);
    }

    public void setSaveCity(ActionListener listener) {
        ce4.addActionListener(listener);
    }

    public void setUpdateRate(ActionListener listener) {
        s1.addActionListener(listener);
    }

    public void setRunSimulation(ActionListener listener) {
        s2.addActionListener(listener);
    }

    public void setStopSimulation(ActionListener listener) {
        s3.addActionListener(listener);
    }

    public void setVehicleSpawnRate(ActionListener listener) {
        s4.addActionListener(listener);
    }

}
