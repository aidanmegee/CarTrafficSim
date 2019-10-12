package Simulation;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    public ArrayList<Road> roads = new ArrayList<>();
    @Test
    void trafficLightTest() {
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.setLightPositionOnRoad(24);
        trafficLight.setCurrentState(TrafficLight.trafficLightState.RED);
        assertEquals(TrafficLight.trafficLightState.RED, trafficLight.getCurrentState());
        assertEquals(24, trafficLight.getLightPositionOnRoad());
    }

    @Test
    void operate() throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.operate();
        //TODO assertEquals for trafficlight enum values
    }

    @Test
    void changeRoad() {
        Road connectingRoad = new Road(1, 30);
        TrafficLight trafficLight = new TrafficLight(30);
        trafficLight.changeRoad();
        roads.add(connectingRoad);
        assertEquals(1, connectingRoad.getRoadNumber(), connectingRoad.getRoadLength());
    }
}
