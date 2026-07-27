package sensor;

public class SpeedSensor {

    private double speed;

    public SpeedSensor(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void displaySpeed() {
        System.out.println("Current Speed : " + speed + " km/h");
    }

}
