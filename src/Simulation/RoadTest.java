package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    void roadTest() { //test for road length in Road Class
        Road road = new Road();
        road.setRoadLength(5);
        road.getRoadLength(5);
        assertEquals(5, road.roadLength());

    }

}