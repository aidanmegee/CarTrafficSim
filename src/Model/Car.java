package Model;

import java.awt.*;

public class Car extends Vehicle {

    //car graphics draw in Model.Car class

    /**
     * Instantiates a new Model.Car
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */

    public Car(int speed, int positionOnRoad, int id, int vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }

    void drawCar(Graphics carGraphics) {
        carGraphics.setColor(Color.CYAN);
        carGraphics.fillRect(positionOnRoad, 10, (int) getVehicleBreadth(), (int) vehicleLength);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = 4;
    }

}
