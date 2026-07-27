package sensor;

public class LaneSensor {

    private boolean laneDeparture;

    public LaneSensor(boolean laneDeparture) {
        this.laneDeparture = laneDeparture;
    }

    public boolean isLaneDeparture() {
        return laneDeparture;
    }

    public void displayLaneStatus() {

        if (laneDeparture) {
            System.out.println("Warning : Lane Departure Detected");
        } else {
            System.out.println("Lane Status : Safe");
        }

    }

}
