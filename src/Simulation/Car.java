package Simulation;

public class Car { //Car class

    private int positionOnRoad = 0; //index 0 for car position start
    private int id = 1;

    public Car(int id) {
        this.id = id;
    }

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
