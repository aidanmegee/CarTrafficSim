package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {



    @Test
    void carTest() { //Car class test for road objects and getters
        Car car = new Car(1);
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