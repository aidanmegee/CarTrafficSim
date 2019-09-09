public class Car {

    int positionOnRoad = 0; //index 0 for car position start
    int roadLength = String.valueOf(10).length();
    String vehicle = "Car";
    String road1 = "Road 1";
    String road2 = "Road 2";
    boolean carMoving = false;

    public Car() {

    }

    /*setters and getters for car class*/

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public int getRoadLength() {
        return roadLength;
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

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }

    private boolean isCarMoving() { //check if car is moving
        return this.carMoving;
    }

    public void carLocation(String road1, String road2, int positionOnRoad, int roadLength, boolean carMoving) {
        this.road1 = road1;
        this.road2 = road2;
        this.positionOnRoad = positionOnRoad;
        this.roadLength = roadLength;
        this.carMoving = carMoving;


    }





}
