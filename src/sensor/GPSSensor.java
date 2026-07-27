package sensor;

public class GPSSensor {

    private double latitude;
    private double longitude;

    public GPSSensor(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;

    }

    public void showLocation() {

        System.out.println("Latitude  : " + latitude);
        System.out.println("Longitude : " + longitude);

    }

}
