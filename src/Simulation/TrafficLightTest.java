package Simulation;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    public enum trafficLightState {RED, ORANGE, GREEN} //index 0-Red, 1-Orange, 2-Green
    public trafficLightState currentState = trafficLightState.GREEN;


    @Test
    void trafficLightTest() {
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.setLightPositionOnRoad(24);
        trafficLight.setCurrentState(TrafficLight.trafficLightState.RED);
        assertEquals(24, trafficLight.getLightPositionOnRoad());
    }

    @Test
    void operate() throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight(24);
        Random random = new Random();
        float changeState = random.nextFloat();
        System.out.println(changeState);
        switch (currentState) {
            case ORANGE:
                if (changeState < 0.8)
                    System.out.println("Traffic Lights are Orange");
                Thread.sleep(1000);
                currentState = trafficLightState.ORANGE;
            case RED:
                if (trafficLight.getCurrentState() == TrafficLight.trafficLightState.ORANGE)
                    System.out.println(currentState);
                trafficLight.setCurrentState(TrafficLight.trafficLightState.RED);
                System.out.println(currentState);
                Thread.sleep(1000);
            case GREEN:
                if (changeState >= 0.8)
                    System.out.println("Traffic Lights are Green");
                Thread.sleep(1000);
                currentState = trafficLightState.GREEN;
                break;
        }
    }
}