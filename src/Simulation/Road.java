package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class Road { //Road class

    //Road class variables
    public int roadLength;
    public int roadNumber;
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<>(1); //index 0, 1 for traffic light array

    /**
     * @param roadNumber which road the vehicle is travelling on
     * @param roadLength length of which the vehicle is travelling on
     */
    public Road(int roadNumber, int roadLength) {
        this.roadNumber = roadNumber;
        this.roadLength = 30;
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
            trafficLight.setLightPositionOnRoad(getRoadLength());
        }
    }

    public void moveVehicle() throws InterruptedException { //moves vehicle based on the position on a road
        for (Vehicle vehicle : currentVehicles) {
            if (vehicle.getPositionOnRoad() < getRoadLength()) {
                vehicle.setPositionOnRoad(vehicle.getPositionOnRoad() + vehicle.getSpeed());
            } else if (vehicle.getPositionOnRoad() == getRoadLength()) {
                if (trafficLights.get(0).getCurrentState() == TrafficLight.trafficLightState.GREEN) {
                    trafficLights.get(0).changeRoad();
                } else if (trafficLights.get(0).getCurrentState() == TrafficLight.trafficLightState.ORANGE && vehicle.getPositionOnRoad() >= 24) {
                    vehicle.setSpeed(vehicle.getSpeed() - 1);
                    if (vehicle.getPositionOnRoad() == getRoadLength()) {
                        vehicle.setSpeed(0);
                    }
                }
            }
        }
    }

    public void removeVehicle() { //removes vehicle from road if the vehicles position is equal to the road length and there are no new roads.
        for (Vehicle vehicle : currentVehicles) {
            if (vehicle.getPositionOnRoad() == getRoadLength() && trafficLights.get(0).getCurrentState() == TrafficLight.trafficLightState.GREEN) {
                currentVehicles.remove(vehicle.getId()); //Only removes vehicle at the end of a certain road with no connecting roads available
                vehicle.setPositionOnRoad(-1);
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

    public ArrayList<Vehicle> getCurrentVehicles() {
        return currentVehicles;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

}
