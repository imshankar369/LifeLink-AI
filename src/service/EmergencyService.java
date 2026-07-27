package service;

import model.Accident;
import model.Hospital;
import model.PoliceStation;
import model.Ambulance;

public class EmergencyService {

    private NotificationService notificationService;
    private HospitalService hospitalService;
    private PoliceService policeService;
    private AmbulanceService ambulanceService;

    public EmergencyService() {

        notificationService = new NotificationService();
        hospitalService = new HospitalService();
        policeService = new PoliceService();
        ambulanceService = new AmbulanceService();

    }

    public void respondToAccident(Accident accident,
                                  Hospital hospital,
                                  PoliceStation policeStation,
                                  Ambulance ambulance) {

        System.out.println("\n========== EMERGENCY RESPONSE ==========\n");

        accident.displayAccidentInfo();

        ambulanceService.dispatchAmbulance(ambulance);

        hospitalService.contactHospital(hospital);

        policeService.notifyPolice(policeStation);

        notificationService.sendNotification(
                "Family",
                "Accident detected. Emergency services dispatched successfully."
        );

        System.out.println("\nEmergency Response Completed Successfully.");

    }

}
