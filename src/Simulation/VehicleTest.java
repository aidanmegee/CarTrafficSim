package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {



    @Test
    void carTest() { //Car class test for road objects and getters
        Vehicle vehicle = new Vehicle(3, 2, 3, 4, 2);

        assertEquals(0, car.getPositionOnRoad());
        assertEquals(1, car.getId());

    }

    @Test
    void carMove() { //tests method to change car position from 0 to 1
        Car car = new Car(1);
        car.carMove();
        assertEquals(1, car.getPositionOnRoad());




    }

}