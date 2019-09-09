package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {


    @Test
    void trafficLightTest() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.getColourGreen("Green");
        trafficLight.getColourRed("Red");
        trafficLight.getMaxRateOfChange(0.99);
        trafficLight.getMinRateOfChange(0.01);


    }

    @Test
    void setColourGreen() {
        TrafficLight trafficLight = new TrafficLight();
        assertEquals("Green", trafficLight.colourGreen);
    }

    @Test
    void setColourRed() {
        TrafficLight trafficLight = new TrafficLight();
        assertEquals("Red", trafficLight.colourRed);
    }

    @Test
    void rateOfChange() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.getMaxRateOfChange(0.99);
        trafficLight.getMinRateOfChange(0.01);
        assertEquals(0.99, trafficLight.maxRateOfChange);
        assertEquals(0.01, trafficLight.minRateOfChange);
    }


}