package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {


    @Test
    void roadTest() { //test for getters in Road Class
        Road road = new Road(1);
        assertEquals(5, road.getRoadLength());
        assertEquals(1, road.getRoadId());

    }



}