package Simulation;

import java.awt.*;
import java.util.ArrayList;

public class Road { //Road class

    //Road class variables
    public int roadLength;
    public int roadNumber;
    private int roadWidth;
    public ArrayList<Road> connectingRoads = new ArrayList<>();
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();

    /**
     * @param roadNumber which road the vehicle is travelling on
     * @param roadLength length of which the vehicle is travelling on
     */
    public Road(int roadNumber, int roadLength, int roadWidth) {
        this.roadNumber = roadNumber;
        this.roadLength = roadLength;
        this.roadWidth = roadWidth;
    }

    void drawRoad(Graphics roadGraphics) {

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

    public int getRoadWidth() {
        return roadWidth;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

    public void setRoadWidth(int roadWidth) {
        this.roadWidth = roadWidth;
    }

}
