package Simulation;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Simulation extends JPanel {

    private JMenu cityEditing, simulation;
    private JMenuItem ce1, ce2, ce3, ce4, s1, s2, s3, s4;

    Road road = new Road(1, 300, 80, 10, 10, 10, 50, 10);
    Car car = new Car(1, 0, 1, 2, 10);

    //Constructor holds GUI components
    public Simulation() {

        this.setModel(road, car);
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

        JPanel cityViewPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        cityViewPanel.setLayout(new GridLayout(2, 3));
        add(bottomPanel);
        menuBar.add(cityEditing);
        menuBar.add(simulation);
        mainFrame.add(this);
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        revalidate();
        repaint();
    }

    public void addStraightRoad() { //add a road object to simulation //TODO possibly need two methods to add different intersection types
        for (Road road : road.connectingRoads) {
            road.connectingRoads.add(road);
            road.setRoadLength(road.getRoadLength());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        road.drawRoad(g);
        car.drawCar(g);
    }

    void setModel(Road road, Car car) {
        this.road = road;
        this.car = car;
    }

    public void addVehicle() { //adds a random vehicle index 0, 1, 2 to the road
        Random random = new Random();
        int randomVehicle = random.nextInt(3);
        switch (randomVehicle) {
            case 0:
                road.currentVehicles.add(new Car(1, 0, 1, 2, 10));
                break;
            case 1:
                road.currentVehicles.add(new Motorbike(1, 0, 2, 2, 10));
                break;
            case 2:
                road.currentVehicles.add(new Bus(1, 0, 3, 2, 10));
                break;
        }
    }

    public void addTrafficLight() {
        for (TrafficLight trafficLight : road.trafficLights) {
            //implement scanner to determine if user adds a traffic light
            road.trafficLights.add(trafficLight);
            trafficLight.setLightPositionOnRoad(trafficLight.getLightPositionOnRoad());
        }
    }

    public void changeRoad() { //change road, adds connecting road to road ArrayList
        for (Road connectingRoad : road.connectingRoads) {
            for (Vehicle vehicle : road.currentVehicles) {
                if (vehicle.getPositionOnRoad() == road.getRoadLength()) {
                    connectingRoad.currentVehicles.add(vehicle);
                    connectingRoad.removeVehicle();
                    vehicle.setPositionOnRoad(0);
                }
            }
        }
    }

}
