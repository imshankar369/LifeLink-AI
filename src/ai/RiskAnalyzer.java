package ai;

public class RiskAnalyzer {

    public String calculateRisk(double speed, boolean drowsy, boolean laneDeparture) {

        if (speed > 100 && drowsy && laneDeparture) {
            return "CRITICAL";
        }

        if (speed > 90 && (drowsy || laneDeparture)) {
            return "HIGH";
        }

        if (speed > 70) {
            return "MEDIUM";
        }

        return "LOW";
    }

}
