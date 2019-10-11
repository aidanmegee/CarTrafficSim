package Simulation;

public abstract class Vehicle { //Car class

    //int speed variable to get user input "Scanner speed = new Scanner()" to determine if vehicle goes from segment 1-2 or segment 1-4 etc
    private int speed;
    private int positionOnRoad; //index 0 for car position start
    private int id;
    private int vehicleLength;
    private int vehicleBreadth;
    //array for vehicle types??
    /**
     * Instantiates a new Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleLength  the vehicle length
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Vehicle(int speed, int positionOnRoad, int id, int vehicleLength, int vehicleBreadth) {
        this.speed = speed;
        this.positionOnRoad = positionOnRoad;
        this.id = id;
        this.vehicleLength = vehicleLength;
        this.vehicleBreadth = vehicleBreadth;
    }

    /*setters and getters for car class*/
    public int getSpeed() {
        return speed;
    }

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public int getId() {
        return id;
    }

    public int getVehicleLength() {
        return vehicleLength;
    }

    public int getVehicleBreadth() {
        return vehicleBreadth;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicleLength(int vehicleLength) {
        this.vehicleLength = vehicleLength;
    }

    public void setVehicleBreadth(int vehicleBreadth) {
        this.vehicleBreadth = vehicleBreadth;
    }

}
