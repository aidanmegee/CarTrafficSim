package Simulation;

public class Vehicle { //Car class

    //int speed variable to get user input "Scanner speed = new Scanner()" to determine if vehicle goes from segment 1-2 or segment 1-4 etc
    private int positionOnRoad; //index 0 for car position start
    private int id;
    private int vehicleLength;
    private int vehicleBreadth;
    //array for vehicle types??

    public Vehicle(int id, int positionOnRoad, int vehicleLength, int vehicleBreadth) {
        this.id = id;
        this.positionOnRoad = positionOnRoad;
        this.vehicleLength = vehicleLength;
        this.vehicleBreadth = vehicleBreadth;
    }

    public

    /*setters and getters for car class*/

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public int getId() {
        return id;
    }

    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void carMove() {
        this.positionOnRoad += 1;
    }


}
