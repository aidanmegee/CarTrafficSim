package Simulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    public ArrayList<Road> connectingRoads = new ArrayList<>();
    public ArrayList<Vehicle> currentVehicles = new ArrayList<>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<>(1);

    @Test
    void roadTest() {
        Road road = new Road(0, 30, 12, 10, 10, 10, 50, 10);
        road.setRoadNumber(1);
        road.setRoadLength(10);
        road.setRoadWidth(25);
        assertEquals(1, road.getRoadNumber());
        assertEquals(10, road.getRoadLength());
        assertEquals(25, road.getRoadWidth());
    }

}
