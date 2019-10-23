import Model.Motorbike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {

    @Test
    void motorbikeTest() { //motorbike class test for road objects and getters
        Motorbike motorbike = new Motorbike(1, 0, 1, 4, 10);
        motorbike.setSpeed(5);
        motorbike.setPositionOnRoad(1);
        motorbike.setId(2);
        motorbike.setVehicleLength(4);
        motorbike.setVehicleBreadth(2); //breadth is always half of Model.Car's length
        assertEquals(5, motorbike.getSpeed());
        assertEquals(1, motorbike.getPositionOnRoad());
        assertEquals(2, motorbike.getId());
        assertEquals(4, motorbike.getVehicleLength());
        assertEquals(2, motorbike.getVehicleBreadth());

    }
}