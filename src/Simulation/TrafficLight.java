package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight { //Traffic Light class

    public int lightPositionOnRoad;
    public ArrayList<Road> roads = new ArrayList<>();

    public enum trafficLightState {RED, ORANGE, GREEN} //index 0-Red, 1-Orange, 2-Green
    trafficLightState currentState = trafficLightState.GREEN;

    public TrafficLight(int lightPositionOnRoad) {
        this.lightPositionOnRoad = lightPositionOnRoad;
    }

    public void operate() throws InterruptedException { //operates the traffic lights, determines if vehicle changes road based on traffic light state
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


//    public void changeRoad() {
//        Road connectingRoad = new Road(1, 30); //instantiates new road to connect to
//        for (Road road : roads) {
//            if (getPositionOnRoad() == road.getRoadLength()) {
//                //check for traffic lights ****
//                roads.add(connectingRoad);
//                //eventually check if no roads are added to end of 1st road, removeVehicle() method is called
//                road.setRoadNumber(1);
//                road.setRoadLength(30);
//                setPositionOnRoad(0);
//            }
//        }
//    }

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

