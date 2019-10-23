import Model.Road;
import View.Simulation;

public class Main {

    public static void main(String[] args) {
        Road road = new Road(1, 30, 20, 10, 10, 10, 10, 10);
        Simulation simulation = new Simulation();
        simulation.addStraightRoad();
        simulation.addVehicle();
        road.moveVehicle();

    }
}
