package Simulation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Road { //Road class

    //Road class variables
    public int roadLength;
    public int roadNumber;
    public ArrayList<Road> connectingRoads = new ArrayList<>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<>(1); //index 0, 1 for traffic light array//index 0, 1 for traffic light array
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();

    /**
     * @param roadNumber which road the vehicle is travelling on
     * @param roadLength length of which the vehicle is travelling on
     */
    public Road(int roadNumber, int roadLength) {
        this.roadNumber = roadNumber;
        this.roadLength = roadLength;
    }

    public void removeVehicle() { //removes vehicle from road if the vehicles position is equal to the road length and there are no new roads.
        for (Road connectingRoad : connectingRoads) {
            for (Vehicle vehicle : currentVehicles) {
                if (vehicle.getPositionOnRoad() == getRoadLength()) {
                    connectingRoad.currentVehicles.remove(vehicle); //Only removes vehicle at the end of a certain road with no connecting roads available
                }
            }
        }
    }

    /*setters and getters for Road class*/
    public int getRoadLength() {
        return roadLength;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

}
