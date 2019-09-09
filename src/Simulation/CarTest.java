package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest() {
        Car car = new Car();
        car.setPositionOnRoad(0); //Tests setters and getters for car class
        car.setVehicle("Car");
        car.setRoad1("Road 1");
        car.setRoad2("Road 2");
        assertEquals(0, car.positionOnRoad);
        assertEquals("Car", car.vehicle);
        assertEquals("Road 1", car.road1);
        assertEquals("Road 2", car.road2);
        assertEquals(0, car.getPositionOnRoad());
        assertEquals("Car", car.getVehicle());
        assertEquals("Road 1", car.getRoad1());
        assertEquals("Road 2", car.getRoad2());
    }



}