package model;

public class Vehicle {

    private String vehicleId;
    private String vehicleNumber;
    private String vehicleType;

    private double speed;

    private double latitude;
    private double longitude;

    private String lane;

    private boolean engineRunning;

    public Vehicle(String vehicleId,
                   String vehicleNumber,
                   String vehicleType,
                   double speed,
                   double latitude,
                   double longitude,
                   String lane,
                   boolean engineRunning) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.speed = speed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.lane = lane;
        this.engineRunning = engineRunning;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLane() {
        return lane;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void displayVehicle() {

        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Number     : " + vehicleNumber);
        System.out.println("Type       : " + vehicleType);
        System.out.println("Speed      : " + speed + " km/h");
        System.out.println("GPS        : " + latitude + "," + longitude);
        System.out.println("Lane       : " + lane);
        System.out.println("Engine     : " + engineRunning);

    }

}
