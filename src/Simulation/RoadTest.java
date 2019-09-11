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

    @Test
    void roadChange() {
        Road road = new Road(1);
        road.roadChange();
        assertEquals(2, road.getRoadId());
    }
}