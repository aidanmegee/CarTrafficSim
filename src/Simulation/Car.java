package Simulation;

public class Car { //Car class

    private int positionOnRoad; //index 0 for car position start
    private Road road1; //Road object
    private Road road2; //Road 2 objects

    public Car(int positionOnRoad, Road road1, Road road2) { //constructor for Car class
        this.positionOnRoad = positionOnRoad;
        this.road1 = road1;
        this.road2 = road2;
    }

    /*setters and getters for car class*/

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public Road getRoad1() {
        return road1;
    }

    public Road getRoad2() {
        return road2;
    }


    public void setRoad1(Road road1) {
        this.road1 = road1;
    }

    public void setRoad2(Road road2) {
        this.road2 = road2;
    }


    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }


    public void carMove(Road road1, Road road2, int positionOnRoad) {
        this.road1 = road1;
        this.road2 = road2;
        this.positionOnRoad = positionOnRoad;




    }


}
