package ai;

public class EmergencyDecisionAI {

    public void makeDecision(String riskLevel) {

        switch (riskLevel) {

            case "CRITICAL":

                System.out.println("Dispatch Ambulance");
                System.out.println("Notify Police");
                System.out.println("Notify Hospital");
                break;

            case "HIGH":

                System.out.println("Send Warning Notification");
                break;

            default:

                System.out.println("No Emergency Action Required");

        }

    }

}
