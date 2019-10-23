import Model.Road;
import Model.TrafficLight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    public ArrayList<Road> roads = new ArrayList<>();

    @Test
    void trafficLightTest() {
        TrafficLight trafficLight = new TrafficLight(29);
        trafficLight.setLightPositionOnRoad(24);
        trafficLight.setCurrentState(TrafficLight.trafficLightState.RED);
        assertEquals(TrafficLight.trafficLightState.RED, trafficLight.getCurrentState());
        assertEquals(24, trafficLight.getLightPositionOnRoad());
    }

    @Test
    void operate() throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight(29);
        trafficLight.operate();
        //TODO assertEquals for trafficlight enum values
    }

}
