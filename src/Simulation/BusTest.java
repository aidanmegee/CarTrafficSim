package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    void busTest() { //bus class test for road objects and getters
        Bus bus = new Bus(1, 0, 1, 4, 2);
        bus.setSpeed(2);
        bus.setPositionOnRoad(3);
        bus.setId(4);
        bus.setVehicleLength(12);
        bus.setVehicleBreadth(2); //breadth is always half of Car's length
        assertEquals(2, bus.getSpeed());
        assertEquals(3, bus.getPositionOnRoad());
        assertEquals(4, bus.getId());
        assertEquals(12, bus.getVehicleLength());
        assertEquals(2, bus.getVehicleBreadth());

    }

}