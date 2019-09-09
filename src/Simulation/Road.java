package Simulation;

public class Road extends Car {

    private int roadLength;

    /*get and set road length*/
    public void getRoadLength(int i) {
    }


    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public int roadLength() {
        int roadLength = 5;
        this.roadLength = roadLength;
        roadLength = String.valueOf(5).length(); //road length is 0, 1, 2, 3, 4
        return roadLength;
    }
    public Road(String road1, String road2) {
        this.road1 = road1;
        this.road2 = road2;
        if (positionOnRoad == 5) {
            this.road1 = this.road2;
            System.out.println("Car is now travelling on " + road2);
        }

    }

    @Override
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
