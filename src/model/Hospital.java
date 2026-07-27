package model;

public class Hospital {

    private String hospitalName;
    private String address;
    private boolean traumaCenter;
    private int availableBeds;

    public Hospital(String hospitalName,
                    String address,
                    boolean traumaCenter,
                    int availableBeds) {

        this.hospitalName = hospitalName;
        this.address = address;
        this.traumaCenter = traumaCenter;
        this.availableBeds = availableBeds;
    }

    public void displayHospitalInfo() {

        System.out.println("Hospital : " + hospitalName);
        System.out.println("Address  : " + address);
        System.out.println("Trauma   : " + traumaCenter);
        System.out.println("Beds     : " + availableBeds);

    }

}
