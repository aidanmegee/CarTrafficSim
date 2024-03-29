package Model;

import java.awt.*;

public class Bus extends Vehicle {

    /**
     * Instantiates a new Model.Bus
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */

    public Bus(int speed, int positionOnRoad, int id, int vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }

    public void draw(Graphics busGraphics) {
        busGraphics.setColor(Color.YELLOW);
        busGraphics.fillRect(this.positionOnRoad, 10, this.vehicleBreadth, (int) this.vehicleLength);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = 3 * 4;
    }

}
