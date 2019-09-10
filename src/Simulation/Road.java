package Simulation;

public class Road extends Car { //Road class extends Car class

    int roadLength = 5; //index 0 to 4

    public Road() { //Road method for determing which road car is on
        this.road1 = road1;
        this.road2 = road2;
        if (positionOnRoad == 5) { //if vehicle is at segment 5 on road, vehicle moves to road 2
            this.road1 = this.road2;
            System.out.println("Car is now travelling on " + road2 + " at segment" + positionOnRoad);
        }
    }

    public int roadLength() { //road length method for length of road
        int roadLength = 5;
        this.roadLength = roadLength;
        positionOnRoad = String.valueOf(roadLength).length(); //road length is 0, 1, 2, 3, 4
        return roadLength; //returns road length
    }

    /*get and set road length for Road class*/
    public void getRoadLength(int i) {
    }


    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }



    @Override /*Override annotations from Car class */
    public int getPositionOnRoad() {
        return super.getPositionOnRoad();
    }

    @Override
    public void setPositionOnRoad(int positionOnRoad) {
        super.setPositionOnRoad(positionOnRoad);
    }

    @Override
    public String getRoad2() {
        return super.getRoad2();
    }

    @Override
    public String getRoad1() {
        return super.getRoad1();
    }
}
