package Control;

import Model.*;
import View.Simulation;
import View.mainFrame;

public class Main {

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        Simulation simulation = new Simulation();
        Road road = new Road(1,100, 20);
        Car car = new Car(1, 0, 1, 2);
        simulation.addStraightRoad();
        simulation.setRoad(road);
        simulation.addTrafficLight();
        simulation.addVehicle();
        simulation.setCar(car);

        road.moveVehicle();



    }
}
