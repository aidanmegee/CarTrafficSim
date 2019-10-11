package Simulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    void roadTest() {
        Road road = new Road(0, 5);
        road.setRoadNumber(1);
        road.setRoadLength(10);
        assertEquals(1, road.getRoadNumber());
        assertEquals(10, road.getRoadLength());
    }

    @Test
    void addVehicle() {
        Random random = new Random();
        int randomVehicle = random.nextInt(3);
        ArrayList<Vehicle> currentVehicles = new ArrayList<>();
        switch (randomVehicle) {
            case 0:
                currentVehicles.add(new Car(1, 0, 1, 2));
                break;
            case 1:
                currentVehicles.add(new Motorbike(1, 0, 2, 2));
                break;
            case 2:
                currentVehicles.add(new Bus(1, 0, 3, 2));
                break;
        }
        System.out.println(currentVehicles);
    }

    @Test
    void moveVehicle() {

    }
}