package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {


    @Test
    void carTest() { //Car class test for road objects and getters
        Vehicle vehicle = new Vehicle(3, 2, 3, 4, 2);
        vehicle.setSpeed(3);
        vehicle.setPositionOnRoad(2);
        vehicle.setId(3);
        vehicle.setVehicleLength(4);
        vehicle.setVehicleBreadth(2); //car breadth is half of its length
        assertEquals(3, vehicle.getSpeed());
        assertEquals(2, vehicle.getPositionOnRoad());
        assertEquals(3, vehicle.getId());
        assertEquals(4, vehicle.getVehicleLength());
        assertEquals(2, vehicle.getVehicleBreadth());

    }

    @Test
    void vehicleMove() { //tests method to change car position from 0 to 1
        Vehicle vehicle = new Vehicle(3, 2, 3, 4, 2);
        vehicle.vehicleMove();
        //for loop to call vehicleMove() method each time vehicle is on a road and traffic lights are not red/orange
        assertEquals(1, vehicle.getPositionOnRoad());


    }

}