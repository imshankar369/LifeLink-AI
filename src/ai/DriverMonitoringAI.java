package ai;

import model.Driver;

public class DriverMonitoringAI {

    public void monitorDriver(Driver driver) {

        if (driver.isDrowsy()) {

            System.out.println("AI Warning : Driver is Drowsy");
            System.out.println("Recommendation : Take a Break");

        }

        else {

            System.out.println("Driver Condition : Normal");

        }

    }

}
