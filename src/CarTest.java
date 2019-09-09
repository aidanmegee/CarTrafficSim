import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest() {
        Car car = new Car();
        car.setPositionOnRoad(0);
        car.setRoadLength(10);
        car.setRoad1("Road 1");
        car.setRoad2("Road 2");
        assertEquals(0, car.positionOnRoad);
        assertEquals(10, car.roadLength);
        assertEquals("Road 1", car.road1);
        assertEquals("Road 2", car.road2);
        assertEquals(0, car.getPositionOnRoad());
        assertEquals(10, car.getRoadLength());
        assertEquals("Road 1", car.getRoad1());
        assertEquals("Road 2", car.getRoad2());
    }



}