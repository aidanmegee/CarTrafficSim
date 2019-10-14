package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight { //Traffic Light class

    public int lightPositionOnRoad;
    public enum trafficLightState {RED, ORANGE, GREEN} //index 0-Red, 1-Orange, 2-Green
    public trafficLightState currentState = trafficLightState.GREEN;

    /**
     * @param lightPositionOnRoad position of any traffic light object on a road
     */
    public TrafficLight(int lightPositionOnRoad) {
        this.lightPositionOnRoad = lightPositionOnRoad;
    }

    public void operate() throws InterruptedException { //operates the traffic lights, Thread.sleep sets time the currentState stays as a certain enum
        Random random = new Random();
        int changeState = random.nextInt(10);
        if (changeState < 9) {
            setCurrentState(trafficLightState.ORANGE);
            Thread.sleep(500);
            setCurrentState(trafficLightState.RED);
            Thread.sleep(2000);
            setCurrentState(trafficLightState.GREEN);
            Thread.sleep(1000);
        } else {
            setCurrentState(trafficLightState.GREEN);
            Thread.sleep(1000);
        }
    }

    /*Setters and getter methods for fields in Traffic Light class*/

    public int getLightPositionOnRoad() {
        return lightPositionOnRoad;
    }

    public trafficLightState getCurrentState() {
        return currentState;
    }

    public void setLightPositionOnRoad(int lightPositionOnRoad) {
        this.lightPositionOnRoad = lightPositionOnRoad;
    }

    public void setCurrentState(trafficLightState currentState) {
        this.currentState = currentState;
    }

}

