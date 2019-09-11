package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {


    @Test
    void trafficLightTest() { //test for colour of lights in array
        TrafficLight trafficLight = new TrafficLight();
        String[] array = trafficLight.getMyStringArray();
        assertEquals("Green", array[0]);
        assertEquals("Red", array[1]);
    }

    @Test
    void operate() { //tests for change in traffic light colour based on random double from 0.0 to 1.0
        TrafficLight trafficLight = new TrafficLight();
        // change from green to red
        //put in while loop
        boolean[] array = trafficLight.getArray();
        boolean change = false;
        while (!change)  {
            trafficLight.operate();
            if (array[1]) {
                change = true;
            }
        }

        assertFalse(array[0]);






    }
}