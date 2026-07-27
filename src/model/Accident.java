package model;

public class Accident {

    private String accidentId;
    private String accidentType;
    private double impactForce;
    private String location;
    private boolean airbagDeployed;

    public Accident(String accidentId,
                    String accidentType,
                    double impactForce,
                    String location,
                    boolean airbagDeployed) {

        this.accidentId = accidentId;
        this.accidentType = accidentType;
        this.impactForce = impactForce;
        this.location = location;
        this.airbagDeployed = airbagDeployed;
    }

    public void displayAccidentInfo() {

        System.out.println("Accident ID : " + accidentId);
        System.out.println("Type        : " + accidentType);
        System.out.println("Impact      : " + impactForce);
        System.out.println("Location    : " + location);
        System.out.println("Airbag      : " + airbagDeployed);

    }

}
