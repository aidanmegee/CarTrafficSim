package Simulation;

import java.awt.*;
import java.util.ArrayList;

public class Road { //Road class

    //Road class variables
    public int roadLength;
    public int roadNumber;
    private int roadWidth;
    private int x, y, x1, y1;
    private final int SCALE;
    public ArrayList<Road> connectingRoads = new ArrayList<>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<>(1); //index 0, 1 for traffic light array//index 0, 1 for traffic light array
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();

    /**
     * @param roadNumber which road the vehicle is travelling on
     * @param roadLength length of which the vehicle is travelling on
     */
    public Road(int roadNumber, int roadLength, int roadWidth, int x, int y, int x1, int y1, int SCALE) {
        this.roadNumber = roadNumber;
        this.roadLength = 30;
        this.roadWidth = 8;
        this.x = 1;
        this.y = 1;
        this.x1 = 1;
        this.y1 = 5;
        this.SCALE = 10;
    }

    void drawRoad(Graphics roadGraphics) {
        Graphics2D roadGraphics2 = (Graphics2D) roadGraphics;
        roadGraphics2.setColor(Color.BLACK);
        roadGraphics2.fillRect(x, y, (roadLength) * SCALE, (roadWidth) * SCALE);
        roadGraphics2.setColor(Color.WHITE);
        roadGraphics2.drawLine(x1, y1, (roadLength) * SCALE, (2) * SCALE);
        roadGraphics2.scale(10.0, 10.0);

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

    public void moveVehicle() { //moves vehicle based on the position on a road
        for (Vehicle vehicle : currentVehicles) {
            if (vehicle.getPositionOnRoad() < getRoadLength()) {
                vehicle.setPositionOnRoad(vehicle.getPositionOnRoad() + vehicle.getSpeed());
            } else if (vehicle.getPositionOnRoad() <= vehicle.getPositionOnRoad() - 3) {
                vehicle.setSpeed(0); //stop vehicle if vehicle is 3 positions behind
                vehicle.setPositionOnRoad(vehicle.getPositionOnRoad()); //stays in that position until vehicle in front moves
            }
        }
    }

    public void slowVehicle() {
        for (TrafficLight trafficLightOnCurrentRoad : trafficLights) {
            for (Vehicle vehicle : currentVehicles) {
                if (vehicle.getPositionOnRoad() == roadLength - 6 && trafficLightOnCurrentRoad.currentState == TrafficLight.trafficLightState.ORANGE) {
                    vehicle.setSpeed(vehicle.getSpeed() / 2); //vehicle halves it's speed if lights are orange and vehicle is near the end of a road
                    if (vehicle.getPositionOnRoad() == roadLength - 1 && trafficLightOnCurrentRoad.currentState == TrafficLight.trafficLightState.RED) {
                        vehicle.setSpeed(0); //vehicle stops on red light
                        vehicle.setPositionOnRoad(roadLength - 2);
                    }
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
    public ArrayList<Road> getConnectingRoads() {
        return connectingRoads;
    }

    public ArrayList<Vehicle> getCurrentVehicles() {
        return currentVehicles;
    }

    public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }
}
