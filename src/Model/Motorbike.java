package Model;

import java.awt.*;

public class Motorbike extends Vehicle {

    /**
     * Instantiates a new Model.Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Motorbike(int speed, int positionOnRoad, int id, int vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }

    public void draw(Graphics motorbikeGraphics) {
        motorbikeGraphics.setColor(Color.YELLOW);
        motorbikeGraphics.fillRect(this.positionOnRoad, 10, this.vehicleBreadth, (int) this.vehicleLength);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = (float) (0.5 * 4);
    }

}
