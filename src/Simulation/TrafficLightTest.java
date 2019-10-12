package Simulation;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    @Test
    void trafficLightTest() {
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.setLightPositionOnRoad(24);
        trafficLight.setCurrentState(TrafficLight.trafficLightState.RED);
        assertEquals(24, trafficLight.getLightPositionOnRoad());
    }

    @Test
    void operate() throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.operate();

    }
}
