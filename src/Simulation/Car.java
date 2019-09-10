package Simulation;

public class Car { //Car class

    int positionOnRoad = 0; //index 0 for car position start
    String vehicle = "Car";
    String road1 = "Road 1";
    String road2 = "Road 2";
    public boolean carMoving = false; //sets vehicle to not moving at first

    /*setters and getters for car class*/

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getRoad1() {
        return road1;
    }

    public String getRoad2() {
        return road2;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setRoad1(String road1) {
        this.road1 = road1;
    }

    public void setRoad2(String road2) {
        this.road2 = road2;
    }


    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }

    public boolean isCarMoving(boolean b) { //check if car is moving
        return isCarMoving(false);
    }


    public void carMove(String road1, String road2, String vehicle, int positionOnRoad, boolean carMoving) {
        this.road1 = road1;
        this.road2 = road2;
        this.vehicle = vehicle;
        this.positionOnRoad = positionOnRoad;
        this.carMoving = carMoving;

        positionOnRoad = 0; //initial position on road
        System.out.println(vehicle + " is positioned at " + road1 + " on segment " + positionOnRoad);
        if(!carMoving) { //checks if carMoving is not false
            System.out.println(vehicle + " is now positioned at " + road1 + " on segment " + positionOnRoad);//prints new position on road
            ++positionOnRoad; //increment position on road
        }
        if (positionOnRoad == 5) {
            System.out.println(vehicle + " is now positioned at " + road2 + " on segment " + positionOnRoad); //if vehicle is at position 5, move to next road
        }






    }





}
