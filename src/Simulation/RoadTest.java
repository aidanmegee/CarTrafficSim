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

    @Test
    void getPositionOnRoad() {
        Road road = new Road();
        assertEquals(0, road.positionOnRoad);
    }

    @Test
    void setPositionOnRoad() {
        Road road = new Road();
        assertEquals(0, road.positionOnRoad);
    }

    @Test
    void getRoad1() {
        Road road = new Road();
        assertEquals("Road 1", road.road1 );
    }

    @Test
    void getRoad2() {
        Road road = new Road();
        assertEquals("Road 2", road.road2);
    }

}