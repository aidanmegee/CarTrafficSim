package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight { //Traffic Light class

    public int lightPositionOnRoad;
    public ArrayList<Road> roads = new ArrayList<>();

    public enum trafficLightState {RED, ORANGE, GREEN} //index 0-Red, 1-Orange, 2-Green

    private trafficLightState currentState = trafficLightState.GREEN;

    /**
     * @param lightPositionOnRoad position of any traffic light object on a road
     */
    public TrafficLight(int lightPositionOnRoad) {
        this.lightPositionOnRoad = lightPositionOnRoad;
    }

    public void operate() throws InterruptedException { //operates the traffic lights, Thread.sleep sets time the currentState stays as a certain enum
        switch (this.currentState) {
            case RED:
                System.out.println("Traffic Lights are Red");
                Thread.sleep(1000);
                this.currentState = trafficLightState.GREEN;
                break;
            case GREEN:
                System.out.println("Traffic Lights are Green");
                Thread.sleep(500);
                this.currentState = trafficLightState.ORANGE;
                break;
            case ORANGE:
                System.out.println("Traffic Lights are Orange");
                Thread.sleep(1000);
                this.currentState = trafficLightState.RED;
                break;
        }
    }

    public void addRoad() {
        for (Road connectingRoad : roads) {
            connectingRoad.addVehicle();
            connectingRoad.addTrafficLight();

        }
    }


    /*Setters and getter methods for fields in Traffic Light class*/

    public int getLightPositionOnRoad() {
        return lightPositionOnRoad;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void setLightPositionOnRoad(int lightPositionOnRoad) {
        this.lightPositionOnRoad = lightPositionOnRoad;
    }

}

