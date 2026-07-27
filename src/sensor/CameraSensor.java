package sensor;

public class CameraSensor {

    private boolean obstacleDetected;

    public CameraSensor(boolean obstacleDetected) {
        this.obstacleDetected = obstacleDetected;
    }

    public boolean isObstacleDetected() {
        return obstacleDetected;
    }

    public void detectObstacle() {

        if (obstacleDetected) {
            System.out.println("Obstacle Detected Ahead");
        } else {
            System.out.println("Road Clear");
        }

    }

}
