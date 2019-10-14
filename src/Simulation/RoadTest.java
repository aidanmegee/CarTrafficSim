package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {


    @Test
    void roadTest() {
        Road road = new Road(0, 30);
        road.setRoadNumber(1);
        road.setRoadLength(10);
        assertEquals(1, road.getRoadNumber());
        assertEquals(10, road.getRoadLength());
    }

    @Test
    void addVehicle() {
        Road road = new Road(1, 30);
        road.addVehicle();
        assertNotNull(road.getCurrentVehicles());

    }

    @Test
    void addTrafficLight() {
        Road road = new Road(1, 30);
        road.addTrafficLight();
        assertNotNull(road.getTrafficLights());
    }

    @Test
    void moveVehicle() {
        Road road = new Road(1, 24);
        road.addVehicle();
        road.moveVehicle();
        assertEquals(1, road.getCurrentVehicles().get(0).getSpeed());
    }

}
