package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest() { //Car class test for road objects and getters
        Car car = new Car(1, 0, 1, 4);
        car.setSpeed(3);
        car.setPositionOnRoad(2);
        car.setId(3);
        car.setVehicleLength(6);
        car.setVehicleBreadth(3); //breadth is always half of Car's length
        assertEquals(3, car.getSpeed());
        assertEquals(2, car.getPositionOnRoad());
        assertEquals(3, car.getId());
        assertEquals(6, car.getVehicleLength());
        assertEquals(3, car.getVehicleBreadth());
    }

}