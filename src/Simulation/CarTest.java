package Simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class carTest {


    @Test
    void CarTest() { //Car class test for road objects and getters
        Car car = new Car(1, 0, 1, 2, 1);
        car.setSpeed(3);
        car.setPositionOnRoad(2);
        car.setId(3);
        car.setVehicleLength(4);
        car.setVehicleBreadth(2); //car breadth is half of its length
        assertEquals(3, car.getSpeed());
        assertEquals(2, car.getPositionOnRoad());
        assertEquals(3, car.getId());
        assertEquals(4, car.getVehicleLength());
        assertEquals(2, car.getVehicleBreadth());

    }

//    @Test
//    void carMove() { //tests method to change car position from 0 to 1
//        car car = new car(3, 2, 3, 4, 2);
//        //for loop to call carMove() method each time car is on a road and traffic lights are not red/orange
//        assertEquals(1, car.getPositionOnRoad());
//
//
//    }

}