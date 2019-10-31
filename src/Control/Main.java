package Control;

import Model.Car;
import Model.Road;
import View.Simulation;
import View.mainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JPanel cityEditingPanel;
    static JButton addRoad;

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        Simulation simulation = new Simulation();
        Road road = new Road(1, 100, 20);
        Car car = new Car(1, 0, 1, 2);

        mainFrame.setCreateNewCity(newCityEvent -> {
            mainFrame.removeAll();
            mainFrame.add(cityEditingPanel = new JPanel(), BorderLayout.EAST);
            mainFrame.revalidate();
            mainFrame.repaint();

            JPanel sidePanel = new JPanel();
            JButton addRoad = new JButton("Add a Road"); //simulation can only add straight roads at the moment.
            addRoad.addActionListener(addRoadEvent -> {
                simulation.addStraightRoad();
                mainFrame.setModel(road);
                mainFrame.setModel(car);
                simulation.addTrafficLight();
            });
            sidePanel.setLayout(new BorderLayout());
            sidePanel.add(addRoad, BorderLayout.NORTH);

            mainFrame.add(sidePanel, BorderLayout.WEST);
        });

        //creates new city from scratch
        mainFrame.setEditCity(editCityEvent -> {
            //should allow user to load a city and then edit
        });
        mainFrame.setOpenCity(openCityEvent -> {
            //load file .csv try catch possibly
        });
        mainFrame.setSaveCity(saveCityEvent -> {
            //save file .csv
        });

        mainFrame.setUpdateRate(updateRateEvent -> {
            JOptionPane.showInputDialog("Enter the Update Rate");
            //set updateRate of simulation
            //popup box input that sets the update rate
        });
        mainFrame.setRunSimulation(runSimulatorEvent -> {
            simulation.startTraffic();
            simulation.updateView();
            //essentially starts the simulation
        });
        mainFrame.setStopSimulation(stopSimulatorEvent -> {
            System.exit(0);
            //stops simulator, **Add if a car crashed, create self made exception that closes program
        });
        mainFrame.setVehicleSpawnRate(vehicleSpawnRateEvent -> {
            JOptionPane.showInputDialog("Enter Vehicle Spawn Rate");
            //set spawn rate (use of timer method for spawn rates can change?
            //popup input box that sets the update rate/speed
        });

    }

}
