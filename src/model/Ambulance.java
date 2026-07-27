package model;

public class Ambulance {

    private String ambulanceId;
    private String driverName;
    private boolean available;

    public Ambulance(String ambulanceId,
                     String driverName,
                     boolean available) {

        this.ambulanceId = ambulanceId;
        this.driverName = driverName;
        this.available = available;
    }

    public void dispatch() {

        System.out.println("Ambulance dispatched successfully.");

    }

}
