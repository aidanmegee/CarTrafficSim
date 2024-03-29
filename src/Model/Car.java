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

    public void drawCar(Graphics carGraphics) {
        int carX = 0;
        int carY = 3;
        carGraphics.setColor(Color.CYAN);
        carGraphics.fillRect(carX, carY, vehicleBreadth, (int) vehicleLength);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = 4;
    }

}
