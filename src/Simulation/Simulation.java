package Simulation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Simulation extends JFrame {

    private JMenu cityEditing, simulation;
    private JMenuItem ce1, ce2, ce3, ce4, s1, s2, s3, s4;
    public ArrayList<Road> connectingRoads = new ArrayList<>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<>(1); //index 0, 1 for traffic light array//index 0, 1 for traffic light array
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();

    Road road = new Road(1, 30);
    TrafficLight trafficLight = new TrafficLight(29);
    Car car = new Car(1, 0, 1, 2);
    Motorbike motorbike = new Motorbike(1, 0, 2, 2);
    Bus bus = new Bus(1, 0, 3, 2);


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
        cityViewPanel.setLayout(new GridLayout(1, 3));

        menuBar.add(cityEditing);
        menuBar.add(simulation);
        setJMenuBar(menuBar);
        setSize(1400, 1200);
        setLayout(new BorderLayout());
        setVisible(true);

        pack();
        setLocationRelativeTo(null);
    }

    public void addVehicle() { //adds a random vehicle index 0, 1, 2 to the road
        Random random = new Random();
        int randomVehicle = random.nextInt(3);
        switch (randomVehicle) {
            case 0:
                currentVehicles.add(new Car(1, 0, 1, 2));
                break;
            case 1:
                currentVehicles.add(new Motorbike(1, 0, 2, 2));
                break;
            case 2:
                currentVehicles.add(new Bus(1, 0, 3, 2));
                break;
        }
    }

    public void addTrafficLight() {
        for (TrafficLight trafficLight : trafficLights) {
            //implement scanner to determine if user adds a traffic light
            trafficLights.add(trafficLight);
            trafficLight.setLightPositionOnRoad(road.getRoadLength() - 1);
        }
    }

    public void moveVehicle() { //moves vehicle based on the position on a road
        for (Vehicle vehicle : currentVehicles) {
            if (vehicle.getPositionOnRoad() < road.getRoadLength()) {
                vehicle.setPositionOnRoad(vehicle.getPositionOnRoad() + vehicle.getSpeed());
            }
        }
    }

    public void slowVehicle() {
        for (TrafficLight trafficLightOnCurrentRoad : trafficLights) {
            for (Vehicle vehicle : currentVehicles) {
                if (vehicle.getPositionOnRoad() == road.getRoadLength() - 6 && trafficLightOnCurrentRoad.currentState == TrafficLight.trafficLightState.ORANGE) {
                    vehicle.setSpeed(vehicle.getSpeed() / 2); //vehicle halves it's speed if lights are orange and vehicle is near the end of a road
                    if (vehicle.getPositionOnRoad() == road.getRoadLength() - 1 && trafficLightOnCurrentRoad.currentState == TrafficLight.trafficLightState.RED) {
                        vehicle.setSpeed(0); //vehicle stops on red light
                        vehicle.setPositionOnRoad(road.getRoadLength() - 2);
                    }
                }
            }
        }
    }

    public void changeRoad() { //change road, adds connecting road to road ArrayList
        for (Road connectingRoad : connectingRoads) {
            for (Vehicle vehicle : currentVehicles) {
                if (vehicle.getPositionOnRoad() == road.getRoadLength()) {
                    connectingRoad.currentVehicles.add(vehicle);
                    connectingRoad.removeVehicle();
                    vehicle.setPositionOnRoad(0);
                }
            }
        }
    }

    public ArrayList<Road> getConnectingRoads() {
        return connectingRoads;
    }

    public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public ArrayList<Vehicle> getCurrentVehicles() {
        return currentVehicles;
    }

}