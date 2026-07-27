package ai;

import model.Vehicle;
import model.Driver;

public class AccidentPredictionAI implements AIModel {

    private Vehicle vehicle;
    private Driver driver;

    public AccidentPredictionAI(Vehicle vehicle, Driver driver) {

        this.vehicle = vehicle;
        this.driver = driver;

    }

    @Override
    public void analyze() {

        System.out.println("========== AI Accident Prediction ==========");

        if (vehicle.getSpeed() > 100 && driver.isDrowsy()) {

            System.out.println("Prediction : Accident Highly Possible");
            System.out.println("Risk Level : CRITICAL");

        }

        else if (vehicle.getSpeed() > 80) {

            System.out.println("Prediction : Drive Carefully");
            System.out.println("Risk Level : HIGH");

        }

        else {

            System.out.println("Prediction : Safe Driving");
            System.out.println("Risk Level : LOW");

        }

    }

}
