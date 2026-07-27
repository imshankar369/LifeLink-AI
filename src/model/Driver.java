package model;

public class Driver extends Person {

    private String licenseNumber;
    private int drivingExperience;
    private boolean drowsy;

    public Driver(String id, String name, int age,
                  String phoneNumber, String bloodGroup,
                  String licenseNumber,
                  int drivingExperience,
                  boolean drowsy) {

        super(id, name, age, phoneNumber, bloodGroup);

        this.licenseNumber = licenseNumber;
        this.drivingExperience = drivingExperience;
        this.drowsy = drowsy;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public boolean isDrowsy() {
        return drowsy;
    }

    public void setDrowsy(boolean drowsy) {
        this.drowsy = drowsy;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("License      : " + licenseNumber);
        System.out.println("Experience   : " + drivingExperience + " years");
        System.out.println("Drowsy       : " + drowsy);
    }
}
