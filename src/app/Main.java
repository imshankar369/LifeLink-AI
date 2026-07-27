package app;

import ai.AccidentPredictionAI;
import ai.DriverMonitoringAI;

import model.Driver;
import model.Vehicle;

public class Main {

    public static void main(String[] args) {

        Driver driver =
                new Driver(
                        "D001",
                        "Shibshankar Mondal",
                        22,
                        "01700000000",
                        "O+",
                        "DL-1001",
                        4,
                        true
                );

        Vehicle vehicle =
                new Vehicle(
                        "V001",
                        "DHK-12345",
                        "Car",
                        110,
                        23.8103,
                        90.4125,
                        "Lane-2",
                        true
                );

        driver.displayInfo();

        System.out.println();

        vehicle.displayVehicle();

        System.out.println();

        DriverMonitoringAI monitor =
                new DriverMonitoringAI();

        monitor.monitorDriver(driver);

        System.out.println();

        AccidentPredictionAI ai =
                new AccidentPredictionAI(vehicle, driver);

        ai.analyze();
    }
}
